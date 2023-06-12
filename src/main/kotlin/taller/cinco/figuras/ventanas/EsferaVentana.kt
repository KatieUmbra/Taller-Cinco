package taller.cinco.figuras.ventanas

import taller.cinco.figuras.Esfera
import java.awt.Container
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class EsferaVentana : JFrame(), ActionListener {
    init {
        inicio()
        title = "Esfera"
        size = Dimension(280, 200)
        setLocationRelativeTo(null)
        isResizable = false
    }

    private lateinit var contenedor: Container
    private lateinit var radio: JLabel
    private lateinit var volumen: JLabel
    private lateinit var superficie: JLabel
    private lateinit var campoRadio: JTextField
    private lateinit var calcular: JButton

    private fun inicio() {
        contenedor = contentPane
        contenedor.layout = null
        radio = JLabel("Radio (cms)")
        radio.setBounds(20, 20, 135, 23)
        campoRadio = JTextField()
        campoRadio.setBounds(100, 20, 135, 23)
        calcular = JButton("Calcular")
        calcular.setBounds(100, 50, 135, 23)
        calcular.addActionListener(this)
        volumen = JLabel("Volumen (cm3)")
        volumen.setBounds(20, 90, 135, 23)
        superficie = JLabel("Superficie (cm2)")
        superficie.setBounds(20, 120, 135, 23)

        contenedor.add(radio)
        contenedor.add(campoRadio)
        contenedor.add(calcular)
        contenedor.add(volumen)
        contenedor.add(superficie)
    }

    override fun actionPerformed(evento: ActionEvent?) {
        if (evento?.source == calcular) {
            var error = false
            try {
                val radio = campoRadio.text.toDouble()
                val esfera = Esfera(radio)
                volumen.text = "Volumen (cm3): ${
                    String.format("%.2f", esfera.calcularVolumen())
                }"

                superficie.text = "Superficie (cm2): ${
                    String.format("%.2f", esfera.calcularSuperficie())
                }"
            } catch (e: Exception) {
                error = true
            } finally {
                if (error) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Campo nulo o error en formato del numero",
                        "Error", JOptionPane.ERROR_MESSAGE
                    )
                }
            }
        }
    }
}