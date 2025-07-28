package teoria;

public class Redondeo {
	public static void main(String[] args) {
		double pi = Math.PI;
		
		System.out.println(pi);
		
		System.out.printf("PI = %.4f\n", pi);
		
		pi = Math.round(pi * 1000)/1000.;
		
		System.out.println(pi);
		
		
		System.out.println(round(Math.PI, 2));
	}
	
	public static double round(double num, int dec) {
		return Math.round(num * Math.pow(10, dec)) / Math.pow(10, dec);
	}
}
