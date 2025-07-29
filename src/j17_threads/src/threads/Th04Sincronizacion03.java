package threads;

public class Th04Sincronizacion03 {
	
	public static void main(String[] args) {
		
		// hilos sincronizados
		Object lock = new Object();
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
	
	public static void m2(Object lock) {
		
		System.out.println(Thread.currentThread().getName() + "Hace sosas...");
		
		synchronized (lock){
			System.out.println(Thread.currentThread().getName() + "Entrando...");
			ThreadUtil.sleep();
			System.out.println(Thread.currentThread().getName() + "Saliendo...");
		
			System.out.println("----------------------------------------------");
		}
	}
	
}
