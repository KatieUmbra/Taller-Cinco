package taller.cinco.swing.dsl

import java.awt.Container
import java.awt.LayoutManager
import javax.swing.JFrame
import javax.swing.WindowConstants.EXIT_ON_CLOSE

fun frame(
    title: String = "",
    visible: Boolean = false,
    init: JFrame.() -> Unit
): JFrame {
    val frame = JFrame(title)
    frame.init()
    frame.isVisible = visible
    frame.layout = null
    frame.defaultCloseOperation = EXIT_ON_CLOSE
    return frame
}

fun container(
    visible: Boolean = false,
    init: Container.() -> Unit = {}
): Container {
    val container = Container()
    container.isVisible = visible
    container.init()
    container.layout = null
    return container
}

fun JFrame.container(
    visible: Boolean = false,
    init: Container.() -> Unit = {}
) {
    val container = Container()
    container.isVisible = visible
    container.init()
    container.layout = null
    add(container)
}