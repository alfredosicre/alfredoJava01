package j10_excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class E01 {
	
	public static void main(String[] args) {
		
		
		try {
		FileReader r = new FileReader("c:/datos/misdatos.dat");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// una excepcion es un mecanismo que nos dice que un metodo no ha funcionado bien.
		// hay dos alternativas, arreglamos el problema o avisamos hacia atras.
		
		
		
		
		
	}

}
