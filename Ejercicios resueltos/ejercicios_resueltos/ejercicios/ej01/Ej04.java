package ejercicios.ej01;

import java.util.Scanner;

//Dado el radio de una esfera, calcular su volumen. 𝑉=4/3.𝜋.𝑟^3
public class Ej04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("ESFERA");
		System.out.println("------");
		
		double radio, volumen;
		
		System.out.print("Radio: ");
		radio = tec.nextDouble();

		volumen = 4./3 * Math.PI * Math.pow(radio, 3);
		
		System.out.println("Volumen: " + volumen);
	}
}
