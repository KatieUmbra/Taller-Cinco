package taller.cinco.figuras

import kotlin.math.PI
import kotlin.math.pow

private const val a = 1.333 * PI
private const val b = 4 * PI
private infix fun Number.pow(i: Number): Double = this.toDouble().pow(i.toDouble())

class Esfera(private val radio: Double) : FiguraGeometrica() {

    override var volumen: Double = calcularVolumen()
    override var superficie: Double = calcularSuperficie()

    fun calcularVolumen(): Double = a * (radio pow 3)
    fun calcularSuperficie(): Double = b * (radio pow 2)
}
