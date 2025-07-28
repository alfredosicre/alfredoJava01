package ejercicios.ej01;

import java.util.Scanner;

//Dados la base y altura de un triángulo, calcular su área
public class Ej03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("TRIANGULO");
		System.out.println("---------");
		
		double base, altura, area;

		System.out.print("Base: ");
		base = tec.nextDouble();
		
		System.out.print("Altura: ");
		altura = tec.nextDouble();
		
		area = base * altura / 2;

		System.out.println("Area: " + area);
	}
}
