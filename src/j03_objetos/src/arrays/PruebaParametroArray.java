package arrays;

public class PruebaParametroArray {
	
	// metodo que devuelve la suma de dos parametros
	public static int suma(int n1, int n2) {
		
		return n1 + n2;
	}
	// metodo que devuelve la suma de tres parametros
		public static int suma(int n1, int n2 , int n3) {
			
			return n1 + n2 + n3;
	}
		
		
	// metodo que devuelve la suma de cualquier array que le enviemos
	public static int suma(int... nums) { // los tres puntos representan o un array o una lista de numeros
		int suma = 0;
		for(int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		return suma;
	}
		
	public static void main(String[] args)	{
		System.out.println(suma(17, 25));
		System.out.println(suma(17, 25, 44));
		
		int[] numeritos = {1,5,4,7,8};
		System.out.println(suma(numeritos));
		
		
	}
	
}
