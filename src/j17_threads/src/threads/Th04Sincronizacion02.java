package threads;

public class Th04Sincronizacion02 {
	
	public static void main(String[] args) {
		
		// hilos sincronizados
		Thread th3 = new Thread(()->{
			while(true) {
				ThreadUtil.sleep();
				m2();
			}
		});
		
		Thread th4 = new Thread(()->{
			while(true) {
				ThreadUtil.sleep();
				m2();
			}
		});
		
		th3.start();
		th4.start();
	}
	
	public static synchronized void m2() {
		System.out.println(Thread.currentThread().getName() + "Entrando...");
		ThreadUtil.sleep();
		System.out.println(Thread.currentThread().getName() + "Saliendo...");
		
		System.out.println("----------------------------------------------");
	}
	
}
