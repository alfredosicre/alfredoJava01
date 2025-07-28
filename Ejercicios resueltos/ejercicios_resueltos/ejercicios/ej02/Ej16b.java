package ejercicios.ej02;

import java.util.Scanner;

//Escribir un programa que pida al usuario un número entero positivo mayor que 2 y muestre por pantalla si es un número primo o no.

public class Ej16b {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("NUMEROS PRIMOS");
		System.out.println("--------------");

		int num;
		
		System.out.print("Ingresa valor entero positivo: ");
		num = tec.nextInt();

		boolean esPrimo = !(num % 2 == 0);
		
		if (num >= 0) {
			int cont = 0;
			for (int i = 3; i <= (int)Math.sqrt(num) && esPrimo; i+=2) {
				if (num % i == 0)
					esPrimo = false;
				cont++;
			}
			System.out.println(num + (esPrimo?" ":" no ") + "es primo.");
			System.out.println(cont + " iteraciones.");
		}
	}
}
