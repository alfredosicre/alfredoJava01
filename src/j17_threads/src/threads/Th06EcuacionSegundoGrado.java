package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.management.RuntimeErrorException;

public class Th06EcuacionSegundoGrado {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		double a = 3;
		double b = 9;
		double c = 2;
		
		// calcular -b:
		CompletableFuture<Double> menosB = CompletableFuture.supplyAsync(() -> { // manda un nuevo hilo con la orden Completable...
			//ThreadUtil.sleep(500);
			System.out.println("Calculando -b...");
			return -b;	
		});
		
		// calcular 2a:
		CompletableFuture<Double> dosA = CompletableFuture.supplyAsync(() -> { // manda un nuevo hilo con la orden Completable...
			//ThreadUtil.sleep(500);
			System.out.println("Calculando 2a...");
			return 2*a;	
		});
				
		// calcular b al cuadrado:
		CompletableFuture<Double> bCuadrado = CompletableFuture.supplyAsync(() -> { // manda un nuevo hilo con la orden Completable...
			//ThreadUtil.sleep(500);
			System.out.println("Calculando b al cuadrado...");
			return b*b;	
		});
		
		// calcular 4*a*c
		CompletableFuture<Double> cuatroAC = CompletableFuture.supplyAsync(() -> { // manda un nuevo hilo con la orden Completable...
			//ThreadUtil.sleep(500);
			System.out.println("Calculando 4*a*c...");
			return 4*a*c;
		});
		
		// calcular el discriminante, b al cuadrado menos 4*a*c:
		// bCuadrado lo combinamos con cuatroAC. Esto se realizara cuando los dos hayan finalizados en el metodo thenCombine y le pasaremos una BiFunction.
		CompletableFuture<Double> discriminante = bCuadrado.thenCombine(cuatroAC, (b2, ac4)->{
			//ThreadUtil.sleep(500);
			System.out.println("Calculando discriminante...");
			return b2-ac4;
		});
		
		// calculamos la raiz cuadrada de b al cuadrado menos ac4, del discriminante
		// si el discriminante es menor que cero, lanzamos una excepcion
		CompletableFuture<Double> raizDiscriminante = discriminante.thenApply((d)->{
			//ThreadUtil.sleep(500);
			if(d < 0)
				throw new RuntimeException("Discriminante negativo: no hay raiz cuadrada real");
				
			System.out.println("Calculando raiz cuadrada del discriminante...");
			return Math.sqrt(d);
		});
		
		// calcular x1. -b+ raiz(discriminante) / 2a
		// combinar menosB con raizDiscriminante y al resultado cuando termine, lo combinamos con dosA.
		CompletableFuture<Double> x1 = menosB.thenCombine(raizDiscriminante, (mB, raiz)->{
			//ThreadUtil.sleep(500);
			System.out.println("Calculando x1...");
			return mB+raiz;
		}).thenCombine(dosA, (num, dA) -> num /dA);
		
		// calcular x2. -b - raiz(discriminante) / 2a
		// combinar menosB con raizDiscriminante y al resultado cuando termine, lo combinamos con dosA.
		CompletableFuture<Double> x2 = menosB.thenCombine(raizDiscriminante, (mB, raiz)->{
			//ThreadUtil.sleep(500);
			System.out.println("Calculando x2...");
			return mB-raiz;
		}).thenCombine(dosA, (num, dA) -> num /dA);
		
		
		System.out.println("x1 =" + x1.get());
		System.out.println("x2 =" + x2.get());
		
	}

}
