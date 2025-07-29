package threads;

public class Th04Sincronizacion01 {
	
	public static void main(String[] args) {
		
//		m1();
		
		// tengo dos hilos funcionando desincronizados
		
//		Thread th1 = new Thread(()->{
//			while(true) {
//				ThreadUtil.sleep();
//				m1();
//			}
//		});
//		
//		Thread th2 = new Thread(()->{
//			while(true) {
//				ThreadUtil.sleep();
//				m1();
//			}
//		});
// ----------------------------------------		
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
		
//		th1.start();
//		th2.start();
		th3.start();
		th4.start();
	}
	
	public static void m1() {
		System.out.println(Thread.currentThread().getName() + "Entrando...");
		ThreadUtil.sleep();
		System.out.println(Thread.currentThread().getName() + "Saliendo...");
		
		System.out.println("----------------------------------------------");
	}
	
	public static synchronized void m2() {
		System.out.println(Thread.currentThread().getName() + "Entrando...");
		ThreadUtil.sleep();
		System.out.println(Thread.currentThread().getName() + "Saliendo...");
		
		System.out.println("----------------------------------------------");
	}
	
}
