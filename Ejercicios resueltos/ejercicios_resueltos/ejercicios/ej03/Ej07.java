package ejercicios.ej03;

import java.util.Scanner;

//Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).

public class Ej07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CIFRAS");
		System.out.println("------");
		
		int num, aux, inv = 0;
		
		System.out.print("Ingresa valor entero: ");
		aux = num = tec.nextInt();
		
		while (aux > 0) {
			inv = inv * 10 + aux % 10;
			aux /= 10;
		} 
		System.out.println(num + (num==inv?" ":" no ") + "es capicúa.");
	}
}
