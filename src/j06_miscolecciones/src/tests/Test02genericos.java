package tests;

import miscolecciones.genericos.Lista;
import miscolecciones.genericos.ListaEnlazada;

public class Test02genericos {
	
	public static void main(String[] args) {
		
		Lista<Integer> listaNum = new ListaEnlazada<>();
		
		listaNum.agregar(1);
		listaNum.agregar(2);
		listaNum.agregar(3);
		listaNum.agregar(4);
		listaNum.agregar(5);
		listaNum.agregar(6);
		listaNum.agregar(7);
		listaNum.agregar(8);
		listaNum.agregar(9);
		listaNum.agregar(10);
		listaNum.agregar(11);
		listaNum.agregar(12);
		listaNum.agregar(13);
		
		System.out.println(listaNum.buscar(5)); // 6
		System.out.println(listaNum.buscar(17));// null
		System.out.println(listaNum.buscar(0)); // uno
		System.out.println(listaNum.buscar(11));// doce
		
		System.out.println();
		
		for (int i = 0; i < listaNum.largo(); i++) {
			System.out.println(listaNum.buscar(i));
		}
		
		
	}

}
