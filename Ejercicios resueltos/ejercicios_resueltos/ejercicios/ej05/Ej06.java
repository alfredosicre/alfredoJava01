package ejercicios.ej05;

import utilidades.Util;

public class Ej06 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(lanzaDado());
		}
	}
	
	public static int lanzaDado() {
		return Util.random(6);
	}
}
