package ejercicios.ej01;

import java.util.Scanner;

//Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número con el día del año (de 1 a 366) 
//	e imprima el día de la semana que le toca. 
//	Por ejemplo: si recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’
public class Ej19_a {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIA DEL AÑO");
		System.out.println("-----------");
		
		int dia;
		
		System.out.print("Número dia del año: ");
		dia = tec.nextInt();

		int indice = dia % 7;
		String nomDia;
		
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
