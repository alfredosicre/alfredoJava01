package Ejercicios08;

//Desarrollar un método que reciba un array de enteros y retorne otro con los valores
//originales elevados al cuadrado.

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[4]; // Crea un array con 5 elementos (todos inicializados a 0)

		// Asignar valores al array
		numeros[0] = 25;
		numeros[1] = 32;
		numeros[2] = -1567;
		numeros[3] = 8;
		
		// recorremos el array y lo vemos por pantalla
		for (int i = 0; i < numeros.length; i++) {
		    System.out.println(numeros[i]);
		}
		
		// recorremos el array y elevamos al cuadrado cada uno de sus valores
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros[i] * numeros[i];
		}
		System.out.println(" "); 
		// recorremos el array y lo vemos por pantalla con los valores nuevos
				for (int i = 0; i < numeros.length; i++) {
				    System.out.println(numeros[i]);
				}
		
	}

}
