package tests;

import miscolecciones.genericos.Lista;
import miscolecciones.genericos.ListaArray;
import modelo.Figura;
import modelo.Circulo;
import modelo.Rectangulo;

public class Test03figuras {
	
	public static void main(String[] args) {
		
		Lista<Figura> lista = new ListaArray<Figura>();
		
		lista.agregar(new Circulo(1, 2, 3));
		lista.agregar(new Rectangulo(1, 2, 3, 4));
		
		for(int i = 0; i < lista.largo(); i++) {
			System.out.println(lista.buscar(i));
		}
		
		
		
	}

}
