package ejercicios.ej03;

import java.util.Scanner;

//Realizar el juego “Adivina número”

public class Ej17 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("ADIVINA NUMERO");
		System.out.println("--------------");
		
		int num = generaNumero();
		
		System.out.print("Intento 1: ");
		int intento = tec.nextInt();
		int buenos, regulares, intentos = 1, aux;
		boolean acierto = false;
		
		do {
			buenos = regulares = 0;
			for (int i = 1; i <= 4; i++) {
				aux = num;
				for (int j = 1; j <= 4; j++) {
					if (intento % 10 == aux % 10) {
						if (i == j)
							buenos++;
						else
							regulares++; 
					}
					aux /= 10;
				}
				intento /= 10;
			}
			if (buenos == 4) {
				acierto = true;
				System.out.println("Has acertado!!! en " + intentos + " intentos.");
			} else {
				System.out.printf("%d buenos y %d regulares\n", buenos, regulares);
				intentos++;
				System.out.printf("Intento %d: ", intentos);
				intento = tec.nextInt();
			}
		} while(!acierto);
		
	}
	
	public static int generaNumero() {
		int u, d, c, m;
		u = random();
		do {
			d = random();
		} while (d == u);
		do {
			c = random();
		} while (c == u || c == d);
		do {
			m = random();
		} while (m == u || m == d || m == c || m == 0);
		
		return m * 1000 + c * 100 + d * 10 + u;
	}
	
	static int random() {
		return (int)(Math.random() * 10);
	}
}
