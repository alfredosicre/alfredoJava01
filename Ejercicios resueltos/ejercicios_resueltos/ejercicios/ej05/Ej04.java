package ejercicios.ej05;

// Crea un método que determine si un número es "perfecto", es decir, si la suma de sus divisores propios es 
//	igual al número mismo. Los divisores propios de un número son los divisores positivos menores que él 
//	(sin incluir al número), por ejemplo, los divisores propios de 6 son: 1, 2 y 3. 
//	Además la suma de los divisores propios de 6 es igual a 6, entonces 6 es un número perfecto. 
//	(1 + 2 + 3 = 6). Números perfectos para probar: 6, 28, 496, 8_128, 33_550_336.

public class Ej04 {
	public static void main(String[] args) {
		System.out.println(sumaDivisoresPropios(6));
		System.out.println(sumaDivisoresPropios(100));
		
		System.out.printf("¿6 es perfecto? %s\n", esPerfecto(6) ? "SI" : "NO");
		System.out.printf("¿15 es perfecto? %s\n", esPerfecto(15) ? "SI" : "NO");
		System.out.printf("¿28 es perfecto? %s\n", esPerfecto(28) ? "SI" : "NO");
		System.out.printf("¿495 es perfecto? %s\n", esPerfecto(495) ? "SI" : "NO");
		System.out.printf("¿496 es perfecto? %s\n", esPerfecto(496) ? "SI" : "NO");
		System.out.printf("¿497 es perfecto? %s\n", esPerfecto(497) ? "SI" : "NO");
		System.out.printf("¿33.550.336 es perfecto? %s\n", esPerfecto(33_550_336) ? "SI" : "NO");
	}
	
	public static boolean esPerfecto(int num) {
		return num == sumaDivisoresPropios(num);
	}
	
	public static int sumaDivisoresPropios(int num) {
		int suma = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				suma += i;
		}
		return suma;
	}
	
}
