package com.github.kotlin_everywhere.react

import org.w3c.dom.Element

interface ReactElement

@native
object React {
    fun createElement(elementName: String, prop: Any?, vararg children: Any?): ReactElement
}

@native
object ReactDOM {
    fun render(reactElement: ReactElement, element: Element)
}