package threads;

public class Th03Estados2 {
	
	public static void main(String[] args){
		
		Object lock = new Object();
		
		Thread th1 = new Thread(()->{
			
			synchronized (lock) {
				try {
					lock.wait(); // espera indefinida
				} catch (InterruptedException e){
					e.printStackTrace();
					
				}
			}
			
		}, "Primer hilo");
		
		Thread th2 = new Thread(()->{
		
			ThreadUtil.sleep(5000);
			
		}, "Segundo hilo ");
		
		th1.start();
		th2.start();
		
		System.out.println(th1.getName() + ": " + th1.getState());
		System.out.println(th2.getName() + ": " + th2.getState());
		
	}

}
