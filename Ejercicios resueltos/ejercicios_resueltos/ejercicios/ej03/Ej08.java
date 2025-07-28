package ejercicios.ej03;

import java.util.Scanner;

//Escriba un programa que imprima los siguientes patrones por separado, uno debajo del siguiente, 
//	una vez que el usuario ingresó el tamaño, por ejemplo 5. Utilice ciclos for para generar los patrones. 
//	Sugerencia: los dos últimos patrones requieren que cada línea comience con un número correcto de espacios en blanco: ‘ ‘.
//	*     ***** *****     *
//	**    ****   ****    **
//	***   ***     ***   ***
//	****  **       **  ****
//	***** *         * *****

public class Ej08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("TRIANGULOS");
		System.out.println("--------");
		
		int lado;
		
		System.out.print("Ingresa lado del triangulo: ");
		lado = tec.nextInt();
		
//		TRIANGULO 1
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
//		TRIANGULO 2
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
//		TRIANGULO 3
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= lado - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
//		TRIANGULO 4
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
