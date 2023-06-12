package taller.cinco.notas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener {

    public VentanaPrincipal() {
        initComponents();
    }

    private Container contenedor;
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviacion, mayor, menor;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcular, limpiar, salir;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        calcular = new JButton("Calcular");
        limpiar = new JButton("Limpiar");
        salir = new JButton("Salir");
        promedio = new JLabel("Promedio = ");
        desviacion = new JLabel("Desviación estándar = ");
        mayor = new JLabel("Valor mayor = ");
        menor = new JLabel("Valor menor = ");
        calcular.addActionListener(this);
        limpiar.addActionListener(this);
        salir.addActionListener(this);

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
        panel.add(calcular);
        panel.add(limpiar);
        panel.add(salir);
        panel.add(promedio);
        panel.add(desviacion);
        panel.add(mayor);
        panel.add(menor);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    /**
    * Método que gestiona los eventos generados en la ventana principal
    */
    @Override
    public void actionPerformed(ActionEvent evento) {
        // @param evento el objeto ActionEvent que representa la acción del usuario
        if (evento.getSource() == calcular) { /* Si se pulsa el botón*/
            Calculos notas = new Calculos(); // Se crea un objeto Notas

            if (campoNota1.getText().isEmpty() || campoNota2.getText().isEmpty() ||
                campoNota3.getText().isEmpty() || campoNota4.getText().isEmpty() ||
                campoNota5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar todas las Notas.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }

            try {
                notas.listaNotas[0] = Double.valueOf(campoNota1.getText());
                notas.listaNotas[1] = Double.valueOf(campoNota2.getText());
                notas.listaNotas[2] = Double.valueOf(campoNota3.getText());
                notas.listaNotas[3] = Double.valueOf(campoNota4.getText());
                notas.listaNotas[4] = Double.valueOf(campoNota5.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se ingresó un valor no numérico. Por favor, ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }

            notas.calcularPromedio(); // Se calcula el promedio
            notas.calcularDesviación(); // Se calcula la desviación
            // Se muestra el promedio formateado
            promedio.setText("Promedio = " + String.valueOf(String.format("%.2f",notas.calcularPromedio())));
            double desv = notas.calcularDesviación();
            // Se muestra la desviación formateada
            desviacion.setText("Desviación estándar = " + String.format("%.2f", desv));
            // Se muestra el valor mayor formateado
            mayor.setText("Valor mayor = " + String.valueOf(notas.calcularMayor()));
            // Se muestra el valor menor formateado
            menor.setText("Valor menor = " + String.valueOf(notas.calcularMenor()));
            }
            /* Se se pulsa el botón Limpiar se dejan en blanco los campos de
            Notas */
        if (evento.getSource() == limpiar) {
                campoNota1.setText("");
                campoNota2.setText("");
                campoNota3.setText("");
                campoNota4.setText("");
                campoNota5.setText("");
        }

        if (evento.getSource()==salir) {
            dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
