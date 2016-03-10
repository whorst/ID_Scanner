
public class time {

	public static void main(String[] args) {
		
		long currTime = System.currentTimeMillis()/1000;
		
		long newTime = System.currentTimeMillis()/1000+2;
		
		System.out.println( currTime +"  "+ newTime);
		
		
		
		while(System.currentTimeMillis() != newTime){
			
			System.out.println("not yet");
		}
		
	}

}
