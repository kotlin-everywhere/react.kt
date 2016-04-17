package com.github.kotlin_everywhere.react.test

import com.github.kotlin_everywhere.react.Div
import com.github.kotlin_everywhere.react.ReactDOM
import com.github.kotlin_everywhere.react.stateless
import org.junit.Test
import org.w3c.dom.Element
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
        val HelloWorld = stateless {
            Div { +"Hello, World!" }
        }

        ReactDOM.render(HelloWorld(), fixture)
        assertEquals(1, fixture.childElementCount)
        assertEquals("Hello, World!", fixture.children().first().textContent)
    }
}