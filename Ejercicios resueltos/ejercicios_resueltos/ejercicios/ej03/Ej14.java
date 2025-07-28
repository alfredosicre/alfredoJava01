package ejercicios.ej03;

import java.util.Scanner;

//Solicite al usuario una fecha e indicar los días que faltan hasta fin de año. (se supone que el año no es bisiesto)

public class Ej14 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIAS HASTA FIN DE AÑO");
		System.out.println("---------------------");
		
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
			case 1:
				cantDias += 31;
			case 2:
				cantDias += 28;
			case 3:
				cantDias += 31;
			case 4:
				cantDias += 30;
			case 5:
				cantDias += 31;
			case 6:
				cantDias += 30;
			case 7:
				cantDias += 31;
			case 8:
				cantDias += 31;
			case 9:
				cantDias += 30;
			case 10:
				cantDias += 31;
			case 11:
				cantDias += 30;
			case 12:
				cantDias += 31;
			}
			cantDias -= dia;
			System.out.printf("%02d/%02d/%d faltan %d días hasta fin de año.\n", dia, mes, anyo, cantDias);
		} else
			System.out.println("La fecha es incorrecta");
		
	}
}
