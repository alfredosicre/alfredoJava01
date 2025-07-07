package Ejercicios09;

public class Ejercicio066 {
	
// Verificación inicial: El método primero verifica si la matriz de entrada es nula o vacía.
// Dimensiones: Determina el número de filas y columnas de la matriz original.
// Creación de matriz transpuesta: Crea una nueva matriz donde las filas y columnas están invertidas respecto a la original.
// Llenado de la matriz transpuesta: Mediante un doble bucle for, copia cada elemento matriz[i][j] a la posición transpuesta[j][i].
// Retorno: Devuelve la matriz transpuesta calculada.
	

	    
	    public static double[][] obtenerTranspuesta(double[][] matriz) {
	        // Verificar si la matriz es nula o vacía
	        if (matriz == null || matriz.length == 0) {
	            return new double[0][0];
	        }
	        
	        int filas = matriz.length;
	        int columnas = matriz[0].length;
	        
	        // Crear nueva matriz con dimensiones invertidas
	        double[][] transpuesta = new double[columnas][filas];
	        
	        // Llenar la matriz transpuesta
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                transpuesta[j][i] = matriz[i][j];
	            }
	        }
	        
	        return transpuesta;
	    }
	    
	    // Método auxiliar para imprimir una matriz (solo para pruebas)
	    public static void imprimirMatriz(double[][] matriz) {
	        for (double[] fila : matriz) {
	            for (double valor : fila) {
	                System.out.print(valor + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    // Ejemplo de uso
	    public static void main(String[] args) {
	        double[][] matrizOriginal = {
	            {1.0, 2.0, 3.0},
	            {4.0, 5.0, 6.0},
	        };
	        
	        System.out.println("Matriz original:");
	        imprimirMatriz(matrizOriginal);
	        
	        double[][] matrizTranspuesta = obtenerTranspuesta(matrizOriginal);
	        
	        System.out.println("\nMatriz transpuesta:");
	        imprimirMatriz(matrizTranspuesta);
	    }
	}
