package string;

public class StringVsBuilder {
	
public static void main(String[] args) {
		
		String s = "";
		StringBuilder sb = new StringBuilder("Hola");
		
		System.out.println(sb);
		
		long t0, tf; // tiempo inicial y tiempo final
		
		// probamos con un String normal
		
		t0 = System.currentTimeMillis();
		for(int i = 1; i <= 400_000; i++) {
			
			s += "a";
			
		}
		tf = System.currentTimeMillis();
		System.out.println("String: " + (tf - t0));
		
		// ahora con StringBuilder
		
		t0 = System.currentTimeMillis();
		for(int i = 1; i <= 10_000_000; i++) {
			
			sb.append("a");
			
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (tf - t0));
		
		
	}

}
