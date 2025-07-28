package ejercicios.ej02;

import java.util.Scanner;

//Imprimir por pantalla los números 1 hasta un número ingresado por teclado.

public class Ej01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("NUMEROS NATURALES");
		System.out.println("-----------------");
		
		int hasta;
		
		System.out.print("Hasta que numero: ");
		hasta = tec.nextInt();
		
		for (int i = 1; i <= hasta; i++) {
			System.out.println(i);
		}
	}
}
