package ejercicios.ej02;

import java.util.Scanner;

//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás 
//	desde ese número hasta cero separados por comas.

public class Ej14 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("CUENTA ATRAS");
		System.out.println("------------");

		int num;
		
		System.out.print("Ingresa valor entero positivo: ");
		num = tec.nextInt();

		if (num >= 0) {
			for (int i = num; i >= 0; i--) {
				if (i != 0)
					System.out.print(i + ", ");
				else
					System.out.println(i);
			}
		}
	}
}
