package ejercicios.ej02;

import java.util.Scanner;

//Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores.

public class Ej15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("DIVISORES");
		System.out.println("------------");

		int num;
		
		System.out.print("Ingresa valor entero positivo: ");
		num = tec.nextInt();

		if (num >= 0) {
			for (int i = 1; i <= num/2; i++) {
				if (num % i == 0)
					System.out.print(i + ", ");
			}
			System.out.println(num);
		}
	}
}
