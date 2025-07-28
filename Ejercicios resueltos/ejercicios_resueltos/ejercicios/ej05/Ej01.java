package ejercicios.ej05;

import utilidades.Util;

// Crea un programa que intercambie los valores de dos variables.

public class Ej01 {
	public static void main(String[] args) {
		int a, b;
		a = Util.leerInt("Ingrese valor de a:");
		b = Util.leerInt("Ingrese valor de b:");

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int aux = a;
		a = b;
		b = aux;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
