package ejercicios.ej03;

import java.util.Scanner;

//Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea comenzando por la unidad. Por ejemplo, ingresando 1234
//	4
//	3
//	2
//	1

public class Ej04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CIFRAS");
		System.out.println("------");
		
		int num;
		
		System.out.print("Ingresa valor entero de 4 cifras: ");
		num = tec.nextInt();
		
		for (int i = 1; i <= 4; i++) {
			System.out.println(num % 10);
			num /= 10;
		} 
		
	}
}
