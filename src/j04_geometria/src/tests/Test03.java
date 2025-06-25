package tests;
import modelo.Figura;

public class Test03 {
	
				
		// metodo que devuelve la suma de cualquier tanda de numeros que le enviemos
		
		public static double sumaAreas(Figura... figs) { // los tres puntos representan o un array o una lista de numeros
			
			int suma = 0;
			for(int i = 0; i < Figura.length; i++) {
				suma += Figura[i];
			}
			return suma;
		}
		
		
		
			
		public static void main(String[] args)	{
			
			int[] areas = {1,5,4,7,8};
			System.out.println(suma());
		}
			
}
