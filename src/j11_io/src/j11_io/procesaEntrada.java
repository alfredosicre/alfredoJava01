package j11_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class procesaEntrada {
	
	public static void main(String[] args) throws IOException, MalformedURLException {
		
//		FileReader fr = new FileReader("/Users/Mananas/ContactoDaoMem.java");
//		System.out.println(leerEntrada(System.in));
		
		URL url = new URL("https://www.elmundo.es");
		System.out.println(leerEntrada(url.openStream()));
		
	}
	
	
// ------------------------------------------------------	
	public static String leerEntrada(InputStream is) {
		return leerEntrada(new InputStreamReader(is));
	}
	
	
	public static String leerEntrada(Reader r) {
		
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(r)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				sb.append(linea + "\n");
			}
		} catch (IOException e) {
			// hacer un log - genera ficheros 
			throw new RuntimeException();
		}
		return sb.toString();
	}

}
