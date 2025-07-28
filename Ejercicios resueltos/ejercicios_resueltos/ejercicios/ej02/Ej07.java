package ejercicios.ej02;

import java.util.Scanner;

//Dado un número entero n positivo, imprimir su factorial. 
//	0! = 1 1! = 1 2! = 2x1 = 2 3! = 3x2x1 = 6 4! = 4x3x2x1 = 24 5! = 120

public class Ej07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("FACTORIAL");
		System.out.println("---------");

		int num;
		long fact = 1;
		
		System.out.print("Ingresa valor entero: ");
		num = tec.nextInt();

		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				fact *= i;
			}
			System.out.println(num + "! = " + fact);
		}
	}
}
