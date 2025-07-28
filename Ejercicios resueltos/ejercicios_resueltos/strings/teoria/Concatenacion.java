package strings.teoria;

public class Concatenacion {
	public static void main(String[] args) {
		final int CANT = 250_000;
		final int CANT2 = 5_000_000;
		@SuppressWarnings("unused")
		String s = "";
		long t0, tf;
		
		StringBuilder sb = new StringBuilder("");
		StringBuffer sbf = new StringBuffer("");
		
		//String
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= CANT; i++) {
			s += "x";
		}
		tf = System.currentTimeMillis();
		System.out.println("String " + (tf-t0));
	
		
		//StringBuilder
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= CANT2; i++) {
			sb.append("x");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuilder " + (tf-t0));
		
		
		//StringBuffer
		t0 = System.currentTimeMillis();
		for (int i = 1; i <= CANT2; i++) {
			sbf.append("x");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuffer " + (tf-t0));
		
		
	}
}
