package taller.cinco

import taller.cinco.swing.dsl.*

fun main(args: Array<String>) {
    val frame = frame {
        container {
            label("adsasdad")
            button("asdadsadds")
        }
    }
    frame.isVisible = true
}