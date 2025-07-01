package Ejercicios08;

//Desarrollar un método que reciba un array de enteros y retorne otro con los elementos
//ordenados exactamente al revés que el original.

public class Ejercicio03 {

	    public static void main(String[] args) {
	    	
	        int[] original = {10, 20, 30, 40, 50}; // creamos un array con 5 numeros
	        int[] invertido = invertirArray(original); // creamos en la funcion o metodo invertirArray la invertida 
	        
	        System.out.println("Array original:");
	        for (int num : original) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nArray invertido:");
	        for (int num : invertido) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    public static int[] invertirArray(int[] numeros) {
	        int[] invertido = new int[numeros.length];
	        
	        for (int i = 0; i < numeros.length; i++) {
	            invertido[i] = numeros[numeros.length - 1 - i];
	        }
	        
	        return invertido;
	    }
}
