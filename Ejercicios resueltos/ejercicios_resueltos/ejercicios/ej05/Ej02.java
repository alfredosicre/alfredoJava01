package ejercicios.ej05;

import utilidades.Util;

// Crea un programa que intercambie los valores de dos variables sin usar una variable temporal.
public class Ej02 {
	public static void main(String[] args) {
		int a, b;
		a = Util.leerInt("Ingrese valor de a:");
		b = Util.leerInt("Ingrese valor de b:");

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a += b;
		b = a - b;
		a -= b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
