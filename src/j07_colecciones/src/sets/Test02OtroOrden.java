package sets;

import java.util.Set;
import java.util.TreeSet;
import sets.StringComparatorLetras;

public class Test02OtroOrden {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new StringComparatorCantLetras()); // creamos un TreeSet
		
		set.add("uno");
		set.add("dos");
		set.add("tres");
		set.add("cuatro");
		set.add("cinco");
		set.add("AS");
		set.add("ZAPATO");
		set.add("Ávila");
		set.add("ágil");
		

		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
