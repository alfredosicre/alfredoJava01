package ejercicios.ej01;

import java.util.Scanner;

//Hacer un programa que Dado un año indicar si es bisiesto. Un año es bisiesto si es un número 
//	divisible por 4, pero si es divisible por 100 debe ser es divisible por 400
public class Ej14 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("AÑOS BISIESTOS");
		System.out.println("--------------");
		
		int anyo;
		boolean esBisiesto = false;
		
		System.out.print("Año: ");
		anyo = tec.nextInt();
		
		if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0))
			esBisiesto = true;
		
		System.out.println("El año " + anyo + (esBisiesto ? "" : " no") + " es bisiesto.");
	}
}
