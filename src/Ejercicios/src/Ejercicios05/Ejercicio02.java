package Ejercicios05;

public class Ejercicio02 { // Crea un programa que intercambie los valores de dos variables sin usar una variable temporal.
	
	public static void main(String[] args) {
		
		int var01 = 100;
		int var02 = 50;
		
		System.out.println("Valores iniciales");
		System.out.println(var01);
		System.out.println(var02);
		
		System.out.println("Valores intercambiados");
		
		var01 = var01 + var02; // var01 = 100 + 50 = 150
		var02 = var01 - var02; // var02 = 150 - 50 = 100
		var01 = var01 - var02; // var01 = 150 - 100 = 50
		
		System.out.println("Variable 1: " + var01);
		System.out.println("Variable 2: " + var02);
		
	
		//--------------
        System.out.println("Fin de programa");
		// -------------
	}

}
