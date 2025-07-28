package ejercicios.ej02;

import java.util.Scanner;

//Escribir un programa que pida al usuario un número entero positivo mayor que 2 y muestre por pantalla si es un número primo o no.
// Probar con 2000000063
public class Ej16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("NUMEROS PRIMOS");
		System.out.println("--------------");

		int num;
		
		System.out.print("Ingresa valor entero positivo: ");
		num = tec.nextInt();
		boolean esPrimo = true;
		
		if (num >= 0) {
			int cont = 0;
			for (int i = 2; i < num && esPrimo; i++) {
				if (num % i == 0)
					esPrimo = false;
				cont++;
			}
			System.out.println(num + (esPrimo?" ":" no ") + "es primo.");
			System.out.println(cont + " iteraciones.");
		}
	}
}
