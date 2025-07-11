package j10_excepciones;

import java.sql.SQLException;

public class e03 {
	
	public static void main(String[] args) {
		
		try {
			metodo(-5);
		} catch (SQLException e) {
			System.out.println("Esto arregla el programa");
			e.printStackTrace();
		} 
		System.out.println("El programa continua por aquí");
		
		
		
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
