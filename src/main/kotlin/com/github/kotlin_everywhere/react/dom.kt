package com.github.kotlin_everywhere.react

import org.w3c.dom.events.Event

private fun <T> jsObject(): T {
    return js("({})")
}

class Container {
    val children: MutableList<Any?> = mutableListOf()

    operator fun String.unaryPlus() {
        children.add(this)
    }

    fun span(body: (Container.() -> Unit)?) {
        children.add(Span(body))
    }

    fun button(value: String?, onClick: ((e: Event) -> Unit)? = null) {
        children.add(Button(value = value, onClick=onClick))
    }
}

fun Div(body: (Container.() -> Unit)? = null): ReactElement {
    if (body != null) {
        return React.createElement("div", null, *Container().apply { body() }.children.toTypedArray())
    } else {
        return React.createElement("div", null)
    }
}

fun Span(body: (Container.() -> Unit)?): ReactElement {
    if (body != null) {
        return React.createElement("span", null, *Container().apply { body() }.children.toTypedArray())
    } else {
        return React.createElement("span", null)
    }
}

fun Button(value: String? = null, onClick: ((Event) -> Unit)? = null): ReactElement {
    val props = js("({})")
    props.value = value
    props.onClick = onClick
    return React.createElement("button", props)
}
