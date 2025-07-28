package ejercicios.ej03;

import java.util.Scanner;

//Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado: 
//	Dado un precio y una cantidad de dinero, el programa nos dirá cuántas monedas deben darse 
//	como cambio de tal forma que el número total de monedas sea mínimo.

public class Ej16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("CAJA");
		System.out.println("----");
		
		double importe, pago;
		
		System.out.print("Total a pagar: ");
		importe = tec.nextDouble();
		
		System.out.print("Recibido: ");
		pago = tec.nextDouble();
		
		muestraCambio(importe, pago);
	}
	
	public static void muestraCambio(double aPagar, double pago) {
		int c1, c2, c5, c10, c20, c50, e1, e2;
		int vueltaCent = (int)Math.round((pago - aPagar) * 100);
		
		System.out.println("Vuelta: " + vueltaCent / 100. + "€.");
		
		if (vueltaCent > 0) {
			e2 = vueltaCent / 200;
			vueltaCent %= 200;
			e1 = vueltaCent / 100;
			vueltaCent %= 100;
			c50 = vueltaCent / 50;
			vueltaCent %= 50;
			c20 = vueltaCent / 20;
			vueltaCent %= 20;
			c10 = vueltaCent / 10;
			vueltaCent %= 10;
			c5 = vueltaCent / 5;
			vueltaCent %= 5;
			c2 = vueltaCent / 2;
			vueltaCent %= 2;
			c1 = vueltaCent;
			
			System.out.println();
			System.out.print((e2 > 0 ? "2.00€: " + e2 + "\n" : ""));
			System.out.print((e1 > 0 ? "1.00€: " + e1 + "\n" : ""));
			System.out.print((c50 > 0 ? "0.50€: " + c50 + "\n" : ""));
			System.out.print((c20 > 0 ? "0.20€: " + c20 + "\n" : ""));
			System.out.print((c10 > 0 ? "0.10€: " + c10 + "\n" : ""));
			System.out.print((c5 > 0 ? "0.05€: " + c5 + "\n" : ""));
			System.out.print((c2 > 0 ? "0.02€: " + c2 + "\n" : ""));
			System.out.print((c1 > 0 ? "0.01€: " + c1 + "\n" : ""));
		}
	}
}
