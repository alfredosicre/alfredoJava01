package ejercicios.ej05;

// Escribe un programa que verifique si un número es un número Armstrong, 
//	es decir, si la suma de cada uno de sus dígito elevado a la cantidad de dígitos es igual al número. 
//	Por ejemplo, el número 371 es un numero de Armstrong, ya que 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371. 
//	Números de Armstrong para probar: 371, 8_208, 4_210_818

public class Ej07 {
	public static void main(String[] args) {
		System.out.println("SI " + esArmstrong(371));
		System.out.println("NO " + esArmstrong(3710));
		System.out.println("SI " + esArmstrong(8208));
		System.out.println("NO " + esArmstrong(8209));
		System.out.println("SI " + esArmstrong(4210818));
	}
	
	public static boolean esArmstrong(int num) {
		int suma = 0;
		int aux = num;
		int cantDigitos = (int)Math.ceil(Math.log10(num));
		while (aux != 0) {
			suma += Math.pow(aux % 10, cantDigitos);
			aux /= 10;
		}
		return num == suma;
	}
}
