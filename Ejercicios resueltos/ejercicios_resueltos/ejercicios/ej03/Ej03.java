package ejercicios.ej03;

import java.util.Scanner;

//Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente manera:
//	****
//	*  *
//	*  *
//	****

public class Ej03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CUADRADO");
		System.out.println("--------");
		
		int lado;
		
		System.out.print("Ingresa lado del rectangulo: ");
		lado = tec.nextInt();
		
//		OPCION 1
		for (int i = 1; i <= lado; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int i = 2; i <= lado-1; i++) {
			System.out.print("* ");
			for (int j = 2; j <= lado-1; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		} 
		for (int i = 1; i <= lado; i++) {
			System.out.print("* ");
		}
		
		System.out.println();
		System.out.println();
//		OPCION 2
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				if (i==1 || i==lado || j==1 || j==lado)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		} 
		
	}
}
