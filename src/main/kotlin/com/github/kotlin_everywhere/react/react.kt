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

interface DataProps<T> {
    var data: T
}

class stateless<T>(private val component: (T) -> ReactElement?) {
    val propComponent = { prop: DataProps<T> ->
        component(prop.data)
    }

    operator fun invoke(data: T): ReactElement {
        val props = jsObject<DataProps<T>>()
        props.data = data
        return React.createElement(propComponent, props)
    }

    operator fun invoke(key: Any, data: T): ReactElement {
        val props = jsObject<DataRectProp<T>>()
        props.data = data
        props.key = key
        return React.createElement(propComponent, props)
    }
}

interface DataRectProp<T> : DataProps<T> {
    var key: Any
}

interface StoreComponentState<S : Any> {
    var storeState: S
}

interface StoreComponentProps<S : Any> {
    var store: Store<S>
    var component: (S) -> ReactElement?
}

class StoreComponent<P : StoreComponentProps<S>, S : Any>(props: P) : Component<P, StoreComponentState<S>>(props) {
    init {
        state = jsObject<StoreComponentState<S>>()
        state.storeState = props.store.state
        props.store.subscribe {
            val state = jsObject<StoreComponentState<S>>()
            state.storeState = props.store.state
            setState(state)
        }
    }

    override fun render(): ReactElement? {
        return props.component(state.storeState)
    }
}

fun <S : Any> stateless(store: Store<S>, component: (S) -> ReactElement?): () -> ReactElement {
    val props = jsObject<StoreComponentProps<S>>().apply { this.store = store; this.component = component }
    val constructor: (StoreComponentProps<S>) -> StoreComponent<StoreComponentProps<S>, S> = { props: StoreComponentProps<S> ->
        StoreComponent(props)
    }
    return {
        React.createElement(constructor, props)
    }
}
