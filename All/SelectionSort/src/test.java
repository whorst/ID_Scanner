//test.java
//Will Horst
//HW1a
//9/9/2015
//This program generates a list (sized n) of random intgers between n and 2n. 
//While this happens, a stop watch times how long it takes for the list to be generated.
//Afterwards the list is sorted. That is time too. Then everything is written to a .txt file.


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class test extends utility {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		File f = new File("HW1.txt"); //Creates a file called hw1.txt
		PrintWriter pw = new PrintWriter(f); //w is our printwriter object
		
		List newList = new ArrayList();
		
		int n= 100;		//n and k will be the pre-determined lengths of the list
		int k = 100000;
		
		
		stopWatch myWatch = new stopWatch(); 			//the default constructor named myWatch
		double startTime = myWatch.getStartTime();		//startTime and endTime are set to 0;
		double endTime = myWatch.getEndTime();
		
		startTime =	start(startTime);					//Variable startTime is set to the current UTC time 
		List<Integer> list = genList(n);				//Populates ArrayList list with random variables.
		endTime = stop(endTime); 						//Sets variable endTime to the current UTC time 
		double elapsedTime = elapsedTime(startTime,endTime);//subtracts the start time from the end time to get the total time it took to generate the list
		
		System.out.println("Generated "+ n +" numbers in: " + elapsedTime + " seconds");
		pw.println("Generated "+ n +" numbers in: " + elapsedTime + " seconds");
		
		System.out.println("List before sorting "+ list);				//Prints the list before it is sorted
		pw.println("List before sorting "+ list);
		
		startTime =	start(startTime);									//Variable startTime is set to the current UTC time 
		System.out.println("List after sorting "+ selectionSort(list));	//Prints the sorted list after sorting.
		pw.println("List after sorting "+ selectionSort(list));
		endTime = stop(endTime); 										//Sets endtime = to the current time
		
		System.out.println("Selection sort: "+ elapsedTime(startTime,endTime) + " seconds"); //Prints out the elapsed time of the selection sort 
		pw.println("Selection sort: "+ elapsedTime(startTime,endTime) + " seconds");
		
		
		startTime =	start(startTime);	//set variable startTime to the current UTC time 
		list = genList(k);				//generates a list sized k of random variables
		endTime = stop(endTime);		//sets endtime to the current time
		elapsedTime(startTime,endTime);//subtracts the start time from the end time to get the total time it took to generate the list
		
		pw.println("\n" + "\n" +" Generated "+ k +" numbers in: " + elapsedTime + " seconds");
		pw.println("List before sorting "+ list);
		startTime =	start(startTime);
		pw.println("List after sorting "+ selectionSort(list));
		endTime = stop(endTime);
		pw.println("Selection sort: "+ elapsedTime(startTime,endTime) + " seconds");
		
	pw.close(); //close our print writer
	}

}
