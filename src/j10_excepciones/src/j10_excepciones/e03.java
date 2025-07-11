package j10_excepciones;

import java.sql.SQLException;

public class e03 {
	
	public static void main(String[] args) throws SQLException {
		
		metodo(-5); 
		
	}
	
	
	
	
	
	public static void otroMetodo(int num) {
		try {
			problematico(num);
		} catch (SQLException e) {
			// esto es el arreglo del problema
			e.printStackTrace();
		}
	}
	
	public static void metodo(int num) throws SQLException{
		problematico(num);
		
	}
	
	public static void problematico(int valor) throws SQLException {
		
		if(valor == 0)
			throw new IllegalArgumentException();
		
		if(valor < 0) {
			throw new SQLException();
		}
	}

}
