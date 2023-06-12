package taller.cinco;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import kotlin.NotImplementedError;
import taller.cinco.figuras.Principal;

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
        if (mode.equals("NOTAS")) {

            throw new NotImplementedError("'Notas' aun no ha sido implementado");

        } else if (mode.equals("FIGURAS")) {
            FlatLightLaf.setup(new FlatDarkLaf());
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