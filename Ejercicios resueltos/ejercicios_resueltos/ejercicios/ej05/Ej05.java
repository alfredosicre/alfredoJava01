package ejercicios.ej05;

// Dos números son "amigables" si la suma de los divisores propios de uno es igual al otro. 
//	Por ejemplo, los divisores propios de 8 son: 1, 2 y 4 y la suma de éstos 1 + 2 + 4 = 7;
//	luego 8 es un número amigo de 7. 
//	Escribe un método que determine si dos números dados son amigables.

public class Ej05 {
	public static void main(String[] args) {
		System.out.println(sonAmigos(7, 8));
		System.out.println(sonAmigos(8, 7));
		System.out.println(sonAmigos(6, 6));
		System.out.println(sonAmigos(10, 8));
		System.out.println(sonAmigos(8, 10));
	}
	
	public static boolean sonAmigos(int n1, int n2) {
		int s1 = Ej04.sumaDivisoresPropios(n1);
		int s2 = Ej04.sumaDivisoresPropios(n2);
		return s1 == n2 || s2 == n1;
	}
}
