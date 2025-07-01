package Ejercicios07;

public class Ejercicio05 {

    public static void main(String[] args) {
    	
        System.out.println(repite('a', 4));  // Salida: aaaa
        System.out.println(repite('x', 7));  // Salida: xxxxxxx
    }
    
    public static String repite(char c, int n) { 
		
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            resultado.append(c);
        }
        return resultado.toString();
    }
	

}
