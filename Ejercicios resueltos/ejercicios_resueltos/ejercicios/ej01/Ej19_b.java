package ejercicios.ej01;

import java.util.Scanner;

//Escribir un programa que reciba el día en que comenzó el año (lunes, martes, etc.) ingresando (1, 2, etc.) y un número con el día del año (de 1 a 366) 
//	e imprima el día de la semana que le toca. 
//	
public class Ej19_b {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIA DEL AÑO");
		System.out.println("-----------");
		
		int dia, primerDia;
		
		System.out.println("Indique que día fue el 1 de enero");
		System.out.println("1 - Lunes");
		System.out.println("2 - Martes");
		System.out.println("3 - Miércoles");
		System.out.println("4 - Jueves");
		System.out.println("5 - Viernes");
		System.out.println("6 - Sábado");
		System.out.println("7 - Domingo");
		
		System.out.print(">");
		primerDia = tec.nextInt();
		primerDia %= 7;
		
		System.out.print("Número dia del año: ");
		dia = tec.nextInt();

		int indice = dia % 7 + primerDia - 1;
		String nomDia;
		System.out.println(indice);
		switch (indice) {
		case 0:
			nomDia = "Domingo";
			break;
		case 1:
			nomDia = "Lunes";
			break;
		case 2:
			nomDia = "Martes";
			break;
		case 3:
			nomDia = "Miércoles";
			break;
		case 4:
			nomDia = "Jueves";
			break;
		case 5:
			nomDia = "Viernes";
			break;
		case 6:
			nomDia = "Sábado";
			break;
		default:
			nomDia = "DIA ERRONEO";
		}
		
		System.out.println("El día " + dia + " fue " + nomDia);
	}
}
