package ejercicios.ej03;

import java.util.Scanner;

//Solicite al usuario una fecha e indicar los días que faltan hasta fin de mes

public class Ej12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIAS FIN DE MES");
		System.out.println("-------------------");
		
		int dia, mes, anyo, dias;
		
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
			System.out.printf("%02d/%02d/%d faltan %d días hasta fin de mes.\n", dia, mes, anyo, dias-dia);
		} else
			System.out.println("La fecha es incorrecta");
		
	}
}
