package teoria;

public class FactorialRecursivo {

	
	public static int factorialIt(int x) {
		int factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int factorialRec(int x) {
		if (x == 0)
			return 1;
		return x * factorialRec(x - 1);
	}
	
	public static void main(String[] args) {
		int valor = 5;
		System.out.println(factorialIt(valor));
		System.out.println(factorialRec(valor));
	}
}
