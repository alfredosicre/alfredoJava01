package ejercicios.ej01;

import java.util.Scanner;

//Dados tres números, indicar el mayor y el menor valor de los tres
public class Ej11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("MAYOR Y MENOR");
		System.out.println("-------------");
		
		double num1, num2, num3, mayor;
		
		System.out.print("num: ");
		num1 = tec.nextDouble();
		
		System.out.print("num: ");
		num2 = tec.nextDouble();

		System.out.print("num: ");
		num3 = tec.nextDouble();
		
		if (num1 > num2 && num1 > num3)
			mayor = num1;
		else if (num2 > num3)
			mayor = num2;
		else 
			mayor = num3;
		
		System.out.println("El mayor es: " + mayor);
	}
}
