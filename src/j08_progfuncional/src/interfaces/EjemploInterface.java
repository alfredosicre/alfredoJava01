package interfaces;

public interface EjemploInterface {
	
	static int numerito = 34;
	
	// Antes de java 8 solo existian metodos abstractos en una interface. 
	// Java8 incorpora metodos estaticos y default
	// Java11 incorpora metodos private
	
	// estos son metodos abstractos.
	void procesa(String str);
	
	int otroProceso();
	

	// metodos default, metodos con codigo, que hagan cosas. Cualquier clase que tenga este metodo, lo sobre escribe
	
	default void haceAlgo() {
		// debe tener cuerpo
		System.out.println("Soy el metodo DEFAULT");
	}
	
	// metodos estaticos, static
	
	static void metodoEstatico() {
		System.out.println("Yo soy un metodo ESTATICO");
	}
	
	// metodos privados, private
	
	private String metodoPrivado() {
		return "soy privado";
	}
	
	default void metodoDefaultUsaPrivate() {
		System.out.println(metodoPrivado());
	}
	
	// metodos private static
	private static String metodoStaticPrivado(){
		return "Soy privado y estatico";
	}
	
	static void metodoStaticPrivate() {
		System.out.println(metodoStaticPrivado());
	}
	
}
