package com.github.kotlin_everywhere.react

import org.w3c.dom.Element

interface ReactElement

@native
object React {
    fun createElement(elementName: String, prop: Any?, vararg children: Any?): ReactElement
    fun createElement(statelessComponent: () -> ReactElement?, prop: Any?, vararg children: Any?): ReactElement
    fun <T> createElement(statelessComponent: (T) -> ReactElement?, prop: Any?, vararg children: Any?): ReactElement
}

@native
object ReactDOM {
    fun render(reactElement: ReactElement, element: Element)
}

fun stateless(component: () -> ReactElement?): () -> ReactElement {
    return {
        React.createElement(component, null)
    }
}

fun <T> stateless(component: (T) -> ReactElement?): (T) -> ReactElement {
    return {
        React.createElement(component, it)
    }
}