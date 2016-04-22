package com.github.kotlin_everywhere.react.test

import com.github.kotlin_everywhere.react.*
import org.junit.Test
import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document
import kotlin.dom.children
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IntegrationTest {
    val fixture: Element
        get() = document.getElementById("qunit-fixture")!!

    @Test
    fun testRender() {
        ReactDOM.render(Div { +"Hello, World!" }, fixture)
        assertEquals(1, fixture.childElementCount)
        assertEquals("Hello, World!", fixture.children().first().textContent)
    }

    @Test
    fun testStateless() {
        val HelloWorld = stateless { Div { +"Hello, World!" } }

        ReactDOM.render(HelloWorld(), fixture)
        assertEquals(1, fixture.childElementCount)
        assertEquals("Hello, World!", fixture.children().first().textContent)
    }

    @Test
    fun testStatelessWithProps() {
        val Hello = stateless { data: HelloData -> Div { +"Hello, ${data.name}!" } }

        ReactDOM.render(Hello(HelloData(name = "John")), fixture)
        assertEquals(1, fixture.childElementCount)
        assertEquals("Hello, John!", fixture.children().first().textContent)

        // test children with key props
        ReactDOM.render(Div {
            +arrayOf("Bill", "Jane").map { Hello(it, HelloData(it)) }
        }, fixture)
        assertEquals(1, fixture.childElementCount)
        val div = fixture.children().first() as HTMLDivElement
        assertEquals(2, div.childElementCount)
        assertEquals("Hello, Bill!", div.children()[0].textContent)
        assertEquals("Hello, Jane!", div.children()[1].textContent)
    }

    @Test
    fun testComponent() {
        ReactDOM.render(Count.factory(CountProps(message = "Increase")), fixture)
        val div = fixture.children[0]!!
        val button = div.getElementsByTagName("button")[0]!! as HTMLButtonElement
        assertEquals("Increase", button.value)
        assertEquals("Count: 0", div.getElementsByTagName("span")[0]!!.textContent)
        button.click()
        assertEquals("Count: 1", div.getElementsByTagName("span")[0]!!.textContent)
    }

    @Test
    fun testDOMAttribute() {
        ReactDOM.render(
                Div({ id = "container" }) {
                    div({ className = "container-inner" }) {
                        a({ href = "#" }) { +"Link" }
                    }
                },
                fixture
        )
        val container = fixture.children[0]!!
        assertEquals("div", container.tagName.toLowerCase())
        assertEquals("container", container.id)

        val containerInner = container.children[0]!!
        assertEquals("container-inner", containerInner.className)

        val a = containerInner.children[0]!!
        assertEquals("#", a.getAttribute("href"))
        assertEquals("Link", a.textContent)
    }

    @Test
    fun testStoreSubscribe() {
        val store = object : Store<StoreState>(StoreState()) {
            fun setState(state: StoreState) {
                this.state = state
            }
        }

        var isSubscribeCalled = false;
        store.subscribe { isSubscribeCalled = true }
        assertFalse(isSubscribeCalled)
        store.setState(store.state)
        assertTrue(isSubscribeCalled)
    }

    @Test
    fun testStore() {
        val store = object : Store<StoreState>(StoreState("Bill")) {
        }

        val HelloWord = stateless(store) { data: StoreState -> Div { +"Hello, ${data.message}" } }

        ReactDOM.render(HelloWord(), fixture)
        assertEquals("Hello, Bill", fixture.textContent)
        assertEquals("Hello, Jane", fixture.textContent)
    }
}

data class HelloData(val name: String)

data class CountProps(val message: String)
data class CountState(val count: Int)
class Count(props: CountProps) : Component<CountProps, CountState>(props) {
    init {
        state = CountState(0)
    }

    override fun render(): ReactElement? {
        return Div {
            button({ value = props.message; onClick = { setState(state.copy(count = state.count + 1)) } })
            span { +"Count: ${state.count}" }
        }
    }

    companion object {
        val factory = Factory(::Count)
    }
}

data class StoreState(val message: String)
