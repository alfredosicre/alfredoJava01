package strings.teoria;

public class Igaldad {

	public static void main(String[] args) {
		
		String s1 = "hola";
		String s2 = "hola";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		s2 = s2 + " que tal";
		System.out.println(s2);
		System.out.println(s1);
		
		
//		String s3 = "HOLA";
//		s3 = s3.toLowerCase();
//		System.out.println(s3);
//		
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
	}
}
