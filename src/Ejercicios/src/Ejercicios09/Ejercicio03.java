package Ejercicios09;

// Desarrollar un método que reciba un array de dos dimensiones de double (matriz
// matemática) y calcule la Traza. La traza es la sumatoria de los elementos de la diagonal
// principal de una matriz cuadrada. Nosotros la calcularemos para cualquier matriz, no sólo
// cuadradas.

public class Ejercicio03 {

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
    
}
