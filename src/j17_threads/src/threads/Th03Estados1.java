package threads;

public class Th03Estados1 {
	
	public static void main(String[] args){
		
		
		Thread th1 = new Thread();
		System.out.println(th1.getState());
		
		th1.start();
		System.out.println(th1.getState());
		
		ThreadUtil.sleep(100); // ponemos a dormir el hilo del main
		
		System.out.println(th1.getState());
		
	}

}
