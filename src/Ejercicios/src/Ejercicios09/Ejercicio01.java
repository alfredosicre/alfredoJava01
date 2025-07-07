package Ejercicios09;

// Desarrollar un método que muestre por pantalla un array de dos dimensiones de double.

public class Ejercicio01 {

    // Método principal para probarlo
    public static void main(String[] args) {
    	
        double[][] ejemplo = {
            {1.2, 3.4, 5.6},
            {7.8, 9.0, 1.1},
            {2.2, 3.3, 4.4}
        };

        System.out.println("Contenido del array:");
        mostrarArray(ejemplo);
    }
    
 // Método para mostrar un array 2D de tipo double
    public static void mostrarArray(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]); // Muestra con 2 decimales y tabulador
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
    
}
