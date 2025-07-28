package teoria;

public class CompatibilidadTiposDeDatos {
	public static void main(String[] arg) {
		byte b = 7;
		short s = b;
		int i = s;
		long l = i;
		
//		int otro = l;
		
		float f = l;
		double d = f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		i = Integer.MAX_VALUE;
		System.out.println(i);
		
		f = i;
		d = i;
		System.out.println(f);
		System.out.println(d);
		
		l = Long.MAX_VALUE;
		f = l;
		d = l;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
		long valor = 1589;
		
		int miValor = (int)valor;
		System.out.println(miValor);
		
		double real = 1.56789;
		int entero = (int)real;
		System.out.println(entero);
		
		
	}
}
