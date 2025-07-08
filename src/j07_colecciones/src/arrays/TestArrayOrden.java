package arrays;

import java.util.Arrays;

public class TestArrayOrden {
	
	public static void main(String[] args) {
		
		String[] ss = {"uno","dos","tres","cuatro","cinco"};
		
		for(int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		
		System.out.println();
		
		Arrays.sort(ss);
		
		for(int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		
		
		
	}

}
