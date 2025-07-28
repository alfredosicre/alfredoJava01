package teoria;

import java.util.Scanner;

public class LeerTeclado {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Hola " + nombre + " que tal estas?");
		
		System.out.print("Ingresa varias palabras: ");
		String palabras = teclado.nextLine();
		System.out.println(palabras);

		System.out.print("Ingresa varias palabras: ");
		String palabra = teclado.next();
		System.out.println(palabra);
		
		String resto = teclado.nextLine();
		System.out.println(resto);
	
		
	}
}
