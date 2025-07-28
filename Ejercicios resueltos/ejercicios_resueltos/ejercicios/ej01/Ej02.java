package ejercicios.ej01;

import java.util.Scanner;

//Dado el radio de un cIrculo, calcular su perImetro y su área
public class Ej02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("AREA Y PERIMETRO DEL CIRCULO");
		System.out.println("-------");
		
		double radio, area, perimetro;
		System.out.print("Radio: ");
		radio = tec.nextDouble();
		
		area = Math.PI * radio * radio;
		perimetro = 2 * Math.PI * radio;
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);

	}
}
