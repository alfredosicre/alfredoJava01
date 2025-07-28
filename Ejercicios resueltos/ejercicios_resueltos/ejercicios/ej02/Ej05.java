package ejercicios.ej02;

import java.util.Scanner;

//Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos.

public class Ej05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("POSITIVOS");
		System.out.println("---------");

		int cant, cantPos = 0;
		double num;
		
		System.out.print("Cantidad de números a procesar: ");
		cant = tec.nextInt();

		if (cant > 0) {
			System.out.println("Ingresa " + cant + " valores");

			for (int i = 1; i <= cant; i++) {
				System.out.print(i + " >");
				num = tec.nextDouble();
				if (num > 0)
					cantPos++;
			}
			System.out.println("Has ingresado " + cantPos + " positivos.");
		}
	}
}
