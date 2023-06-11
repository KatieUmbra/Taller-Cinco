package taller.cinco.swing.dsl

import javax.swing.JButton
import javax.swing.JLabel

fun JButton.bounds(
    x: Int,
    y: Int, width
    : Int, height
    : Int
) = setBounds(x, y, width, height)

fun JLabel.bounds(
    x: Int,
    y: Int, width
    : Int, height
    : Int
) = setBounds(x, y, width, height)
