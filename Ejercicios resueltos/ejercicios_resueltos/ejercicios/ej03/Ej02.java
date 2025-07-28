package ejercicios.ej03;

import java.util.Scanner;

//Escriba un programa que lea el lado de un cuadrado por teclado y a continuación lo muestre por pantalla 
//	en forma de asteriscos. 
//  Por ejemplo, ingresado el valor 4 la salida será: 
//	**** 
//	**** 
//	**** 
//	****

public class Ej02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CUADRADO");
		System.out.println("--------");
		
		int lado;
		
		System.out.print("Ingresa lado del rectangulo: ");
		lado = tec.nextInt();
		
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				System.out.print("* ");
			}
			System.out.println();
		} 
	}
}
