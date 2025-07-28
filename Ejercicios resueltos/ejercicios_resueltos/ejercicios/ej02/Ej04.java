package ejercicios.ej02;

import java.util.Scanner;

//De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.

public class Ej04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR");
		System.out.println("-------------");

		int cant;
		double num, mayor, menor;

		System.out.print("Cantidad de números a procesar: ");
		cant = tec.nextInt();

		if (cant > 0) {
			System.out.println("Ingresa " + cant + " valores");
			System.out.print("1 >");
			num = tec.nextDouble();
			menor = mayor = num;

			for (int i = 2; i <= cant; i++) {
				System.out.print(i + " >");
				num = tec.nextDouble();
				if (num > mayor) {
					mayor = num;
				} else if (num < menor) {
					menor = num;
				}
			}
			System.out.println("El mayor es: " + mayor);
			System.out.println("El menor es: " + menor);
		}
	}
}
