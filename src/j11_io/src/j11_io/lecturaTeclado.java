package j11_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lecturaTeclado {
	
	
	
	
	
	public static void lee() {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa algo: ");
		try {
			String algo = br.readLine();
		} catch (IOException e) {
			throw new lecturaTecladoException();
		}	
	}
	

}
