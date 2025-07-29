package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Th04Sincronizacion04 {
	
	public static void main(String[] args) {
		
		// hilos sincronizado
		
		Lock lock = new ReentrantLock();
		
		Thread th3 = new Thread(()->{
			while(true) {
				ThreadUtil.sleep();
				m2(lock);
			}
		});
		
		Thread th4 = new Thread(()->{
			while(true) {
				ThreadUtil.sleep();
				m2(lock);
			}
		});
		
		th3.start();
		th4.start();
	}
	
	public static void m2(Lock lock) {
		
		System.out.println(Thread.currentThread().getName() + "Hace sosas...");
		
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "Entrando...");
		ThreadUtil.sleep();
		System.out.println(Thread.currentThread().getName() + "Saliendo...");
		System.out.println("----------------------------------------------");
		lock.unlock();
	}
	
}
