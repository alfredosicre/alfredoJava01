package interfaces;

import interfaces.interfaceFuncional;

public class TestIntefaces {
	
	public static void main(String[] args) {
		
		EjemploInterface iNormal = new EjemploInterface(){

			@Override
			public void procesa(String str) {
				System.out.println("dede procesa");
				
			}
			@Override
			public int otroProceso() {
				// TODO Auto-generated method stub
				return 2025;
			}

			
		};
		
		iNormal.procesa("hola que tal");
		System.out.println(iNormal.otroProceso());
		
		interfaceFuncional iFuncional = new interfaceFuncional() {
			@Override
			public void haceAlgo() {
				System.out.println("haciendo algo...");
			}
		};
		
		iFuncional.haceAlgo();
		
		// podemos utilizar una expresion lambda
		
		interfaceFuncional iFuncional2 = () -> {
			System.out.println("Soy haceAlgo desde lambda");
		};
		iFuncional2.haceAlgo();
		
	}

}
