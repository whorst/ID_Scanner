
public class genericMain {

	public static void main(String[] args) {

		int x= 5;
		int y = 12;
		int max;
		//String x = 'Bob';
		//String y= 'Sam";
		//Person bob = new Person(x, 19);
		//Person Same = new Person(y, 15);
		//Person max;
		max= maxim(x,y);
		System.out.println("The maximum is" + max);

	}

	private static <T extends Comporable <T>> maxim(T a,T b){
		T retval = a;
		if(a,compareTo(b)>0){
			retval= a;
			
		}else
		
	}

}
//Look up compare to in Java. Compares for compability