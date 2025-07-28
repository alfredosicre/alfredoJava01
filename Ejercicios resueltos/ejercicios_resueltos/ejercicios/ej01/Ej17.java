package ejercicios.ej01;

import java.util.Scanner;

//Hacer otro programa que ingresando los mismos datos que el anterior, calcule el Capital final.
//	No se hace ningún reintegro y la capitalización de los intereses es anual.
//	𝐶𝑓=𝐶𝑖(1+𝑟/𝑛)^𝑛𝑡
//	Cf: Capital Final Ci: Capital Inicial r: tasa de interés
//	n: cantidad de capitalizaciones anuales t: tiempo (cantidad de años)
public class Ej17 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("INTERES SIMPLE");
		System.out.println("--------------");
		
		double capitalIni, razon, tiempo, n, capitalFin;
		
		System.out.print("Capital a invertir: ");
		capitalIni = tec.nextDouble();

		System.out.print("Interés anual (%): ");
		razon = tec.nextDouble();
		razon /= 100;
		
		System.out.print("Cantidad de años: ");
		tiempo = tec.nextDouble();
		
		System.out.print("Cantidad de capitalizaciones anuales: ");
		n = tec.nextDouble();
		
		capitalFin = capitalIni * Math.pow(1 + razon / n, n * tiempo);
		
		System.out.printf("Capital final: %.2f\n" ,capitalFin);
		System.out.println(capitalFin);
	}
}
