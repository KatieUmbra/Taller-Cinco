package taller.cinco.notas;

public class Calculos {
    public double[] listaNotas;

    public Calculos() {
        listaNotas = new double[5];
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 1; i < listaNotas.length; i++) {
            suma = suma + listaNotas[i];
        }
        return (suma / listaNotas.length);
    }

    /**
     * @return La desviación estándar del array de Notas
     */
    public double calcularDesviacion() {
        double prom = calcularPromedio();
        double suma = 0;
        for (double listaNota : listaNotas) {
            suma += Math.pow(listaNota - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.length);
    }

    /**
     * @return El valor menor del array de Notas
     */
    public double calcularMenor() {
        double menor = listaNotas[0];
        for (double listaNota : listaNotas) {
            if (listaNota < menor) {
                menor = listaNota;
            }
        }
        return menor;
    }

    public double calcularMayor() {
        double mayor = listaNotas[0];
        for (double listaNota : listaNotas) {
            if (listaNota > mayor) {
                mayor = listaNota;
            }
        }
        return mayor;
    }
}
