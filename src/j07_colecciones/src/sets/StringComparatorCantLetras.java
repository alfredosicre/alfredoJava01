package sets;

import java.util.Comparator;


// este mecanismo no se utiliza	
public class StringComparatorCantLetras implements Comparator<String> { // definimos otro orden de ordenamiento
		
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	// define el orden natural
	// <0 this va antes que o
	// =0 son iguales
	// >0 this va despues de 0
}