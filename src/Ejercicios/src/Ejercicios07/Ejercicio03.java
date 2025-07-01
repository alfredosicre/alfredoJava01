package Ejercicios07;

// Elabora un método que escriba todos los caracteres de una cadena cada uno en una línea.

public class Ejercicio03 {
	
	public static void main(String[] args) {
	
		String texto = "Hola, esto es una cadena de prueba";
	
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	
	}
}