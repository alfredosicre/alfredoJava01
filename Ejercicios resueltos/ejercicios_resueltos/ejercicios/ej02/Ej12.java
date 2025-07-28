package ejercicios.ej02;

import java.util.Scanner;

//Escribir un programa que reciba un número n e imprima los primeros n números triangulares, junto con su índice. Los números triangulares se obtienen mediante la suma de los números naturales desde 1 hasta el índice n. Por ejemplo, el número triangular de índice 4 es 1+2+3+4 = 10. Entonces, si se piden los primeros 5 números triangulares, el programa debe imprimir (sin los comentarios entre paréntesis):
//	1 – 1 (1)
//	2 – 3 (1+2)
//	3 – 6 (1+2+3)
//	4 – 10 (1+2+3+4)
//	5 – 15 (1+2+3+4+5)

public class Ej12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("NUMEROS TRIANGULARES");
		System.out.println("--------------------");
		
		int num, triangular = 0;
		
		System.out.print("Hasta que numero: ");
		num = tec.nextInt();
		
		for (int i = 1; i <= num; i++) {
			triangular = 0;
			for (int j = 1; j <= i; j++) {
				triangular += j;
			}
			System.out.printf("%d - %d\n", i, triangular);
		}
		
	}
}
