package miscolecciones;

public interface Lista {
	
	void agregar(String dato);
	
	String eleminar(int pos);
	
	String buscar(int pos);
	
	boolean vacia();
	
	int largo();
 
}
