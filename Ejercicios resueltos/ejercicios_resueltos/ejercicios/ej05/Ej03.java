package ejercicios.ej05;

// Escribe un método que retorne la suma de los dígitos de un número entero (ejemplo: 1234 -> 1+2+3+4 = 10).

public class Ej03 {
	public static void main(String[] args) {
		System.out.println(sumaDigitos(1234));
		System.out.println(sumaDigitos(651234));
		System.out.println(sumaDigitos(0));
		System.out.println(sumaDigitos(-651234));
	}
	
	public static int sumaDigitos(int num) {
		int suma = 0;
		while(num != 0) {
			suma += num % 10;
			num /= 10;
		}
		return suma;
	}
}
