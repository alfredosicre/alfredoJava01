package j05_recursividad;

public class R01Factorial {
	
	public static void main(String[] args) {
			
		System.out.println(factorial(5));
	}
	
	public static long factorial (long n) {
		if(n == 0) return 1;
		
		return n * factorial(n - 1);
		
	}

}
