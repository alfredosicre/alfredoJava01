package ejercicios.ej01;

import java.util.Scanner;

//Hacer un programa que dado un número entero n, indica si es o no par
public class Ej13 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("PAR IMPAR");
		System.out.println("---------");
		
		int num;
		
		System.out.print("NUM: ");
		num = tec.nextInt();
		
		System.out.println(num + " es " + (num%2==0 ? "par." : "impar."));
	}
}
