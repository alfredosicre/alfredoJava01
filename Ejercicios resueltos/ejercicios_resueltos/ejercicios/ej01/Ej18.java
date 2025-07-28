package ejercicios.ej01;

import java.util.Scanner;

//Escribir un programa que dados dos puntos en el plano 𝐴(𝑥1,𝑦1) y 𝐵(𝑥2,𝑦2), imprima la distancia entre ambos.
//	𝑑(𝐴,𝐵)= √((𝑥2 − 𝑥1)^2 + (𝑦2 − 𝑦1)^2)
public class Ej18 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DISTANCIA ENTRE DOS PUNTOS");
		System.out.println("--------------------------");
		
		double x1, y1, x2, y2, distancia;
		
		System.out.println("Punto A");
		System.out.print("x1: ");
		x1 = tec.nextDouble();
		System.out.print("y1: ");
		y1 = tec.nextDouble();

		System.out.println("Punto b");
		System.out.print("x2: ");
		x2 = tec.nextDouble();
		System.out.print("y2: ");
		y2 = tec.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("d(A,B) = " + distancia);
	}
}
