package com.github.kotlin_everywhere.react

import org.w3c.dom.Element

interface ReactElement

@native
object React {
    fun createElement(elementName: String, props: Any?, vararg children: Any?): ReactElement
    fun createElement(statelessComponent: () -> ReactElement?, props: Any?, vararg children: Any?): ReactElement
    fun <T> createElement(statelessComponent: (T) -> ReactElement?, props: T, vararg children: Any?): ReactElement
    fun <T> createElement(component: (T) -> Component<T, *>?, props: T, vararg children: Any?): ReactElement
}

fun <P, T : Component<P, *>> Factory(constructor: (P) -> T): (P) -> ReactElement {
    return { props ->
        React.createElement(constructor, props)
    }
}

@native
object ReactDOM {
    fun render(reactElement: ReactElement, element: Element)
}

@native("React.Component")
abstract class Component<P, S>(val props: P) {
    var state: S
    fun setState(state: S)

    abstract fun render(): ReactElement?
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