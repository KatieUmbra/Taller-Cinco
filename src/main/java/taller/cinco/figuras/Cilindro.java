package taller.cinco.figuras;

public class Cilindro extends FiguraGeometrica {
    public static double calcularVolumen(double radio, double altura) {
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return 0.01*Math.round(100*volumen);
    }

    public static double calcularSuperficie(double radio, double altura) {
        double superficie = 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI*radio * altura;
        return 0.01*Math.round(100*superficie);
    }
}
