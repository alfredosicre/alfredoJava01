package ejercicios.ej01;

import java.util.Scanner;

//Escribir un programa que lea de teclado dos tiempos expresados en horas, minutos y segundos; las sume y muestre el resultado en horas, minutos y segundos por pantalla
public class Ej12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("SUMA HORAS");
		System.out.println("----------");
		
		int h1, m1, s1, h2, m2, s2, horas, minutos, segundos;
		
		System.out.println("Tiempo 1");
		System.out.print("horas: ");
		h1 = tec.nextInt();
		System.out.print("minutos: ");
		m1 = tec.nextInt();
		System.out.print("segundos: ");
		s1 = tec.nextInt();

		System.out.println("Tiempo 2");
		System.out.print("horas: ");
		h2 = tec.nextInt();
		System.out.print("minutos: ");
		m2 = tec.nextInt();
		System.out.print("segundos: ");
		s2 = tec.nextInt();
		
		horas = h1 + h2;
		minutos = m1 + m2;
		segundos = s1 + s2;
		
		minutos += segundos / 60;
		segundos %= 60;
		horas += minutos / 60;
		minutos %= 60;
		
		System.out.printf("%2d:%2d:%2d + %2d:%2d:%2d = %d:%2d:%2d", h1, m1, s1, h2, m2, s2, horas, minutos, segundos);
	}
}
