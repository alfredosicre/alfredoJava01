package utilidades;

//EJ31
public class StringUtil {
	
	public static void main(String[] args) {
//		System.out.println(insert("Hola", "adios", 2));
//		System.out.println(insert("Hola", "adios", 0));
//		System.out.println(insert("Hola", "adios", 7));
		
//		System.out.println(delete("Hola", 1, 2));
//		System.out.println(delete("Hola", 0, 2));
//		System.out.println(delete("Hola", 0, 5));

//		System.out.println(indexOf("Hola", "ol"));
//		System.out.println(indexOf("Hola", "Ol"));
//		System.out.println(indexOf("Hola", "H"));
//		System.out.println(indexOf("Hola", "a"));
//		System.out.println(indexOf("Hola", "Hola"));

//		System.out.println(replace("Hola que tal", "que", "x"));
//		System.out.println(replace("Hola que tal", "que", "xxx"));
//		System.out.println(replace("Hola que tal", "que", "xxxxx"));

//		System.out.println(capitalize("HOLA QUE TAL"));
//		System.out.println(capitalize("HOLA"));

//		System.out.println(cuentaPalabras("Esto es una frase largar de 8 palabras"));
//		System.out.println(cuentaPalabras("Esto"));
//		System.out.println(cuentaPalabras(""));

		System.out.println(cuentaParrafos("En un lugar de la Mancha \n cuyo nombre no me acuerdo"));
		System.out.println(cuentaParrafos("En un lugar de la Mancha"));
	}

	public static String insert(String cadena, String insertado, int pos) {
		if (pos >= cadena.length())
			return cadena;
		return cadena.substring(0, pos) + insertado + cadena.substring(pos);
	}
	
	//hasta sin incluir
	public static String delete(String cadena, int desde, int hasta) {
		if (desde < 0 || hasta <= desde || hasta > cadena.length())
			return cadena;
		return cadena.substring(0, desde) + cadena.substring(hasta);
	}
	
	public static int indexOf(String cadena, String buscado) {
		int resu = -1;
		for (int i = 0; i < cadena.length() - buscado.length() + 1; i++) {
			if (cadena.substring(i, i + buscado.length()).equals(buscado))
				resu = i;
		}
		return resu;
	}

	public static String replace(String cadena, String buscado, String reemplazo) {
		int idxInicio = indexOf(cadena, buscado);
		if(idxInicio == -1)
			return cadena;
		String inicio = cadena.substring(0, idxInicio);
		String fin = cadena.substring(idxInicio + buscado.length());
		return inicio + reemplazo + fin;
	}
	
	public static String capitalize(String cadena) {
		cadena = cadena.toLowerCase().trim();
		cadena = Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1);
		int idx = 0;
		while((idx = cadena.indexOf(" ", idx + 1)) != -1) {
			cadena = cadena.substring(0, idx + 1) + Character.toUpperCase(cadena.charAt(idx + 1)) + cadena.substring(idx + 2);
		}
		return cadena;
	}
	
	public static int cuentaPalabras(String cadena) {
		if (isEmpty(cadena))
			return 0;
		cadena = cadena.trim();
		int idx = 0, cont = 0;
		while((idx = cadena.indexOf(" ", idx + 1)) != -1) {
			cont++;
		}
		return cont + 1;
	}
	
	public static int cuentaParrafos(String cadena) {
		if (isEmpty(cadena))
			return 0;
		cadena = cadena.trim();
		int idx = 0, cont = 0;
		while((idx = cadena.indexOf("\n", idx + 1)) != -1) {
			cont++;
		}
		return cont + 1;
	}
	
	private static boolean isEmpty(String cadena) {
		return cadena == null || cadena.trim().length() == 0;
	}
}
