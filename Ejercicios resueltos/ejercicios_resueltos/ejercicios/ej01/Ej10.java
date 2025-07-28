package ejercicios.ej01;

import java.util.Scanner;

// Dado un número cualquier por teclado, mostrar su valor absoluto.

public class Ej10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("VALOR ABSOLUTO");
		System.out.println("--------------");
		
		double num;
		
		System.out.print("num: ");
		num = tec.nextDouble();

		System.out.println("|" + num + "| = " + (num >= 0 ? num : -num));
		System.out.printf("|%.3f| = %.3f\n", num, (num >= 0 ? num : -num));
		
		System.out.println("|" + num + "| = " + Math.abs(num));
		System.out.printf("|%.3f| = %.3f\n", num, Math.abs(num));
	}
}
