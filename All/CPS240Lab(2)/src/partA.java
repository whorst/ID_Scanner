import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class partA {

	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList();
		Set<Integer> TS = new TreeSet();
		
		printRand(TS, AL);
		
	}

	public static void printRand(Set<Integer> TS, ArrayList<Integer> AL){
		for(int i =0; i<19; i++){
			int ran= (int) (Math.random()*9);
			System.out.println("Adding " + ran + " to the data structures.");
			AL.add(ran);
			TS.add(ran);
		}
		System.out.println("The ArrayList is:" + AL+'\n');
		System.out.println("The TreeSet is:" + TS);
	}
}
