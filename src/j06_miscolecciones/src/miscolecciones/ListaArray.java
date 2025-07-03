package miscolecciones;

public class ListaArray implements Lista{
	
	private String[] almacen;
	private int cant;
	
	// hacemos un constructor con un array inicial de 10 posiciones
	public ListaArray() {
		almacen = new String[10];
	}
	
	// damos la opcion de que nos digan el tamaño de almacenamiento:
	// creamos otro constructor que me indique esa cantidad
	public ListaArray(int tamanyo) {
		almacen = new String[tamanyo];
	}
	
	
	

	@Override
	public void agregar(String dato) {
		
		if(almacen.length == cant) redimensionar(); // comprobamos si el array ya esta completo
		
		almacen[cant++] = dato;
		
	}

	@Override
	public String eleminar(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscar(int pos) { //buscame la posicion x y yo se la mando, es un metodo get
		// si nos mandan una posicion incorrecta, devuelve un null
		if(pos < 0 || pos >= cant)
			return null;
		return almacen[pos];
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
		
		String[] nuevo = new String[almacen.length * 2]; // creamos una nueva string
		for(int i = 0; i < almacen.length; i++) {
			nuevo[i] = almacen[i];
		}
		 almacen = nuevo;
		
	}
	

}
