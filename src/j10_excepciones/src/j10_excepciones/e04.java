package j10_excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class e04 {
	
	public static void main(String[] args) throws IOException {
		
		try {
			otroProblematico(0);
		} catch (FileNotFoundException e) {
			// arreglo FileNotFound...
			e.printStackTrace();
		}
		
		try {
			otroProblematico(3);
			
		} finally { // finally hace que siempre se ejecute, si hay error o no
			System.out.println("Esto si o si se debe ejecutar");
		}
		
		
	}

// -----------------------------------------------------------------
	
	public static void otroProblematico(int num) throws IOException {
		switch(num){
			case 1:
				throw new ArrayIndexOutOfBoundsException();
			case 2:
				throw new RuntimeException();
			case 3:
				throw new FileNotFoundException();
			case 4:
				throw new IOException();
		}
		
	}
	
	public static void metodo3() {
		try {
			otroProblematico(0);
		} catch (Exception  e) {
			// arregla cualquier excepcion
		}
	}
	
	public static void metodo4() {
		try {
			otroProblematico(0);
		} catch (ArrayIndexOutOfBoundsException | FileSystemNotFoundException e) {
			// arregla array o filenot
			
		} catch (RuntimeException | IOException e) {
			// arregla runtime o IOE	
		}
	}
	
	
}
