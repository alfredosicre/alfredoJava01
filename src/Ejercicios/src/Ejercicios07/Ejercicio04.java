package Ejercicios07;

// Pedir al usuario una frase y un carácter, y decir si la frase contiene ese carácter.
import java.util.Scanner;

public class Ejercicio04 {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // Pedir primero la frase
	        System.out.print("Introduce una frase: ");
	        String frase = scanner.nextLine();

	        // Pedir despues el carácter
	        System.out.print("Introduce un carácter: ");
	        String letra = scanner.nextLine();

	        // Validar que el usuario haya introducido un solo carácter
	        if (letra.length() != 1) {
	            System.out.println("Por favor, introduce un solo carácter.");
	        } else {
	            char caracter = letra.charAt(0);

	            // Comprobar si la frase contiene el carácter
	            if (frase.indexOf(caracter) != -1) {
	                System.out.println("La frase contiene el carácter '" + caracter + "'.");
	            } else {
	                System.out.println("La frase NO contiene el carácter '" + caracter + "'.");
	            }
	        }

	        scanner.close();
	    }
}
