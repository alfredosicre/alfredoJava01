package j11_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	public static void main(String[] args) {
		
		String fichero = "/Users/Mananas/ContactoDaoMem.java";
		System.out.println(muestraFichero(fichero));
		
	}
	
// --------------------------------------------------------------------------
	
	public static String muestraFichero(String fichero) {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fichero));
			String linea;
			while ((linea = br.readLine()) != null) {
				sb.append(linea + "\n"); // añado la linea del fichero leido a sb que es el StringBuilder mas el salto de linea
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) { // si el fichero se pudo abrir
				try {
					br.close(); // cerramos el fichero si se consiguio abrir
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}

}
