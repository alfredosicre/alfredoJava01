package sets;

import java.util.Comparator;
	
public class StringComparatorCantLetras implements Comparator<String> { // definimos otro orden de ordenamiento
		
	
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}