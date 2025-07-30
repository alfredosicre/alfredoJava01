package threads.productorconsumidor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import threads.ThreadUtil;

public class ThPc03 {
	
	
	private static final int CAPACIDAD = 5; // una cola de 5 elementos como maximo
	private static final LinkedBlockingQueue<Integer> buffer = new LinkedBlockingQueue<Integer>(CAPACIDAD);
				
	private static final int CANT_PROD = 6;
	private static final int CANT_CONS = 2;
	
	private static AtomicInteger valor = new AtomicInteger(0); // metodos para la sincronizacion de hilos


	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(8); // trabaja con 8 hilos
		
		System.out.println(Runtime.getRuntime().availableProcessors()); // me dice cuantos procesadores tengo
		System.out.println("-------------------------------------------");
		
		Runnable productor = ()->{ // cola de entrada
			ThreadUtil.sleep();
			while(true) {
				int v = valor.getAndIncrement();
				buffer.add(v);
				System.out.println(Thread.currentThread().getName() + " produjo: " + v);
			}
		};
		
		Runnable consumidor = () -> { // cola de salida
			while(true) {
				ThreadUtil.sleep();
				try {
					int v = buffer.take();
					System.out.println(Thread.currentThread().getName() + " consumió: " + v);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
			}
		};
		
		
		for(int i = 1; i <= CANT_PROD; i++) {
			executor.submit(productor);
		}
		
		for(int i = 1; i <= CANT_CONS; i++) {
			executor.submit(consumidor);
		}
	}

}
