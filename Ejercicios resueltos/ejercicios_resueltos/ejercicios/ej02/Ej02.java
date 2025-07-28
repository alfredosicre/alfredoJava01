package ejercicios.ej02;

import java.util.Scanner;

//Imprimir la suma de n números ingresados por teclado. La cantidad de números (n) se solicita al usuario al principio y se ingresa por teclado.

public class Ej02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("NUMERO TRIANGULAR");
		System.out.println("-----------------");
		
		int hasta, triangular = 0;
		
		System.out.print("Hasta que numero: ");
		hasta = tec.nextInt();
		
		for (int i = 1; i <= hasta; i++) {
			triangular += i;
		}
		
		System.out.println("Triangular de " + hasta + " = " + triangular);
	}
}
