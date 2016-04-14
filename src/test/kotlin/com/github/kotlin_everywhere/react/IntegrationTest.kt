package com.github.kotlin_everywhere.react

import org.junit.Test
import kotlin.browser.document
import kotlin.test.assertEquals

class IntegrationTest {
    @Test
    fun testIntegration() {
        val fixture = document.getElementById("qunit-fixture")!!
        assertEquals("qunit-fixture", fixture.id)
    }
}