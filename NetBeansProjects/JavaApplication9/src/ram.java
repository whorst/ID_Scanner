
import java.util.Random;

public class ram {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		while(true){
		int rand = rn.nextInt(10-1+1)+1;
		System.out.println(rand);
		}

	}

}
