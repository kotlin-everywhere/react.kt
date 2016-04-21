package com.github.kotlin_everywhere.react

import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget

internal fun <T> jsObject(): T {
    return js("({})")
}


interface DOMAttribute {
    var key: Any?

    var accept: String?
    var acceptCharset: String?
    var accessKey: String?
    var action: String?
    var allowFullScreen: String?
    var allowTransparency: String?
    var alt: String?
    var async: String?
    var autoComplete: String?
    var autoFocus: Boolean?
    var autoPlay: String?
    var capture: String?
    var cellPadding: String?
    var cellSpacing: String?
    var challenge: String?
    var charSet: String?
    var checked: Boolean?
    var cite: String?
    var classID: String?
    var className: String?
    var colSpan: String?
    var cols: String?
    var content: String?
    var contentEditable: String?
    var contextMenu: String?
    var controls: String?
    var coords: String?
    var crossOrigin: String?
    var data: String?
    var dateTime: String?
    var default: String?
    var defer: String?
    var dir: String?
    var disabled: String?
    var download: String?
    var draggable: String?
    var encType: String?
    var form: String?
    var formAction: String?
    var formEncType: String?
    var formMethod: String?
    var formNoValidate: String?
    var formTarget: String?
    var frameBorder: String?
    var headers: String?
    var height: String?
    var hidden: String?
    var high: String?
    var href: String?
    var hrefLang: String?
    var htmlFor: String?
    var httpEquiv: String?
    var icon: String?
    var id: String?
    var inputMode: String?
    var integrity: String?
    var `is`: String?
    var keyParams: String?
    var keyType: String?
    var kind: String?
    var label: String?
    var lang: String?
    var list: String?
    var loop: String?
    var low: String?
    var manifest: String?
    var marginHeight: String?
    var marginWidth: String?
    var max: String?
    var maxLength: String?
    var media: String?
    var mediaGroup: String?
    var method: String?
    var min: String?
    var minLength: String?
    var multiple: String?
    var muted: String?
    var name: String?
    var noValidate: String?
    var nonce: String?
    var open: String?
    var optimum: String?
    var pattern: String?
    var placeholder: String?
    var poster: String?
    var preload: String?
    var profile: String?
    var radioGroup: String?
    var readOnly: String?
    var rel: String?
    var required: String?
    var reversed: String?
    var role: String?
    var rowSpan: String?
    var rows: String?
    var sandbox: String?
    var scope: String?
    var scoped: String?
    var scrolling: String?
    var seamless: String?
    var selected: String?
    var shape: String?
    var size: String?
    var sizes: String?
    var span: String?
    var spellCheck: String?
    var src: String?
    var srcDoc: String?
    var srcLang: String?
    var srcSet: String?
    var start: String?
    var step: String?
    var style: String?
    var summary: String?
    var tabIndex: String?
    var target: String?
    var title: String?
    var type: String?
    var useMap: String?
    var value: String?
    var width: String?
    var wmode: String?
    var wrap: String?

    var onKeyDown: ((e: SyntheticKeyboardEvent) -> Unit)?
    var onKeyPress: ((e: SyntheticKeyboardEvent) -> Unit)?
    var onKeyUp: ((e: SyntheticKeyboardEvent) -> Unit)?

    var onFocus: ((e: SyntheticFocusEvent) -> Unit)?
    var onBlur: ((e: SyntheticFocusEvent) -> Unit)?

    var onChange: ((e: SyntheticEvent) -> Unit)?
    var onInput: ((e: SyntheticEvent) -> Unit)?
    var onSubmit: ((e: SyntheticEvent) -> Unit)?

    var onClick: ((e: SyntheticMouseEvent) -> Unit)?
    var onContextMenu: ((e: SyntheticMouseEvent) -> Unit)?
    var onDoubleClick: ((e: SyntheticMouseEvent) -> Unit)?
    var onDrag: ((e: SyntheticMouseEvent) -> Unit)?
    var onDragEnd: ((e: SyntheticMouseEvent) -> Unit)?
    var onDragEnter: ((e: SyntheticMouseEvent) -> Unit)?
    var onDragExit: ((e: SyntheticMouseEvent) -> Unit)?
    var onDragLeave: ((e: SyntheticMouseEvent) -> Unit)?
    var onDragOver: ((e: SyntheticMouseEvent) -> Unit)?
    var onDragStart: ((e: SyntheticMouseEvent) -> Unit)?
    var onDrop: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseDown: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseEnter: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseLeave: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseMove: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseOut: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseOver: ((e: SyntheticMouseEvent) -> Unit)?
    var onMouseUp: ((e: SyntheticMouseEvent) -> Unit)?
}

@native
interface SyntheticEvent {
    val bubbles: Boolean
    val cancelable: Boolean
    val currentTarget: EventTarget
    val defaultPrevented: Boolean
    val eventPhase: Int
    val isTrusted: Boolean
    val nativeEvent: Event
    fun preventDefault()
    fun isDefaultPrevented(): Boolean
    fun stopPropagation()
    fun isPropagationStopped(): Boolean
    val target: EventTarget
    val timeStamp: Int
    val type: String
}

@native
interface SyntheticKeyboardEvent : SyntheticEvent {
    val altKey: Boolean
    val charCode: Int
    val ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    val key: String
    val keyCode: Int
    val locale: String
    val location: Int
    val metaKey: Boolean
    val repeat: Boolean
    val shiftKey: Boolean
    val which: Int
}

@native
interface SyntheticMouseEvent : SyntheticEvent {
    val altKey: Boolean
    val button: Int
    val buttons: Int
    val clientX: Int
    val clientY: Int
    val ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    val metaKey: Boolean
    val pageX: Int
    val pageY: Int
    val relatedTarget: EventTarget
    val screenX: Number
    val screenY: Number
    val shiftKey: Boolean
}

@native
interface SyntheticFocusEvent : SyntheticEvent {
    val relatedTarget: EventTarget
}
