package com.github.kotlin_everywhere.react

private fun <T> jsObject(): T {
    return js("({})")
}

class Container {
    val children: MutableList<Any?> = mutableListOf()

    operator fun String.unaryPlus() {
        children.add(this)
    }
}

fun Div(body: (Container.() -> Unit)? = null): ReactElement {
    if (body != null) {
        return React.createElement("div", null, *Container().apply { body() }.children.toTypedArray())
    } else {
        return React.createElement("div", null)
    }
}
