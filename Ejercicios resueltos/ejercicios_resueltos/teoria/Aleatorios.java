package teoria;

public class Aleatorios {
	public static void main(String[] args) {
		
		int cant = 1000;
		
		for (int i = 0; i < cant; i++) {
			double ran = Math.random();
			System.out.println(ran + " " + (int)(ran * 16 + 1000));
			
		}
		
		System.out.println("------------");
		
		int[] cants = {0,0,0,0,0};
		cant = 100_000_000;
		for (int i = 0; i < cant; i++) {
			int num = (int) (Math.random() * 5);
			cants[num]++;
		}
		
		for (int i = 0; i < cants.length; i++) {
			System.out.println(cants[i]);
		}
	}
}
