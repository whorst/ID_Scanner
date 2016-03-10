import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class partB {

	public static void main(String[] args) {
		Set<Integer> TS = new TreeSet();
		Set<Integer> HS = new HashSet();
		
	
		double startTime=start();
		printRand(TS);
		double endTime = stop();
		System.out.println(elapsedTime(startTime,endTime));

		startTime=start();
		printRand(HS);
		endTime = stop();
		System.out.println(elapsedTime(startTime,endTime));
	}

	
	public static void printRand(Set<Integer> TS){
		for(int i =0; i<2000000; i++){
			int ran= (int) (Math.random()*9);
			TS.add(ran);
		}
		System.out.println("Done");
	}
	
	public static double start() { //The method to calculate the start time
		double startTime = System.currentTimeMillis();   	//Sets our startTime to the current UTC time
		return startTime;
	}

	public static double stop() { //Method to calculate the end time
		double endTime = System.currentTimeMillis();   //Sets our endtime to the current UTC time
		return endTime;
	}
	
	protected static double elapsedTime(double x, double y) { //Subtracts the starting and ending times
		double z = y - x; 									 //sets variable z to the difference of the end time and the beginning time
		double seconds = (z / 1000) % 60 ; 					 //Converts seconds to milliseconds
		return seconds;
	}
}
