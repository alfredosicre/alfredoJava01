package Ejercicios08;

//Desarrollar un método que muestre por pantalla un array de enteros de la siguiente forma:
//[25, 32, -1567, 8]

public class Ejercicio01 {
	
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

		
		
	}

}
