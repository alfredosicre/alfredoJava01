package threads.productorconsumidor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import threads.ThreadUtil;

public class ThPc03 {
	
	
	private static final int CAPACIDAD = 5; // una cola de 5 elementos como maximo
	private static final LinkedBlockingQueue<Integer> buffer = new LinkedBlockingQueue<Integer>(CAPACIDAD);
				
	private static final int CANT_PROD = 3;
	private static final int CANT_CONS = 7;
	
	private static AtomicInteger valor = new AtomicInteger(0); // metodos para la sincronizacion de hilos


	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(8);
		
		
		Runnable productor = ()->{ // cola de entrada
			while(true) {
				ThreadUtil.sleep();
				synchronized (LOCK) {
					
					while(buffer.size() == CAPACIDAD) {
						try {
							LOCK.wait();
						}catch (InterruptedException e){
							e.printStackTrace();
						}
					}
					
					buffer.offer(valor);
					System.out.println(Thread.currentThread().getName() + " producto: " + valor);
					valor++;
					LOCK.notifyAll();
					
					// control innecesario
					if(buffer.size() > CAPACIDAD) {
						System.err.println("¡¡¡ Error !!! se produjeron " + buffer.size());
						System.exit(1);
					}
				}
			}
		};
		
		Runnable consumidor = () -> { // cola de salida
			while(true) {
				ThreadUtil.sleep();
				synchronized (LOCK) {
					while(buffer.size()== 0) {
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					int v = buffer.poll();
					System.out.println(Thread.currentThread().getName() + " consumió: " + v);
					
					if(buffer.size() < 0) {
						System.err.println("Error, el tamaño del buffer es " + buffer.size());
						System.exit(1);
					}
				}
			}
		};
		
		
		for(int i = 1; i <= CANT_PROD; i++) {
			new Thread(productor, " productor: " + i).start();
		}
		
		for(int i = 1; i <= CANT_CONS; i++) {
			new Thread(consumidor, " consumidor: " + i).start();
		}
	}

}
