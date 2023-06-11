package taller.cinco.swing.dsl

import java.awt.Container
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel

fun JFrame.button(text: String, init: JButton.() -> Unit = {}) {
    val button = JButton(text)
    button.init()
    this.add(button)
}

fun JFrame.label(text: String, init: JLabel.() -> Unit = {}) {
    val label = JLabel(text)
    label.init()
    this.add(label)
}

fun Container.button(text: String, init: JButton.() -> Unit = {}) {
    val button = JButton(text)
    button.init()
    this.add(button)
}

fun Container.label(text: String, init: JLabel.() -> Unit = {}) {
    val label = JLabel(text)
    label.init()
    this.add(label)
}