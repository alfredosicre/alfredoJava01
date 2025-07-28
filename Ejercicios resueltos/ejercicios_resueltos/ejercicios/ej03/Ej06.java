package ejercicios.ej03;

import java.util.Scanner;

//Ingresando un valor entero, muestre por pantalla un nuevo entero con sus dígitos en orden inverso, 
//	por ejemplo: INGRESO: 3589, SALIDA: 9853.

public class Ej06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CIFRAS");
		System.out.println("------");
		
		int num, inv = 0;
		
		System.out.print("Ingresa valor entero: ");
		num = tec.nextInt();
		
		while (num > 0) {
			inv = inv * 10 + num % 10;
			num /= 10;
		} 
		System.out.println(inv);
	}
}
