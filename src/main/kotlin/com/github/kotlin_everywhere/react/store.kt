package com.github.kotlin_everywhere.react

abstract class Store <T : Any>(state: T) {
    var state: T = state
        protected set(value) {
            field = value
            receivers.forEach {
                try {
                    it.invoke()
                } catch (e: Exception) {
                    console.error(e);
                }
            }
        }

    private val receivers = arrayListOf<() -> Unit>()

    fun subscribe(receiver: () -> Unit) {
        receivers.add(receiver)
    }
}

