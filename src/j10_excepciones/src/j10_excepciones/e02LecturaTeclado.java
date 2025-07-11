package j10_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class e02LecturaTeclado {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad: ");
		int edad = 0;
		try {
			edad = tec.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Solo numeros...");
		};
		
	}

}
