package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Test02recorrelist {
	
	public static void main(String[] args) {
		
		final int cant = 20_200_000;
		long t0, tf;
		
		List<String> lista = new ArrayList<String>(cant);
		
		// agregamos informacion
		
		//lista.add("uno");
		//lista.add("dos");
		//lista.add("tres");
		//lista.add("cuatro");
		//lista.add("cinco");
		
		//System.out.println(lista.get(3));
		// pongo en pantalla todos los datos de lista
		//recorre(lista);
		
		// cargo en una LinkedList lista01 con los datos de la ArrayList lista
		List<String> lista01 = new LinkedList<String>();
		
		//recorre(lista01);
		cargaLista(lista, cant);
		cargaLista(lista01, cant);
		
		System.out.println("Listas cargadas");
		System.out.println(lista.size());
		System.out.println(lista01.size());
		
		t0 = System.currentTimeMillis();
		//recorre(lista);
		recorreIterator(lista);
		tf = System.currentTimeMillis();
		System.out.println("ArrayList: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		//recorre(lista01);
		recorreIterator(lista01);
		tf = System.currentTimeMillis();
		System.out.println("LinkedList: " + (tf-t0));
		
		
	}
	
	//-------------------------------------------------
	
	//cargamos lista con valores
	public static void cargaLista(List<String> lista, int cant) {
		for(int i = 1; i <= cant; i++) {
			lista.add("Objeto" + i);
		}
	}
	
	public static void recorre(List<String> lista) { // este recorre es muy lento para el LinkedList, por eso se utiliza el iterator
		for(int i = 0; i < lista.size(); i++) {
			String elemento = lista.get(i);
			// a partir de aqui trabajo con elemento
			
		}
	}
	
	public static void recorreIterator(List<String> lista) { // hace lo mismo que el otro recorre
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String elemento = it.next();
			// trabajo con elemento
		}
	}
	
	public static void recorreForEach(List<String> lista) { // ForEach
		for(String elemento : lista) {
			// trabajo con elemento
		}
		
	}

}
