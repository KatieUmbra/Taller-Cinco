package taller.cinco.figuras.ventanas;

import taller.cinco.figuras.Cilindro;

import javax.swing.JOptionPane;

public class CilindroVentana extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCilindro
     */
    public CilindroVentana() {
    }

    ;


    private void btnCalcularActionPerformed(java.awt.event.ActionEvent e) {
        try {
            double radio = Double.parseDouble(txtRadio.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            double volumen = Cilindro.calcularVolumen(radio, altura);
            double superficie = Cilindro.calcularSuperficie(radio, altura);

            lbVolumen.setText("Volumen: " + volumen);
            lbSuperficie.setText("Superficie: " + superficie);
        } catch (Exception evt) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtRadio.setText("");
        txtAltura.setText("");
        lbVolumen.setText("Volumen");
        lbSuperficie.setText("Superficie");
    }

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbSuperficie;
    private javax.swing.JLabel lbVolumen;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration
}
