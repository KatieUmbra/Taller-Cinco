package taller.cinco.figuras;

public class Piramide extends FiguraGeometrica {
    public static double calcularVolumen(double base, double altura, double apotema) {
        double volumen = Math.pow(base, 2) * altura / 3;
        return 0.01*Math.round(100*volumen);
    }

    public static double calcularSuperficie(double base, double altura, double apotema) {
        double superficie = Math.pow(base, 2) + 2*(base*apotema);
        return 0.01*Math.round(100*superficie);
    }
}
