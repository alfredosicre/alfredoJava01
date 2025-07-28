package ejercicios.ej03;

import java.util.Scanner;

//Solicitar una fecha (día, mes, año) y validar si es una fecha correcta sin contemplar años bisiestos, 
//	es decir, no se puede ingresar 29 2 xxxx.

public class Ej11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("NOMBRE MESES Y DIAS");
		System.out.println("-------------------");
		
		int dia, mes, anyo, dias = 31;
		String nombreMes;
		
		System.out.println("Ingresa fecha");
		System.out.print("Dia: ");
		dia = tec.nextInt();
		System.out.print("Mes: ");
		mes = tec.nextInt();
		System.out.print("Anyo: ");
		anyo = tec.nextInt();
		
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
		
		if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= dias) {
			System.out.println("La fecha es correcta.");
			System.out.printf("%02d/%02d/%d es el %d de %s del %d.\n", dia, mes, anyo, dia, nombreMes, anyo);
		} else
			System.out.println("La fecha es incorrecta");
		
	}
}
