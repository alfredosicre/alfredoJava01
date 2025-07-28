package ejercicios.ej01;

import java.util.Scanner;

//Escribir un programa que le pregunte al usuario una cantidad de euros a invertir o capital inicial (Ci), 
//	una tasa de interés anual (R) y un número de años (T) y muestre como resultado el monto final a obtener. 
//	Como se irán retirando los intereses generados por año, se debe calcular con la fórmula de interés simple.
//	𝐼=𝐶∗𝑅∗𝑇
public class Ej16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("INTERES SIMPLE");
		System.out.println("--------------");
		
		double capital, razon, tiempo, interes;
		
		System.out.print("Capital a invertir: ");
		capital = tec.nextDouble();

		System.out.print("Interés anual (%): ");
		razon = tec.nextDouble();
		razon /= 100;
		
		System.out.print("Cantidad de años: ");
		tiempo = tec.nextDouble();
		
		interes = capital * razon * tiempo;
		
		System.out.println("Interes obtenido: " + interes);
	}
}
