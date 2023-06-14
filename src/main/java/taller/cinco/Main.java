package taller.cinco;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import taller.cinco.figuras.Principal;
import taller.cinco.notas.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce un argumento para ejecutar el programa");
            System.out.println("Posibles argumentos:");
            System.out.println("  • Notas");
            System.out.println("  • Figuras");
            return;
        }
        var mode = args[0].toUpperCase();
        FlatLightLaf.setup(new FlatDarkLaf());
        if (mode.equals("NOTAS")) {
            var ventanaPrincipal = new VentanaPrincipal();
            ventanaPrincipal.setVisible(true);
        } else if (mode.equals("FIGURAS")) {
            var figurasPrincipal = new Principal();
            figurasPrincipal.setVisible(true);
        } else {
            System.out.println("Introduce un argumento valido para ejecutar el programa");
            System.out.println("Posibles argumentos:");
            System.out.println("  • Notas");
            System.out.println("  • Figuras");
        }
    }
}