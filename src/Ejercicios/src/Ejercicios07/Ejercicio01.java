package Ejercicios07;

// Pedir al usuario una cadena y decir si empieza por el carácter ‘H’.

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);

	    // Pedir al usuario una cadena
	    System.out.print("Introduce una cadena: ");
	    String cadena = scanner.nextLine();

	    // Verificar si la cadena empieza por 'H'
	    if (!cadena.isEmpty() && Character.toUpperCase(cadena.charAt(0)) == 'H') {
	    	System.out.println("La cadena empieza por 'H'.");
	    } else {
	        System.out.println("La cadena NO empieza por 'H'.");
	    }

	        scanner.close();
	        
	}
}