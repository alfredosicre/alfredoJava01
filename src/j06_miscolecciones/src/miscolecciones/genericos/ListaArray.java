package miscolecciones.genericos;

import java.util.Iterator;

public class ListaArray <T> implements Lista <T>{
	
	private Object[] almacen;
	private int cant;
	
	// hacemos un constructor con un array inicial de 10 posiciones
	public ListaArray() {
		almacen = new Object[10];
	}
	
	// damos la opcion de que nos digan el tamaño de almacenamiento:
	// creamos otro constructor que me indique esa cantidad
	public ListaArray(int tamanyo) {
		almacen = new Object[tamanyo];
	}
	
	
	

	@Override
	public void agregar(T dato) {
		
		if(almacen.length == cant) redimensionar(); // comprobamos si el array ya esta completo
		
		almacen[cant++] = dato;
		
	}

	@Override
	public T eleminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T buscar(int pos) { //buscame la posicion x y yo se la mando, es un metodo get
		// si nos mandan una posicion incorrecta, devuelve un null
		if(pos < 0 || pos >= cant)
			return null;
		return (T)almacen[pos];
	}

	@Override
	public boolean vacia() { // comprobamos si el array esta bacia
		return cant == 0; // al poner == ya es como un if, comprueba si cantidad es cero o no
	}

	@Override
	public int largo() {
		
		return cant;
	}
	
	private void redimensionar() {
		
		Object[] nuevo = new Object[almacen.length * 2]; // creamos una nueva string
		for(int i = 0; i < almacen.length; i++) {
			nuevo[i] = almacen[i];
		}
		 almacen = nuevo;
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
