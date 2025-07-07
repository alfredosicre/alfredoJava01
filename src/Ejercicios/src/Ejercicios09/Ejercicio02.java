package Ejercicios09;

// Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma
// total de todos los elementos.

public class Ejercicio02 {

// Método principal --------------------------------------------------
    public static void main(String[] args) {
    	
    	// Creamos la Array de dos dimensiones double
        double[][] ejemplo = {
            {1.2, 3.4, 5.6},
            {7.8, 9.0, 1.1},
            {2.2, 3.3, 4.4}
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
    
}
