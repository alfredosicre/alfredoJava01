package arrays;
import modelo.Figura;

public class PruebaParametroArray1 {
	
		
	// metodo que devuelve la suma de cualquier tanda de numeros que le enviemos
	
	public static double sumaAreas(Figura... figs) { // los tres puntos representan o un array o una lista de numeros
		
		public double area();
		int suma = 0;
		for(int i = 0; i < figs.length; i++) {
			suma += figs[i];
		}
		return suma;
	}
	
	
	
		
	public static void main(String[] args)	{
		
		int[] areas = {1,5,4,7,8};
		System.out.println(suma());
		
		
	}
	
}
