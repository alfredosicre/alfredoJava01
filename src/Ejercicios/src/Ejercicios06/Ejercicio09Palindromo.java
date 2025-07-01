package Ejercicios06;

public class Ejercicio09Palindromo {
	
	public static void main(String[] args) {
		
		String cadena = "abcd12344321dcba";
//		String cadena = "abda";
		int j = cadena.length();
		boolean bien = true;
		
		for(int i = 0; i < cadena.length(); i ++) {
			
			char caracterInicio = cadena.charAt(i); // empieza en cadena[0]
			char caracterFinal = cadena.charAt(j-1);// mira desde la posicion [j-1] es decir, la longitud de la cadena menos uno
			j = j - 1;
			
			if(caracterInicio != caracterFinal) {
				bien = false;
			}
			
		}
		if(bien == true) {
			System.out.println("La cadena: " + cadena + " es un Palindromo");
		}else {
			System.out.println("La cadena: " + cadena + " NO es un Palindromo");
		}
		
	}

}