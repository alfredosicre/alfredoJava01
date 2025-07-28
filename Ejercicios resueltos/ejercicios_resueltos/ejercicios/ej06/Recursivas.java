package ejercicios.ej06;

public class Recursivas {
	
	// Ej 01
	// Factorial de n
	public long factorial(long n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
	
	// Ej 02
	// Suma de los primeros números naturales
	public int sumaNaturales(int n) {
		if (n == 1)
			return n;
		return n + sumaNaturales(n - 1);
	}
	
	// Ej 03
	// Cantidad de dígitos de un numero natural
	public int cantDigitos(int n) {
		if (n <=9)
			return 1;
		return 1 + cantDigitos(n / 10);
	}
	
	// Ej 04
	// Suma de los dígitos de un número natural
	public int sumaDigitos(int n) {
		if (n <=9)
			return n;
		return n % 10 + sumaDigitos(n / 10);
	}
	
	// Ej 05
	// Número enésimo de la serie de Fibonacci
	public static long fibonacci(long n) {
		if (n < 2)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	// Ej 06
	// Potencia
	public static int pow(int b, int e) {
		if (e == 0)
			return 0;
		return b * pow(b, e - 1);
	}
	
	// Ej 07
	// Transforma a binario
	public static String toBinaryString(int n) {
		if (n < 2)
			return "" + n;
		return "" + toBinaryString(n / 2) + (n % 2);
	}
	
	// Ej 08
	// Transforma a hexadecimal
	public static String toHexString(int n) {
		if (n < 16)
			return toDigitoHexString(n);
		return toHexString(n / 16) + toDigitoHexString(n % 16);
	}
	
	// Auxiliar del Ej 08
	private static String toDigitoHexString(int d) {
		if (d < 10)
			return "" + d;
		return "" + (char)('A' + (d - 10));
	}
	
	public static void main(String[] args) {

		System.out.println(toBinaryString(123456));
		System.out.println(Integer.toBinaryString(123456));
		
//		for (int i = 0; i < 16; i++) {
//			System.out.println(toDigitoHexString(i));
//		}
		
		System.out.println(toHexString(123456));
		System.out.println(Integer.toHexString(123456));
	}
	
}
