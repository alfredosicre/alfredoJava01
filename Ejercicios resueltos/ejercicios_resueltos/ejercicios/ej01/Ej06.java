package ejercicios.ej01;

import java.util.Scanner;

//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. 
	// Fórmula para la conversión: F = 9/5C + 32
public class Ej06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Grados F a C");
		System.out.println("------------");
		
		double f, c;
		
		System.out.print("Grados Fahrenheit: ");
		f = tec.nextDouble();

		c = (f - 32) * 5 / 9;
		
		System.out.println(f + " F = " + c + " C");
	}
}
