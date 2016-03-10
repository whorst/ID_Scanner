//stopWatch.java
//Will Horst
//HW1a
//9/9/2015
//This program generates a list (sized n) of random intgers between n and 2n. 
//While this happens, a stop watch times how long it takes for the list to be generated.
//Afterwards the list is sorted. That is time too. Then everything is written to a .txt file.

import java.util.ArrayList;
import java.util.List;


public class stopWatch {
		
		
		private static double startTime;
		private static double endTime;
		
		public stopWatch(){ //Used for our default constructor
			startTime = 0;
			endTime=0;
			
		}		
		public  double getStartTime() { //Get Method to return the startTime
			return startTime;
		}


		public  void setStartTime(int startTime) { //Set Method which allows one to set the start time
			stopWatch.startTime = startTime;
		}



		public  double getEndTime() { //Returns the end time
			return endTime;
		}



		public static void setEndTime(int endTime) { //Sets the end time
			stopWatch.endTime = endTime;
		}		   
	
	}

	
	

