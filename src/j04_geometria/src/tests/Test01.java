package tests;

import modelo.Figura;
import modelo.Rectangulo;
import modelo.Circulo;

public class Test01 {
	
	public static void main(String[] args) {
		
		//Figura f = new Figura();
		//Rectangulo r = new Rectangulo(1,2,3,4);
		//System.out.println(f.getX());
		
		// syso --- para sacar la linea System.out.println()
		
		Circulo c1 = new Circulo(1,2,3);
		Circulo c2 = new Circulo(1,2,333);
		
		System.out.println(c1.equals(c2));
		
	}
	
}
