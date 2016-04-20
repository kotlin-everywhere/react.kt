package com.github.kotlin_everywhere.react

class Container {
    val children: MutableList<Any?> = mutableListOf()

    operator fun Any?.unaryPlus() {
        children.add(this)
    }


    fun a(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(A(props, init))
    }


    fun abbr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Abbr(props, init))
    }


    fun address(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Address(props, init))
    }


    fun area(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Area(props, init))
    }


    fun article(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Article(props, init))
    }


    fun aside(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Aside(props, init))
    }


    fun audio(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Audio(props, init))
    }


    fun b(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(B(props, init))
    }


    fun base(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Base(props, init))
    }


    fun bdi(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Bdi(props, init))
    }


    fun bdo(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Bdo(props, init))
    }


    fun big(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Big(props, init))
    }


    fun blockquote(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Blockquote(props, init))
    }


    fun body(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Body(props, init))
    }


    fun br(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Br(props, init))
    }


    fun button(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Button(props, init))
    }


    fun canvas(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Canvas(props, init))
    }


    fun caption(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Caption(props, init))
    }


    fun cite(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Cite(props, init))
    }


    fun code(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Code(props, init))
    }


    fun col(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Col(props, init))
    }


    fun colgroup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Colgroup(props, init))
    }


    fun data(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Data(props, init))
    }


    fun datalist(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Datalist(props, init))
    }


    fun dd(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Dd(props, init))
    }


    fun del(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Del(props, init))
    }


    fun details(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Details(props, init))
    }


    fun dfn(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Dfn(props, init))
    }


    fun dialog(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Dialog(props, init))
    }


    fun div(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Div(props, init))
    }


    fun dl(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Dl(props, init))
    }


    fun dt(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Dt(props, init))
    }


    fun em(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Em(props, init))
    }


    fun embed(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Embed(props, init))
    }


    fun fieldset(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Fieldset(props, init))
    }


    fun figcaption(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Figcaption(props, init))
    }


    fun figure(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Figure(props, init))
    }


    fun footer(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Footer(props, init))
    }


    fun form(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Form(props, init))
    }


    fun h1(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(H1(props, init))
    }


    fun h2(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(H2(props, init))
    }


    fun h3(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(H3(props, init))
    }


    fun h4(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(H4(props, init))
    }


    fun h5(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(H5(props, init))
    }


    fun h6(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(H6(props, init))
    }


    fun head(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Head(props, init))
    }


    fun header(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Header(props, init))
    }


    fun hgroup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Hgroup(props, init))
    }


    fun hr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Hr(props, init))
    }


    fun html(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Html(props, init))
    }


    fun i(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(I(props, init))
    }


    fun iframe(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Iframe(props, init))
    }


    fun img(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Img(props, init))
    }


    fun input(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Input(props, init))
    }


    fun ins(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Ins(props, init))
    }


    fun kbd(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Kbd(props, init))
    }


    fun keygen(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Keygen(props, init))
    }


    fun label(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Label(props, init))
    }


    fun legend(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Legend(props, init))
    }


    fun li(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Li(props, init))
    }


    fun link(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Link(props, init))
    }


    fun main(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Main(props, init))
    }


    fun map(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Map(props, init))
    }


    fun mark(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Mark(props, init))
    }


    fun menu(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Menu(props, init))
    }


    fun menuitem(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Menuitem(props, init))
    }


    fun meta(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Meta(props, init))
    }


    fun meter(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Meter(props, init))
    }


    fun nav(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Nav(props, init))
    }


    fun noscript(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Noscript(props, init))
    }


    fun `object`(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Object(props, init))
    }


    fun ol(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Ol(props, init))
    }


    fun optgroup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Optgroup(props, init))
    }


    fun option(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Option(props, init))
    }


    fun output(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Output(props, init))
    }


    fun p(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(P(props, init))
    }


    fun param(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Param(props, init))
    }


    fun picture(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Picture(props, init))
    }


    fun pre(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Pre(props, init))
    }


    fun progress(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Progress(props, init))
    }


    fun q(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Q(props, init))
    }


    fun rp(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Rp(props, init))
    }


    fun rt(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Rt(props, init))
    }


    fun ruby(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Ruby(props, init))
    }


    fun s(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(S(props, init))
    }


    fun samp(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Samp(props, init))
    }


    fun script(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Script(props, init))
    }


    fun section(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Section(props, init))
    }


    fun select(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Select(props, init))
    }


    fun small(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Small(props, init))
    }


    fun source(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Source(props, init))
    }


    fun span(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Span(props, init))
    }


    fun strong(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Strong(props, init))
    }


    fun style(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Style(props, init))
    }


    fun sub(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Sub(props, init))
    }


    fun summary(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Summary(props, init))
    }


    fun sup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Sup(props, init))
    }


    fun table(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Table(props, init))
    }


    fun tbody(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Tbody(props, init))
    }


    fun td(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Td(props, init))
    }


    fun textarea(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Textarea(props, init))
    }


    fun tfoot(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Tfoot(props, init))
    }


    fun th(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Th(props, init))
    }


    fun thead(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Thead(props, init))
    }


    fun time(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Time(props, init))
    }


    fun title(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Title(props, init))
    }


    fun tr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Tr(props, init))
    }


    fun track(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Track(props, init))
    }


    fun u(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(U(props, init))
    }


    fun ul(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Ul(props, init))
    }


    fun `var`(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Var(props, init))
    }


    fun video(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Video(props, init))
    }


    fun wbr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null) {
        children.add(Wbr(props, init))
    }


}

fun A(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("a", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("a", elementProps)
    }
}


fun Abbr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("abbr", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("abbr", elementProps)
    }
}


fun Address(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("address", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("address", elementProps)
    }
}


fun Area(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("area", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("area", elementProps)
    }
}


fun Article(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("article", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("article", elementProps)
    }
}


fun Aside(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("aside", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("aside", elementProps)
    }
}


fun Audio(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("audio", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("audio", elementProps)
    }
}


fun B(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("b", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("b", elementProps)
    }
}


fun Base(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("base", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("base", elementProps)
    }
}


fun Bdi(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("bdi", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("bdi", elementProps)
    }
}


fun Bdo(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("bdo", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("bdo", elementProps)
    }
}


fun Big(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("big", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("big", elementProps)
    }
}


fun Blockquote(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("blockquote", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("blockquote", elementProps)
    }
}


fun Body(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("body", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("body", elementProps)
    }
}


fun Br(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("br", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("br", elementProps)
    }
}


fun Button(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("button", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("button", elementProps)
    }
}


fun Canvas(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("canvas", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("canvas", elementProps)
    }
}


fun Caption(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("caption", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("caption", elementProps)
    }
}


fun Cite(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("cite", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("cite", elementProps)
    }
}


fun Code(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("code", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("code", elementProps)
    }
}


fun Col(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("col", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("col", elementProps)
    }
}


fun Colgroup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("colgroup", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("colgroup", elementProps)
    }
}


fun Data(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("data", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("data", elementProps)
    }
}


fun Datalist(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("datalist", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("datalist", elementProps)
    }
}


fun Dd(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("dd", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("dd", elementProps)
    }
}


fun Del(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("del", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("del", elementProps)
    }
}


fun Details(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("details", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("details", elementProps)
    }
}


fun Dfn(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("dfn", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("dfn", elementProps)
    }
}


fun Dialog(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("dialog", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("dialog", elementProps)
    }
}


fun Div(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("div", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("div", elementProps)
    }
}


fun Dl(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("dl", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("dl", elementProps)
    }
}


fun Dt(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("dt", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("dt", elementProps)
    }
}


fun Em(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("em", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("em", elementProps)
    }
}


fun Embed(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("embed", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("embed", elementProps)
    }
}


fun Fieldset(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("fieldset", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("fieldset", elementProps)
    }
}


fun Figcaption(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("figcaption", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("figcaption", elementProps)
    }
}


fun Figure(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("figure", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("figure", elementProps)
    }
}


fun Footer(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("footer", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("footer", elementProps)
    }
}


fun Form(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("form", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("form", elementProps)
    }
}


fun H1(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("h1", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("h1", elementProps)
    }
}


fun H2(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("h2", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("h2", elementProps)
    }
}


fun H3(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("h3", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("h3", elementProps)
    }
}


fun H4(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("h4", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("h4", elementProps)
    }
}


fun H5(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("h5", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("h5", elementProps)
    }
}


fun H6(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("h6", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("h6", elementProps)
    }
}


fun Head(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("head", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("head", elementProps)
    }
}


fun Header(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("header", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("header", elementProps)
    }
}


fun Hgroup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("hgroup", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("hgroup", elementProps)
    }
}


fun Hr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("hr", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("hr", elementProps)
    }
}


fun Html(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("html", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("html", elementProps)
    }
}


fun I(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("i", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("i", elementProps)
    }
}


fun Iframe(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("iframe", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("iframe", elementProps)
    }
}


fun Img(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("img", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("img", elementProps)
    }
}


fun Input(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("input", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("input", elementProps)
    }
}


fun Ins(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("ins", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("ins", elementProps)
    }
}


fun Kbd(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("kbd", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("kbd", elementProps)
    }
}


fun Keygen(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("keygen", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("keygen", elementProps)
    }
}


fun Label(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("label", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("label", elementProps)
    }
}


fun Legend(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("legend", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("legend", elementProps)
    }
}


fun Li(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("li", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("li", elementProps)
    }
}


fun Link(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("link", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("link", elementProps)
    }
}


fun Main(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("main", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("main", elementProps)
    }
}


fun Map(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("map", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("map", elementProps)
    }
}


fun Mark(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("mark", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("mark", elementProps)
    }
}


fun Menu(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("menu", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("menu", elementProps)
    }
}


fun Menuitem(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("menuitem", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("menuitem", elementProps)
    }
}


fun Meta(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("meta", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("meta", elementProps)
    }
}


fun Meter(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("meter", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("meter", elementProps)
    }
}


fun Nav(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("nav", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("nav", elementProps)
    }
}


fun Noscript(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("noscript", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("noscript", elementProps)
    }
}


fun Object(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("object", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("object", elementProps)
    }
}


fun Ol(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("ol", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("ol", elementProps)
    }
}


fun Optgroup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("optgroup", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("optgroup", elementProps)
    }
}


fun Option(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("option", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("option", elementProps)
    }
}


fun Output(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("output", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("output", elementProps)
    }
}


fun P(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("p", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("p", elementProps)
    }
}


fun Param(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("param", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("param", elementProps)
    }
}


fun Picture(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("picture", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("picture", elementProps)
    }
}


fun Pre(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("pre", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("pre", elementProps)
    }
}


fun Progress(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("progress", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("progress", elementProps)
    }
}


fun Q(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("q", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("q", elementProps)
    }
}


fun Rp(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("rp", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("rp", elementProps)
    }
}


fun Rt(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("rt", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("rt", elementProps)
    }
}


fun Ruby(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("ruby", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("ruby", elementProps)
    }
}


fun S(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("s", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("s", elementProps)
    }
}


fun Samp(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("samp", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("samp", elementProps)
    }
}


fun Script(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("script", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("script", elementProps)
    }
}


fun Section(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("section", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("section", elementProps)
    }
}


fun Select(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("select", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("select", elementProps)
    }
}


fun Small(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("small", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("small", elementProps)
    }
}


fun Source(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("source", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("source", elementProps)
    }
}


fun Span(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("span", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("span", elementProps)
    }
}


fun Strong(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("strong", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("strong", elementProps)
    }
}


fun Style(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("style", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("style", elementProps)
    }
}


fun Sub(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("sub", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("sub", elementProps)
    }
}


fun Summary(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("summary", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("summary", elementProps)
    }
}


fun Sup(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("sup", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("sup", elementProps)
    }
}


fun Table(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("table", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("table", elementProps)
    }
}


fun Tbody(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("tbody", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("tbody", elementProps)
    }
}


fun Td(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("td", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("td", elementProps)
    }
}


fun Textarea(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("textarea", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("textarea", elementProps)
    }
}


fun Tfoot(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("tfoot", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("tfoot", elementProps)
    }
}


fun Th(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("th", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("th", elementProps)
    }
}


fun Thead(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("thead", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("thead", elementProps)
    }
}


fun Time(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("time", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("time", elementProps)
    }
}


fun Title(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("title", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("title", elementProps)
    }
}


fun Tr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("tr", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("tr", elementProps)
    }
}


fun Track(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("track", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("track", elementProps)
    }
}


fun U(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("u", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("u", elementProps)
    }
}


fun Ul(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("ul", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("ul", elementProps)
    }
}


fun Var(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("var", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("var", elementProps)
    }
}


fun Video(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("video", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("video", elementProps)
    }
}


fun Wbr(props: (DOMAttribute.() -> Unit)? = null, init: (Container.() -> Unit)? = null): ReactElement {
    val elementProps = if (props != null) jsObject<DOMAttribute>().apply { props() } else null

    return if (init != null) {
        React.createElement("wbr", elementProps, *Container().apply { init() }.children.toTypedArray())
    } else {
        React.createElement("wbr", elementProps)
    }
}

