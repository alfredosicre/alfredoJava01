package Ejercicios05;

public class Ejercicio03 { // Escribe un método que retorne la suma de los dígitos de un número entero (ejemplo: 1234 -
	                      //  > 1+2+3+4 = 10).
	
	public static void main(String[] args) {
		
		int num = 123456789;
		int suma = 0;
		int entero = 0;
		
		int digitos = String.valueOf(Math.abs(num)).length();
		
		for(int i = 1; i <= digitos; i++) {
			entero = num % 10;
			num = num / 10;
			suma = suma + entero;
		}
		System.out.println("La suma de los digitos es: " + suma);
	}

}
