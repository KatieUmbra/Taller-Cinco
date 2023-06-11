package taller.cinco.swing.dsl

import java.awt.Container
import java.awt.Dimension
import javax.swing.JFrame

fun JFrame.size(x: Int, y: Int) {
    this.size = Dimension(x, y)
}

fun Container.size(x: Int, y: Int) {
    this.size = Dimension(x, y)
}
