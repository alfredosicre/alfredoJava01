package ejercicios.ej01;

import java.util.Scanner;

//Hacer un algoritmo que permita obtener la cantidad de segundos en un tiempo dado en horas, minutos y segundos.
public class Ej07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("OBTENER SEGUNDOS");
		System.out.println("----------------");
		
		int horas, minutos, segundos, segundosTot;
		
		System.out.print("Horas: ");
		horas = tec.nextInt();
		System.out.print("Minutos: ");
		minutos = tec.nextInt();
		System.out.print("Segundos: ");
		segundos = tec.nextInt();

		segundosTot = horas * 3600 + minutos * 60 + segundos;
		
		System.out.println(horas + ":" + minutos + ":" + segundos + " = " + segundosTot + " s.");
		
		System.out.printf("%02d:%02d:%02d = %d s.", horas, minutos, segundos, segundosTot);
	}
}
