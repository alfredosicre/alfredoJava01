package ejercicios.ej03;

import java.util.Scanner;

//Solicite al usuario un número que represente el mes e imprima su nombre.

public class Ej09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("NOMBRE MESES");
		System.out.println("------------");
		
		int mes;
		String nombreMes;
		
		System.out.print("Ingresa nro de mes");
		mes = tec.nextInt();
		
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes = "INCORRECTO";
		}
		System.out.printf("El mes %d es %s.\n", mes, nombreMes);
	}
}
