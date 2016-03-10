package arrayTest;

import java.util.Arrays;

public class test {

	public static void main (String [] args){
		
		int x[] = null;
		
		x= popArray(x);
		
		System.out.println(Arrays.toString(x));
		
	}
	
	
	
	
	public static int[] popArray(int x[]){
		
		for (int i = 0; i < 100; i++){
		
				x[i] = i;
			
		}
		return x;
		
	}
	
	
	
}
