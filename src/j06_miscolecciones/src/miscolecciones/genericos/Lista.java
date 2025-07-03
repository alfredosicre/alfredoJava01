package miscolecciones.genericos;

public interface Lista <T> { // tipo <T> es tipo de dato generico, hay que decirle que tipo de dato es
	
	void agregar(T dato);
	
	T eleminar(int pos);
	
	T buscar(int pos);
	
	boolean vacia();
	
	int largo();
 
}
