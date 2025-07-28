package ejercicios.ej01;

import java.util.Scanner;

//Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos de un tiempo dado en segundos
public class Ej08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("HORAS MINUTOS SEGUNDOS");
		System.out.println("----------------------");
		
		int horas, minutos, segundos, segundosIni;
		
		System.out.print("Segundos: ");
		segundosIni = tec.nextInt();

		segundos = segundosIni;
		horas = segundosIni / 3600;
		segundos %= 3600;
		minutos = segundos / 60;
		segundos %= 60;
		
		System.out.println(segundosIni + "s. = " + horas + ":" + minutos + ":" + segundos);
		
		System.out.printf("%ds. = %02d:%02d:%02d", segundosIni, horas, minutos, segundos);
	}
}
