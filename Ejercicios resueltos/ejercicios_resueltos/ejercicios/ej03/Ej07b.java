package ejercicios.ej03;

import java.util.Scanner;

public class Ej07b {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		System.out.print("Ingrese un valor positivo ");
		int num = tec.nextInt();
		
		if(num == invierte(num))
			System.out.println("es capicua");
		else
			System.out.println("no");
	}
	
	public static int invierte(int num) {
		int inv = 0;
		while (num > 0) {
			inv = inv * 10 + num % 10;
			num /= 10;
		} 
		return inv;
	}
}
