import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class PartC {

	public static void main(String[] args) {
		HashMap <Integer, Integer> HM= new HashMap();
		
		HM = printRand();
		System.out.println(HM);
	}
	public static HashMap<Integer, Integer> printRand(){
		HashMap <Integer, Integer> HM1= new HashMap();
		for(int i =0; i<19; i++){
			Integer ran= (int) (Math.random()*9);
			System.out.println("Adding " + ran + " to the data structures.");
			HM1.put(i, ran);
		}
		return HM1;
	}

	public static void check(HashMap <Integer, Integer> HM){
		
		for(int i =0; i<19; i++){
			int y=0;
			for(y =0; y<19; y++){
				
			}
		}
		
	}
}
