
package j05_recursividad;

public class j05Figunachi {
	
	public static void main(String[] args) {
			
			System.out.println(figunachi(10));
			
			// un For para calcular un factorial:
				int f = 1;
				int n01 = 4;
				for(int i = 1; i <= n01; i ++) {
					f *=i;
					System.out.println(i + " " + f);
				}
	}
	
		// Metodo figunachi --------------------
		public static long figunachi (long n) {
			if(n == 0) return 0;
			if(n == 1) return 1;
			return figunachi(n-1) + figunachi(n-2);
		}
}
