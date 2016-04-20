package com.github.kotlin_everywhere.react.test

import com.github.kotlin_everywhere.react.*
import org.junit.Test
import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document
import kotlin.dom.children
import kotlin.test.assertEquals

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
        val Hello = stateless { prop: HelloProp -> Div { +"Hello, ${prop.name}!" } }

        ReactDOM.render(Hello(HelloProp(name = "John")), fixture)
        assertEquals(1, fixture.childElementCount)
        assertEquals("Hello, John!", fixture.children().first().textContent)
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
}

data class HelloProp(val name: String)

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