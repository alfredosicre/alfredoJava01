package teoria;

import java.util.Scanner;

public class LeerTeclado2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa tu edad: ");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Ingresa tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años.");
	}
}
