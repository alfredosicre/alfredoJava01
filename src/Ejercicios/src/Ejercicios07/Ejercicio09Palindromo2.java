package Ejercicios06;

public class Ejercicio09Palindromo2 {
	
	public static void main(String[] args) {

		String cadena = "abcd12344321dcba";
//		String cadena = "abda";
		
		System.out.println(palindromo(cadena));
		
		
		if(palindromo(cadena)) { // si el return es True
			System.out.println("La cadena: " + cadena + " es un Palindromo");
		}else {
			System.out.println("La cadena: " + cadena + " NO es un Palindromo");
		}
	}
	//------------------------------------------------------------------------------------------------	
		
		
	public static boolean palindromo (String cadena) {
		if(cadena.length()<=1) {
			return true;
		}
		char caracterInicio = cadena.charAt(0);
		char caracterFinal = cadena.charAt(cadena.length()-1);
		
		return caracterInicio == caracterFinal && palindromo(cadena.substring(1, cadena.length()-1));
	}

}