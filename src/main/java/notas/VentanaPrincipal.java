package notas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    public VentanaPrincipal() {
        initComponents();
    }

    private Container contenedor;
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviacion, mayor, menor;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcularButton, limpiarButton, salirButton;

    @SuppressWarnings("unchecked")
    private void initComponents() {

        contenedor = getContentPane();
        nota1 = new JLabel("Nota 1");
        nota2 = new JLabel("Nota 2");
        nota3 = new JLabel("Nota 3");
        nota4 = new JLabel("Nota 4");
        nota5 = new JLabel("Nota 5");
        campoNota1 = new JTextField();
        campoNota2 = new JTextField();
        campoNota3 = new JTextField();
        campoNota4 = new JTextField();
        campoNota5 = new JTextField();
        calcularButton = new JButton("Calcular");
        limpiarButton = new JButton("Limpiar");
        salirButton = new JButton("Salir");
        promedio = new JLabel("Promedio = ");
        desviacion = new JLabel("Desviación estándar = ");
        mayor = new JLabel("Valor mayor = ");
        menor = new JLabel("Valor menor = ");
        calcularButton.addActionListener(this);
        limpiarButton.addActionListener(this);
        salirButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(nota1);
        panel.add(nota2);
        panel.add(nota3);
        panel.add(nota4);
        panel.add(nota5);
        panel.add(campoNota1);
        panel.add(campoNota2);
        panel.add(campoNota3);
        panel.add(campoNota4);
        panel.add(campoNota5);
        panel.add(calcularButton);
        panel.add(limpiarButton);
        panel.add(salirButton);
        panel.add(promedio);
        panel.add(desviacion);
        panel.add(mayor);
        panel.add(menor);
        pack();
        contenedor.add(panel);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcularButton) {
            Calculos notas = new Calculos();

            if (campoNota1.getText().isEmpty() || campoNota2.getText().isEmpty() ||
                    campoNota3.getText().isEmpty() || campoNota4.getText().isEmpty() ||
                    campoNota5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar todas las notas.");
            } else {
                double nota1 = Double.parseDouble(campoNota1.getText());
                double nota2 = Double.parseDouble(campoNota2.getText());
                double nota3 = Double.parseDouble(campoNota3.getText());
                double nota4 = Double.parseDouble(campoNota4.getText());
                double nota5 = Double.parseDouble(campoNota5.getText());
                // Resto del código para calcular y mostrar los resultados
            }
        } else if (evento.getSource() == limpiarButton) {
            // Código para limpiar los campos y resultados
        } else if (evento.getSource() == salirButton) {
            System.exit(0);
        }
    }
}
