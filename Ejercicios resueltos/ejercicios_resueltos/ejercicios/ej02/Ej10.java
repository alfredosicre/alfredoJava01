package ejercicios.ej02;

import java.util.Scanner;

//Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9

public class Ej10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("--------------------");

		int num;

		System.out.print("Ingresa un valor: ");
		num = tec.nextInt();

		for (int i = 0; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
}
