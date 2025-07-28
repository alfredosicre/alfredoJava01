package ejercicios.ej03;

import java.util.Scanner;

//Repetir el ejercicio anterior, pero ingresando un número entero de cualquier cantidad de cifras.

public class Ej05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CIFRAS");
		System.out.println("------");
		
		int num;
		
		System.out.print("Ingresa valor entero: ");
		num = tec.nextInt();
		
		while (num > 0) {
			System.out.println(num % 10);
			num /= 10;
		} 
	}
}
