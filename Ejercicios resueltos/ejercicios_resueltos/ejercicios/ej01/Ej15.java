package ejercicios.ej01;

import java.util.Scanner;

//Hacer un algoritmo que, dados los catetos de un triángulo rectángulo, calcule su hipotenusa.
//	ℎ =√(𝑎+𝑏), con h (hipotenusa), a y b (catetos)
public class Ej15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("PITAGORAS");
		System.out.println("---------");
		
		double a, b, h;
		
		System.out.print("Cateto 1: ");
		a = tec.nextDouble();
		System.out.print("Cateto 2: ");
		b = tec.nextDouble();

		h = Math.sqrt(a * a + b * b);
		
		System.out.println("Hipotenusa: " + h);
	}
}
