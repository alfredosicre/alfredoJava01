package ejercicios.ej02;

import java.util.Scanner;

// Solicitando al usuario la cantidad de números a procesar, emitir el siguiente informe: 
//	Cantidad de nos. Ingresados: xx 
//	Sumatoria: xxx 
//	Cantidad de nros positivos o 0: xx 
//	Cantidad de nros negativos: xx 
//	Cantidad de nros pares: xx 
//	Cantidad de nros impares: xx 
//	Mayor valor: xxx – ingresado en el lugar: xx 
//	Menor valor: xxx – ingresado en el lugar: xx 
//	Media: xx

public class Ej09 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		System.out.println("INFORME NUMEROS");
		System.out.println("---------------");

		int cant, num, mayor=0, menor=0, posMayor=1, posMenor=1, sum=0, cantPos=0, cantNeg, cantPares=0, cantImpares;
		double media;
		

		System.out.print("Cantidad de números a procesar: ");
		cant = tec.nextInt();

		if (cant > 0) {
			System.out.println("Ingresa " + cant + " valores");

			for (int i = 1; i <= cant; i++) {
				System.out.print(i + " >");
				num = tec.nextInt();
				
				sum += num;
				if (i == 1)
					mayor = menor = num;
				
				if (num > mayor) {
					mayor = num;
					posMayor = i;
				} else if (num < menor) {
					menor = num;
					posMenor = i;
				}
				
				if (num >= 0)
					cantPos++;
				
				if (num % 2 == 0)
					cantPares++;
			}
			cantNeg = cant - cantPos;
			cantImpares = cant - cantPares;
			media = 1. * sum / cant;
			
			System.out.println("INFORME DE NÚMEROS INGRESADOS");
			System.out.printf("Cantidad de nos. Ingresados: %d\n", cant);
			System.out.printf("Sumatoria: %d\n", sum);
			System.out.printf("Cantidad de nros positivos o 0: %d\n", cantPos);
			System.out.printf("Cantidad de nros negativos o 0: %d\n", cantNeg);
			System.out.printf("Cantidad de nros pares: %d\n", cantPares);
			System.out.printf("Cantidad de nros imparres: %d\n", cantImpares);
			System.out.printf("Mayor valor: %d – ingresado en el lugar: %d\n", mayor, posMayor);
			System.out.printf("Menor valor: %d – ingresado en el lugar: %d\n", menor, posMenor);
			System.out.printf("Media: %.3f\n", media);
		}
	}
}
