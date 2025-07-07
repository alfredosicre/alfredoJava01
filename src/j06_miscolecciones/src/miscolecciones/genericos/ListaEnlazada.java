package miscolecciones.genericos;

import java.util.Iterator;

public class ListaEnlazada <T> implements Lista <T> {

	private Nodo primero;
	private Nodo ultimo;
	private int cant;
	
	
	
	@Override
	public void agregar(T dato) {
		// si esta vacia, primero es null y ultimo es null
		Nodo nuevo = new Nodo(dato);
		
		if(primero == null)
			primero = nuevo;
		else
			ultimo.siguiente = nuevo;
		
		ultimo = nuevo;
		cant++;
		
	}

	@Override
	public T eleminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T buscar(int pos) {
		if(pos < 0 || pos >=cant)
			return null;
		if(pos == 0)
			return primero.dato;
		if(pos == cant -1) // si me piden el ultimo dato
			return ultimo.dato;
		
		return anterior(pos).siguiente.dato;
	}
	
	// metodo auxiliar para buscar y borrar
	private Nodo anterior(int pos) {
		Nodo aux = primero;
		for(int i = 0; i < pos - 1; i++) {
			aux = aux.siguiente;
		}
	return aux;
		
	}

	@Override
	public boolean vacia() {
		
		return cant == 0;
	}

	@Override
	public int largo() {
		
		return cant;
	}
	
	// una clase puede contener dentro de su cuerpo una clase interna, pasa a ser un miembre de la clase
	private class Nodo {
		T dato;
		Nodo siguiente;
		
		Nodo (T dato){
			this.dato = dato;
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
