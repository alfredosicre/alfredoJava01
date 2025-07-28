package ejercicios.ej02;

import java.util.Scanner;

//Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario

public class Ej08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("NROS PARES");
		System.out.println("----------");

		int desde, hasta;

		System.out.print("Ingresa extremo izq.: ");
		desde = tec.nextInt();

		System.out.print("Ingresa extremo der.: ");
		hasta = tec.nextInt();

		if (desde % 2 == 0)
			desde++;
		
		for (int i = desde + 1; i < hasta; i+=2) {
			System.out.println(i);
		}
	}
}
