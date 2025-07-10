package interfaces;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test02OtroOrden {
	
	public static void main(String[] args) {
		
		// creamos un TreeSet
//		Set<String> set = new TreeSet<String>(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o2.length() - o1.length();
//			}
//			});
		
//		Set<String> set = new TreeSet<String>((String o1, String o2) -> {
//			return o2.length() - o1.length();
//		});
		
		// esto es lo mismo que lo de arriba, se puede hacer asi si solo hay una linea de codigo. Es un metodo LAMBDA
		
		Set<String> set = new TreeSet<String>((o1, o2) -> 
			o2.length() - o1.length());
		
		
		set.add("uno");
		set.add("dos");
		set.add("tres");
		set.add("cuatro");
		set.add("cinco");
		set.add("AS");
		set.add("ZAPATO");
		set.add("Ávila");
		set.add("ágil");
		set.add("99999999");
		set.add("9999999999");
		set.add("99999999999");
		set.add("8888888888888");
		set.add("555555555555555");
		
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		set.forEach((s) -> System.out.println(s));
		set.forEach(System.out::println); // los dos son lo mismo
		
		
		
	}

}
