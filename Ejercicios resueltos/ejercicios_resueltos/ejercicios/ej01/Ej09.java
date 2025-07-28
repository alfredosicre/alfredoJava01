package ejercicios.ej01;

import java.util.Scanner;

//Dados dos números, indicar el mayor y el menor valor de los dos.
public class Ej09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("MAYOR Y MENOR");
		System.out.println("-------------");
		
		double num1, num2, mayor;
		
		System.out.print("num: ");
		num1 = tec.nextDouble();
		
		System.out.print("num: ");
		num2 = tec.nextDouble();

		mayor = num1 >= num2 ? num1 : num2;
		
		System.out.println("El mayor es: " + mayor);
	}
}
