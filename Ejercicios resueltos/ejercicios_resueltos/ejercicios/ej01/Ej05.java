package ejercicios.ej01;

import java.util.Scanner;

//Dados dos números reales, calcular su suma, diferencia, producto y división
public class Ej05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CALCULOS");
		System.out.println("--------");
		
		double num1, num2, suma, dif, prod, div;
		
		System.out.print("Primer valor: ");
		num1 = tec.nextDouble();

		System.out.print("Segundo valor: ");
		num2 = tec.nextDouble();
		
		suma = num1 + num2;
		dif = num1 - num2;
		prod = num1 * num2;
		div = num1 / num2;
		
		System.out.println(num1 + " + " + num2 + " = " + suma);
		System.out.println(num1 + " - " + num2 + " = " + dif);
		System.out.println(num1 + " * " + num2 + " = " + prod);
		System.out.println(num1 + " / " + num2 + " = " + div);
	}
}
