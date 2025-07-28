package ejercicios.ej03;

import java.util.Scanner;

//Solicite al usuario una fecha e indicar la cantidad de días transcurridos en ese año hasta esa fecha.

public class Ej13 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIAS TRANSCURRIDOS");
		System.out.println("------------------");
		
		int dia, mes, anyo, dias, cantDias = 0;
		
		System.out.println("Ingresa fecha");
		System.out.print("Dia: ");
		dia = tec.nextInt();
		System.out.print("Mes: ");
		mes = tec.nextInt();
		System.out.print("Anyo: ");
		anyo = tec.nextInt();
		
		if (mes == 2) {
			dias = 28;
		} else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias = 30;
		} else {
			dias = 31;
		}

		
		if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= dias) {
			switch(mes) {
			case 12:
				cantDias += 30;
			case 11:
				cantDias += 31;
			case 10:
				cantDias += 30;
			case 9:
				cantDias += 31;
			case 8:
				cantDias += 31;
			case 7:
				cantDias += 30;
			case 6:
				cantDias += 31;
			case 5:
				cantDias += 30;
			case 4:
				cantDias += 31;
			case 3:
				cantDias += 28;
			case 2:
				cantDias += 31;
			case 1:
				cantDias += dia;
			}
			System.out.printf("%02d/%02d/%d han transcurrido %d días desde principio de año.\n", dia, mes, anyo, cantDias);
		} else
			System.out.println("La fecha es incorrecta");
		
	}
}
