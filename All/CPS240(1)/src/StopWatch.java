import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class StopWatch {
	

	
	private static long startTime= 0;
	private static long endTime = 0;

	
	
	public static void main(String[] args) {
		
		
		
		StopWatch cons = new StopWatch();
		
	    startTime =	start();
	    System.out.println(startTime);
	    
	    endTime = stop();
	    System.out.println(endTime);
	    
	    elapsedTime(startTime, endTime);
	    
	    System.out.println(elapsedTime(startTime,endTime));
		}

	private static long elapsedTime(long x, long y) {
		long z = y-x;
		return z;
	}
	public static long start(){
		long x = System.currentTimeMillis();
		return x;
		}
	
	public static long stop(){
		long x = System.currentTimeMillis();
		return x;
		}
	
	
	
	public static long getStartTime() {
		return startTime;
	}


	public static void setStartTime(int startTime) {
		StopWatch.startTime = startTime;
	}



	public static long getEndTime() {
		return endTime;
	}



	public static void setEndTime(int endTime) {
		StopWatch.endTime = endTime;
	}
	
	public static ArrayList genList(int n){
		ArrayList al = new ArrayList();
		int o = n*2;
		 int k = (int) (Math.random()*n+o);
		 al.add(k);
		 return al; 
	}
	   public static void selectionSort (List<Integer> newList){
		for (int i = 0; i < newList.size(); i++) {

			int min = i;

			int currValue;

			for (currValue = i + 1; currValue < newList.size(); currValue++) {

				if (newList.get(currValue) < newList.get(min)) {

					min = currValue;
				}
			}
			if (i != min) {
				int temp = newList.get(i);
				int temp2 = newList.get(min);

				newList.set(min, newList.get(i));
				newList.set(i, temp2);

			}
		}
		System.out.println(newList);
	}
}
