package taller.cinco.figuras

import taller.cinco.figuras.ventanas.EsferaVentana
import java.awt.Container
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame

class Principal : JFrame(), ActionListener {
    init {
        inicio()
        title = "Figuras"
        size = Dimension(350, 160)
        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

    private lateinit var contenedor: Container
    private lateinit var cilindro: JButton
    private lateinit var esfera: JButton
    private lateinit var piramide: JButton

    private fun inicio() {
        isResizable = false
        contenedor = contentPane
        contenedor.layout = null

        cilindro = JButton("Cilindro")
        cilindro.setBounds(20, 50, 80, 23)
        cilindro.addActionListener(this)

        esfera = JButton("Esfera")
        esfera.setBounds(125, 50, 80, 23)
        esfera.addActionListener(this)

        piramide = JButton("Pirámide")
        piramide.setBounds(225, 50, 100, 23)
        piramide.addActionListener(this)

        contenedor.add(cilindro)
        contenedor.add(esfera)
        contenedor.add(piramide)
    }

    override fun actionPerformed(evento: ActionEvent?) {
        when (evento?.source) {
            esfera -> EsferaVentana().isVisible = true
            cilindro -> {}
            piramide -> {}
        }
    }
}