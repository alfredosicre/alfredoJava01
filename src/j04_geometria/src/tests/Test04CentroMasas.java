package tests;

import modelo.Rectangulo;
import modelo.Circulo;
import modelo.Figura;
import modelo.Punto;

public class Test04CentroMasas {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(1,1,2,5);
		Rectangulo r2 = new Rectangulo(15,1,21,1.5);
		Circulo c1 = new Circulo(1,1,1);
		Circulo c2 = new Circulo(-11,10,1110);
		
		Punto centroMasa = Figura.centroMasas(r1,r2,c1,c2);
		System.out.println(centroMasa);
		
	}

}
