package com.github.kotlin_everywhere.react.test

import com.github.kotlin_everywhere.react.classNames
import org.junit.Test
import kotlin.test.assertEquals

class DomTest {
    @Test
    fun testClassNames() {
        assertEquals("", classNames())
        assertEquals("true", classNames("true" to true))
        assertEquals("", classNames("false" to false))
        assertEquals("true true2", classNames("true" to true, "true2" to true))
        assertEquals("true true2", classNames("true" to true, "false" to false, "true2" to true))
    }
}
