package Ejercicios09;

// Desarrollar un método que reciba una matriz matemática (dos dimensiones) de double y
// retorne la matriz traspuesta. La matriz traspuesta se genera cambiando filas por columnas:

public class Ejercicio06 {

// Método principal --------------------------------------------------
    public static void main(String[] args) {
    	
    	// Creamos la Array de dos dimensiones double
    	// esto es un Array de Arrays. En este ejemplo es un Array que contiene 5 Arrays
        double[][] ejemplo = {
            {1.2, 3.4, 5.6},
            {7.8, 9.0, 1.1},
            {2.2, 3.3, 4.4},
            {2.5, 6.9, 1.6},
            {5.7, 3.1, 6.2},
        };
        // esta matriz la utilizamos para la suma de las filas y columnas
        double[][] ejemplo01 = {
                {1.1, 2.2, 3.3, 4.4},
                {1.1, 2.2, 3.3, 4.4},
                {1.1, 2.2, 3.3, 4.4},
                {1.1, 2.2, 3.3, 4.4},
                {1.1, 2.2, 3.3, 4.4},
                {1.1, 2.2, 3.3, 4.4},
            };
        
        // imprimimos el contenido del Array 2D
        System.out.println("Contenido del array:");
        mostrarArray(ejemplo);
        
        // imprimimos la suma total de todos los elementos
        System.out.println();
        double total = sumarArray(ejemplo);
        System.out.printf("La suma total del array es: %.2f\n", total);
        
        // En %.2f/n el significado es:
        // % - indica el inicio de una especificacion de formato
        // .2 - Precision: mostrar exactamente 2 cifras decimales
        // f - Tipo de dato, en esta caso es float o double
        // \n - Salto de linea.
        // \t - Tabulador horizontal (tecla tab)
        
        double resultado = calcularTraza(ejemplo);
        System.out.printf("La traza de la matriz es: %.2f\n", resultado);
        
        // imprimimos la suma de cada fila
        System.out.println();
        double[] resultados = sumarFilas(ejemplo01);

        for (int i = 0; i < resultados.length; i++) {
            System.out.printf("Suma de la fila %d: %.2f\n", i, resultados[i]);
        }
        
        // imprimimos la suma de cada columna
        System.out.println();
        double[] resul = sumarColumnas(ejemplo01);

        for (int j = 0; j < resul.length; j++) {
            System.out.printf("Suma de la columna %d: %.2f\n", j, resul[j]);
        }
        
        // imprimimos la matriz transpuesta
        double[][] transpuesta = trasponer(ejemplo);

        System.out.println("\nMatriz traspuesta:");
        for (double[] fila : transpuesta) {
            for (double valor : fila) {
                System.out.printf("%.2f\t", valor);
            }
            System.out.println();
        }
        
    }
//----------------------------------------------------------------------
    
 // Método para mostrar un array 2D de tipo double
    public static void mostrarArray(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]); // Muestra con 2 decimales y tabulador
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
    
    // Método que calcula la suma total de todos los elementos del array 2D
    public static double sumarArray(double[][] matriz) {
        double suma = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
 // Método que calcula la traza (suma de la diagonal principal)
    public static double calcularTraza(double[][] matriz) {
        int min = Math.min(matriz.length, matriz[0].length); // mínimo entre filas y columnas
        // matriz.length me da el numero de filas que tiene la matriz
        // matriz[0].length me da el numero de columnas de la fila primera, 0. Como todas son iguales
        // la matriz tiene entera esas columnas
        
        System.out.println(min);
        System.out.println(matriz.length); // numero de filas 
        System.out.println(matriz[0].length); // numero de columnas de la fila primera (0).
        double traza = 0.0;

        for (int i = 0; i < min; i++) {
            traza += matriz[i][i];
            System.out.println(traza);
        }

        return traza;
    }
    
 // Método que calcula la suma de cada fila y devuelve un array con los resultados
    public static double[] sumarFilas(double[][] matriz) {
        double[] sumaFilas = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) { // las lineas, de 0 hasta menor que 5 en este caso
            double suma = 0.0;
            for (int j = 0; j < matriz[i].length; j++) { // columnas, desde 0 hasta menor que 3 en este caso 
                suma += matriz[i][j]; // sumamos los valores de cada linea.
            }
            sumaFilas[i] = suma;
        }

        return sumaFilas;
    }
    
 // Método que calcula la suma de cada columna
    public static double[] sumarColumnas(double[][] matriz) {
        int numFilas = matriz.length; // vemos el numero de filas de la matriz
        int numColumnas = matriz[0].length; // vemos el numero de columnas de la matriz
        double[] sumaColumnas = new double[numColumnas]; // Array para sumar las columnas

        for (int j = 0; j < numColumnas; j++) {
            double suma = 0.0;
            for (int i = 0; i < numFilas; i++) {
                suma += matriz[i][j];
            }
            sumaColumnas[j] = suma;
        }

        return sumaColumnas;
    }
    
 // Método que genera y retorna la matriz traspuesta
    public static double[][] trasponer(double[][] matriz) {
        int filas = matriz.length; // calculo de las filas de la matriz
        int columnas = matriz[0].length; // calculo de las columnas de la matriz
        double[][] traspuesta = new double[columnas][filas];// nueva Array traspuesta

        for (int i = 0; i < filas; i++) { // empiezo a recorrer las filas
            for (int j = 0; j < columnas; j++) { // empiezo a recorrer las columnas
                traspuesta[j][i] = matriz[i][j]; // Intercambia fila por columna
            }
        }

        return traspuesta;
    }
    
}
