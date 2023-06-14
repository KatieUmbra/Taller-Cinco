package taller.cinco.notas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica
 * que permitirá crear un array de notas. Luego, se puede calcular el
 * promedio de notas, la desviación, la nota mayor y la nota menor del
 * array.
 *
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements
        ActionListener {
    private JLabel promedio;
    private JLabel desviacion;
    private JLabel mayor;
    private JLabel menor;
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    private JButton calcular, limpiar;

    public VentanaPrincipal() {
        inicio();
        setTitle("Notas");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void inicio() {
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        JLabel nota1 = new JLabel();
        nota1.setText("Nota 1:");
        nota1.setBounds(20, 20, 135, 23);
        campoNota1 = new JTextField();
        campoNota1.setBounds(105, 20, 135, 23);
        JLabel nota2 = new JLabel();
        nota2.setText("Nota 2:");
        nota2.setBounds(20, 50, 135, 23);
        campoNota2 = new JTextField();
        campoNota2.setBounds(105, 50, 135, 23);
        JLabel nota3 = new JLabel();
        nota3.setText("Nota 3:");
        nota3.setBounds(20, 80, 135, 23);
        campoNota3 = new JTextField();
        campoNota3.setBounds(105, 80, 135, 23);
        JLabel nota4 = new JLabel();
        nota4.setText("Nota 4:");
        nota4.setBounds(20, 110, 135, 23);
        campoNota4 = new JTextField();
        campoNota4.setBounds(105, 110, 135, 23);
        JLabel nota5 = new JLabel();
        nota5.setText("Nota 5:");
        nota5.setBounds(20, 140, 135, 23);
        campoNota5 = new JTextField();
        campoNota5.setBounds(105, 140, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(20, 170, 100, 23);
        calcular.addActionListener(this);
        limpiar = new JButton();
        limpiar.setText("Limpiar");
        limpiar.setBounds(125, 170, 80, 23);

        limpiar.addActionListener(this);
        promedio = new JLabel();
        promedio.setText("Promedio = ");
        promedio.setBounds(20, 210, 135, 23);
        desviacion = new JLabel();
        desviacion.setText("Desviación = ");
        desviacion.setBounds(20, 240, 200, 23);
        mayor = new JLabel();
        mayor.setText("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23);
        menor = new JLabel();
        menor.setText("Nota menor = ");
        menor.setBounds(20, 300, 120, 23);
        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            Calculos nota = new Calculos();

            if (campoNota1.getText().isEmpty() || campoNota2.getText().isEmpty() ||
                    campoNota3.getText().isEmpty() || campoNota4.getText().isEmpty() ||
                    campoNota5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar todas las Notas.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                nota.listaNotas[0] = Double.parseDouble(campoNota1.getText());
                nota.listaNotas[1] = Double.parseDouble(campoNota2.getText());
                nota.listaNotas[2] = Double.parseDouble(campoNota3.getText());
                nota.listaNotas[3] = Double.parseDouble(campoNota4.getText());
                nota.listaNotas[4] = Double.parseDouble(campoNota5.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se ingresó un valor no numérico. Por favor, ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            nota.calcularPromedio();
            nota.calcularDesviacion();
            promedio.setText("Promedio = " + String.format("%.2f", nota.calcularPromedio()));
            double desv = nota.calcularDesviacion();
            desviacion.setText("Desviación estándar = " + String.format("%.2f", desv));
            mayor.setText("Valor mayor = " + nota.calcularMayor());
            menor.setText("Valor menor = " + nota.calcularMenor());
        }
        if (evento.getSource() == limpiar) {
                campoNota1.setText("");
                campoNota2.setText("");
                campoNota3.setText("");
                campoNota4.setText("");
                campoNota5.setText("");
        }
    }
}
