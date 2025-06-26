package Ejercicios05;

public class Ejercicio01 { //Crea un programa que intercambie los valores de dos variables.
	
	public static void main(String[] args) {
		
		int var01 = 99;
		int var02 = 88;
		int varAux = 0;
		
		System.out.println("Valores iniciales");
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(varAux);
		
		System.out.println("Valores intercambiados");
		
		varAux = var01;
		var01 = var02;
		var02 = varAux;
		
		System.out.println("Variable 1: " + var01);
	
		System.out.println("Variable 2: " + var02);
		
	
		//--------------
        System.out.println("Fin de programa");
		// -------------
		
	}

}
