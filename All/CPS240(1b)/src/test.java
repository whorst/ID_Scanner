//test.java
//Will Horst
//HW1b
//9/30/2015
//This program generates a list (sized n) of random intgers between n and 2n. 
//While this happens, a stop watch times how long it takes for the list to be generated.
//Afterwards the list is sorted. That is time too. Then everything is written to a .txt file.
//Duplicates are removed from the list


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class test extends utility {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		File f = new File("HW1b.txt"); //Creates a file called hw1.txt
		PrintWriter pw = new PrintWriter(f); //w is our printwriter object
		
		List newList = new ArrayList();
		
		int n= 100;		//n and k will be the pre-determined lengths of the list
		int k = 100000;
		
		
		stopWatch myWatch = new stopWatch(); 			//the default constructor named myWatch
		double startTime = myWatch.getStartTime();		//startTime and endTime are set to 0;
		double endTime = myWatch.getEndTime();
		
		
		
		
		startTime =	start(startTime);					//Variable startTime is set to the current UTC time 
		List<Integer> list1 = genList(n);				//Populates ArrayList list with random variables.
		endTime = stop(endTime); 						//Sets variable endTime to the current UTC time 
		double elapsedTime = elapsedTime(startTime,endTime);//subtracts the start time from the end time to get the total time it took to generate the list
		
		
		
		startTime =	start(startTime);					//Variable startTime is set to the current UTC time 
		selectionSort(list1);
		endTime = stop(endTime); 						//Sets variable endTime to the current UTC time 
		double elapsedTime2 = elapsedTime(startTime,endTime);
	
		
		
		
	
	
		
		
		

		System.out.println("Generated "+ n +" numbers in: " + elapsedTime + " seconds" );
		pw.println("Generated "+ n +" numbers in: " + elapsedTime + " seconds");
		System.out.println("Selection Sort: " + elapsedTime2 + " seconds");
		pw.println("Selection Sort: " + elapsedTime2 + " seconds");
		System.out.println("List before removing duplicates: " +'\n'+ selectionSort(list1));
		pw.println("List before removing duplicates: " +'\n'+ selectionSort(list1));
		
		startTime =	start(startTime);					 
		List<Integer> dupe = selectionSort(removeDuplicates(list1));
		endTime = stop(endTime);
		double elapsedTime3 = elapsedTime(startTime,endTime);
		
		System.out.println("Removed to duplicates: " + elapsedTime3 + " seconds");
		pw.println("Removed to duplicates: " + elapsedTime3 + " seconds");
		System.out.println("List after removing duplicates: " +'\n'+ dupe);
		pw.println("List after removing duplicates: " +'\n'+ dupe);
		System.out.println("List size before/after removal " + n+"/"+ dupe.size()+"\n");
		pw.println("List size before/after removal " + n+"/"+ dupe.size()+"\n");

		startTime =	start(startTime);					//Variable startTime is set to the current UTC time 
		List<Integer> list5 = genList(k);				//Populates ArrayList list with random variables.
		endTime = stop(endTime); 						//Sets variable endTime to the current UTC time 
		double elapsedTime5 = elapsedTime(startTime,endTime);//subtracts the start time from the end time to get the total time it took to generate the list
		System.out.println("Generated "+ k +" numbers in: " + elapsedTime5 + " seconds" );
		pw.println("Generated "+ k +" numbers in: " + elapsedTime5 + " seconds" );
		
		startTime =	start(startTime);					//Variable startTime is set to the current UTC time 
		selectionSort(list5);
		endTime = stop(endTime); 						//Sets variable endTime to the current UTC time 
		double elapsedTime6 = elapsedTime(startTime,endTime);
		System.out.println("Selection Sort: " + elapsedTime6 + " seconds");
		pw.println("Selection Sort: " + elapsedTime6 + " seconds");
		
		startTime =	start(startTime);					 
		List<Integer> dupe1 = selectionSort(removeDuplicates(list5));
		endTime = stop(endTime);
		double elapsedTime7 = elapsedTime(startTime,endTime);
		System.out.println("Removed to duplicates: " + elapsedTime7 + " seconds");
		pw.println("Removed to duplicates: " + elapsedTime7 + " seconds");
		System.out.println("List size before/after removal: " + k+"/"+ dupe1.size());
		pw.println("List size before/after removal: " + k+"/"+ dupe1.size());

		
	pw.close(); //close our print writer
	}

}
