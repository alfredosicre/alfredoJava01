package lists;

import java.util.ArrayList;
import java.util.List;

public class Test01 { // ARRAYLIST 
	
	public static void main(String[] args) {

		/* creamos un arraylist lista01 para trabajar */
		
		List<String> lista01 = new ArrayList<String>();
		
		// agregamos informacion
		
		lista01.add("uno");
		lista01.add("dos");
		lista01.add("tres");
		lista01.add("cuatro");
		lista01.add("cinco");
		
		System.out.println(lista01.get(3));
		
		
	}

}
