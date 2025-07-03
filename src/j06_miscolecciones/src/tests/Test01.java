package tests;
import miscolecciones.Lista;
import miscolecciones.ListaArray;
import miscolecciones.ListaEnlazada;

public class Test01 {
	
	public static void main(String[] args) {
		
//		Lista lista1 = new ListaArray(); 
		Lista lista1 = new ListaEnlazada();
		lista1.agregar("uno");
		lista1.agregar("dos");
		lista1.agregar("tres");
		lista1.agregar("cuatro");
		lista1.agregar("cinco");
		lista1.agregar("seis");
		lista1.agregar("siete");
		lista1.agregar("ocho");
		lista1.agregar("nueve");
		lista1.agregar("diez");
		lista1.agregar("once");
		lista1.agregar("doce");
		
		lista1.buscar(5); // devuelve seis
		lista1.buscar(17); // devuelve null
		
		System.out.println(lista1.buscar(5));
		System.out.println(lista1.buscar(17));
		System.out.println(lista1.buscar(0)); // uno
		System.out.println(lista1.buscar(11));// doce
		
		System.out.println();
		
		for (int i = 0; i < lista1.largo(); i++) {
			System.out.println(lista1.buscar(i));
		}
		
	}

}
