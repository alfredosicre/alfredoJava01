package teoria;

import java.util.Arrays;

public class Metodos01 {
	
	public static void main(String[] args) {
		int num = 55;
		System.out.println(num);
		cambia(num);
		System.out.println(num);
		
		int[] a = {55,55,55};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		cambia(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(a);
		a = redimensiona(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a);
	}
	
	public static void cambia(int num) {
		num = 0;
	}
	
	public static void cambia(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = 0;
		}
	}
	
	public static int[] redimensiona(int[] v) {
		int[] aux = new int[v.length * 2];
		for (int i = 0; i < v.length; i++) {
			aux[i] = v[i];
		}
		return aux;
	}
}





