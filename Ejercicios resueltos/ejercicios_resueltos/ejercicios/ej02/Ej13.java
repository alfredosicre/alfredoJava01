package ejercicios.ej02;

//Escribir un programa que imprima por pantalla todas las fichas de dominó, de una por línea y sin repetir.
//	0 : 0 
//	0 : 1 
//	…

public class Ej13 {
	public static void main(String[] args) {
		
		System.out.println("FICHAS DOMINÓ");
		System.out.println("-------------");
		
		for (int i = 0; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				System.out.printf("%d : %d\n", i, j);
			}
			System.out.println();
		}
		
	}
}
