package com.github.kotlin_everywhere.react

import org.w3c.dom.events.Event

private fun <T> jsObject(): T {
    return js("({})")
}

class Container {
    val children: MutableList<Any?> = mutableListOf()

    operator fun Any?.unaryPlus() {
        children.add(this)
    }
}

interface DOMAttribute {
    // Generic
    var id: String?
    var className: String?

    // Input Elements
    var value: String?
    var onClick: ((Event) -> Unit)?

}

fun attr(body: DOMAttribute.() -> Unit): DOMAttribute {
    return jsObject<DOMAttribute>().apply { body() }
}


operator fun String.invoke(props: DOMAttribute? = null, body: (Container.() -> Unit)? = null): ReactElement {
    return if (body != null) {
        React.createElement(this, props, *Container().apply { body() }.children.toTypedArray())
    } else {
        React.createElement(this, props)
    }
}
