package Ejercicios09;

import java.util.Random;

// Desarrollar un método que reciba dos enteros, el primero (f) la cantidad de filas y el
// segundo (c) la cantidad de columnas. Deberá generar y retornar una matriz de dos
// dimensiones de f+1 filas y c+1 columnas, con números aleatorios entre 0 y 99 en todas las
// celdas, excepto en la última fila y en la última columna, que deberán contener los
// sumatorios de las filas o columnas correspondientes, similar a una hoja Excel.

// Validación: Verifica que las dimensiones f y c sean mayores que cero.
// Creación de matriz: Crea una matriz de tamaño (f+1) x (c+1) para dejar espacio a los sumatorios.
// Llenado con aleatorios: Rellena las celdas (excepto la última fila y columna) con números aleatorios entre 0 y 99.
// Sumatorios de filas: Calcula la suma de cada fila y la coloca en la última columna de esa fila.
// Sumatorios de columnas: Calcula la suma de cada columna y la coloca en la última fila de esa columna.
// Total general: Calcula la suma de todos los elementos (o de los sumatorios de fila) y lo coloca en la esquina inferior derecha.


public class Ejercicio09 {
	    
	    public static int[][] generarMatrizConSumatorios(int f, int c) {
	        // Validar parámetros de entrada
	        if (f <= 0 || c <= 0) {
	            throw new IllegalArgumentException("Las dimensiones deben ser mayores que cero");
	        }
	        
	        // Crear matriz con una fila y columna adicional para los sumatorios
	        int[][] matriz = new int[f + 1][c + 1];
	        Random random = new Random();
	        
	        // Llenar la matriz con valores aleatorios (excepto última fila y columna)
	        for (int i = 0; i < f; i++) {
	            for (int j = 0; j < c; j++) {
	                matriz[i][j] = random.nextInt(100); // Números entre 0 y 99
	            }
	        }
	        
	        // Calcular sumatorios de filas (excepto última fila)
	        for (int i = 0; i < f; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < c; j++) {
	                sumaFila += matriz[i][j];
	            }
	            matriz[i][c] = sumaFila; // Última columna de la fila
	        }
	        
	        // Calcular sumatorios de columnas (excepto última columna)
	        for (int j = 0; j < c; j++) {
	            int sumaColumna = 0;
	            for (int i = 0; i < f; i++) {
	                sumaColumna += matriz[i][j];
	            }
	            matriz[f][j] = sumaColumna; // Última fila de la columna
	        }
	        
	        // Calcular el total general (esquina inferior derecha)
	        int totalGeneral = 0;
	        for (int i = 0; i < f; i++) {
	            totalGeneral += matriz[i][c]; // Sumar los totales de fila
	        }
	        matriz[f][c] = totalGeneral;
	        
	        return matriz;
	    }
	    
	    // Método auxiliar para imprimir la matriz
	    public static void imprimirMatriz(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.printf("%5d", matriz[i][j]);
	            }
	            System.out.println();
	        }
	    }
	    
	    // MAIN ---------------------------------------------------------------------------------------------------
	    
	    public static void main(String[] args) {
	        int filas = 8;
	        int columnas = 15;
	        
	        System.out.println("Matriz generada con sumatorios: Filas: " + filas + " , Columnas: "+ columnas);
	        System.out.println();
	        int[][] matriz = generarMatrizConSumatorios(filas, columnas);
	        imprimirMatriz(matriz);
	    }
}

