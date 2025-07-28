package ejercicios.ej03;

import java.util.Scanner;

//Solicite al usuario un número que represente el mes e imprima su nombre y la cantidad de días que tiene (no contemplar años bisiestos).

public class Ej10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("NOMBRE MESES Y DIAS");
		System.out.println("-------------------");
		
		int mes, dias = 31;
		String nombreMes;
		
		System.out.print("Ingresa nro de mes");
		mes = tec.nextInt();
		
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			dias = 28;
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			dias = 30;
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			dias = 30;
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			dias = 30;
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			dias = 30;
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes = "INCORRECTO";
			dias = 0;
		}
		System.out.printf("El mes %d es %s y tiene %d días.\n", mes, nombreMes, dias);
	}
}
