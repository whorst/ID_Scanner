package tryCatch;

import java.util.Scanner;

public class tryCatchExample {
	public static void main(String[] args) {
	int x;
	int y;
	int z;
	
	Scanner sc = new Scanner(System.in);
	
	x=sc.nextInt();
	y=sc.nextInt();
	
	z=x/y;
	
	System.out.println(z);
}
}