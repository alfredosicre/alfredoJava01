package ejercicios.ej03;

import java.util.Scanner;

//Calculadora de 4 operaciones. El usuario ingresa dos números y un carácter (+, -, *, / ) y el programa debe 
//	mostrar la operación y su resultado. 
//	Por ejemplo: 
//	Ingrese valor: 12.5 
//	Ingrese valor: 2 
//	Ingrese operación: - 
//	12.5 – 2 = 10.5

public class Ej01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		System.out.println("-----------");
		
		double num1, num2, resu;
		String operador;
		
		System.out.print("Ingresa valor");
		num1 = tec.nextDouble();
		
		System.out.print("Ingresa valor");
		num2 = tec.nextDouble();
		tec.nextLine();
		
		System.out.print("Ingresa operación: ");
		operador = tec.nextLine();
		
		boolean error = false;
		
		switch(operador) {
			case "+":
				resu = num1 + num2;
				break;
			case "-":
				resu = num1 - num2;
				break;
			case "*":
				resu = num1 * num2;
				break;
			case "/":
				resu = num1 / num2;
				break;
			default:
				resu = 0;
				error = true;
		}
		if(!error)
			System.out.printf("%.3f %s %.3f = %.4f", num1, operador, num2, resu);
		else
			System.out.printf("El operador %s es incorrecto");
	}
}
