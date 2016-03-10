import java.util.Random;

public class Test {

	static int z = 20;
	
	static int x= 0;
	static int y= 0;
	static int r=0;

	public static void main(String args[]) {
		String str1 = "Strings are immutable";
		String str2 = "Strings are immutable";
		String str3 = "Integers are not immutable";

		int result;

		result = str1.compareTo(str2);
		System.out.println(result);

		result = str2.compareTo(str3);
		System.out.println(result);

		result = str3.compareTo(str1);
		System.out.println(result);

		//Factorial(z);

		gto(x,y,r);
		

		
		
//			{
//				int a = 0, b = 0, c = 0;
//				Random r = new Random();
//				for (int i = 0; i < 32000; i++) {
//					try {
//						b = r.nextInt();
//						c = r.nextInt();
//						a = 12345 / (b / c);
//					} catch (ArithmeticException e) {
//						System.out.println("Division by zero.");
//						a = 0; // set a to zero and continue
//					}
//					System.out.println("a: " + a);
//				}
//			}
		}

	




	public static int Factorial(int i) {
		System.out.println(i);

		if (i <= 1) {
			return 1;
		} else {
			return i * Factorial(i - 1);

		}
	}

	public static int gto(int x, int y, int z){
		x=0;
		y=0;
		z=0;
		
		
		
		String str1="fffff";
		String str2="fffff";

		
		int result=str1.compareTo(str2);
		System.out.println(result);
		
		try{
			int a=(y/z);
			
		}catch(ArithmeticException e){
			System.out.println("Nice try Jackass");
			
		}
		
		return(1);
		
			}
	
	
	
}
