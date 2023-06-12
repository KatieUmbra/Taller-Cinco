package taller.cinco.notas;

public class Calculos {
    double[] listaNotas; /* Atributo que identifica un array de Notas de tipo double */

    /*** Constructor de la clase Notas, instancia un array con 5 Notas de tipo double */
    public Calculos() {
        listaNotas = new double[5]; // Crea un array de 5 Notas
    }

    /*** Método que calcula el promedio de Notas @return El promedio de Notas calculado*/
    double calcularPromedio() {
        double suma = 0;
        for (int i = 1; i < listaNotas.length; i++) { // Se recorre el array
            suma = suma + listaNotas[i]; // Suma las Notas del array
        }
        /* Obtiene el promedio como la división de la suma de Notas sobre el total de Notas */
        return (suma / listaNotas.length);
    }

    /**
     * Método que calcula la desviación estándar del array de Notas
     *
     * @return La desviación estándar del array de Notas
     */
    double calcularDesviación() {
        double prom = calcularPromedio(); /* Invoca el método para
        calcular el promedio */
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
            // Aplica fórmula para la sumatoria de elementos
            suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); /* Retorna el cálculo
        final de la desviación */
    }

    /**
     * Método que calcula el valor menor del array de Notas
     * @return El valor menor del array de Notas
    */
    double calcularMenor() {
        double menor = listaNotas[0]; /* Define una variable como la nota menor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] < menor) {
                /* Si un elemento del array es menor que el menor actual, se actualiza su valor */
                menor = listaNotas[i];
            }
        }
        return menor;
    }

    /*** Método que calcula el valor mayor del array de Notas @return El valor mayor del array de Notas*/
    double calcularMayor() {
        double mayor = listaNotas[0]; /* Define una variable como la
        nota mayor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
            if (listaNotas[i] > mayor) {
                /* Si un elemento del array es mayor que el mayor actual,
                se actualiza su valor */
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}
