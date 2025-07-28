package ejercicios.ej02;

//Escribir un programa que imprima las tablas del 1 al 9

public class Ej11 {
	public static void main(String[] args) {

		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("---------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.println("\nTabla del " + i);
			System.out.println("-----------");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
	}
}
