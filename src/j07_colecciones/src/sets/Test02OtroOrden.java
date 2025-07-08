package sets;

import java.util.Comparator;
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
		System.out.println();
		
		// las clases anonimas -- ordena por el largo de la palabra de mayor a menos
		Set<String> set02 = new TreeSet<String>(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o2.length() - o1.length();
		}});
		
		// cargar el set02 con los valores que tiene cargado set
		set02.addAll(set);
		for(String s : set02) {
			System.out.println(s);
		}
		
	}

}
