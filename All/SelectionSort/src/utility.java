//utility.java
//Will Horst
//HW1a
//9/9/2015
//This program generates a list (sized n) of random intgers between n and 2n. 
//While this happens, a stop watch times how long it takes for the list to be generated.
//Afterwards the list is sorted. That is time too. Then everything is written to a .txt file.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class utility {

	public static List<Integer> genList(int n) {
		List newList = new ArrayList(); 		//Declares an ArrayList.
		newList.clear(); 						//Wipes the arrayList
		Random r = new Random(); 				//Derclares a new random object
		newList = new ArrayList(); 
		int i1 = 0;

		while (i1 < n) { 
			int i = r.nextInt(2 * n - n) + n; 		//This will print out any random number between n and 2n and set it equal to i 
			newList.add(i); 						//after each iteration, i is added to the list.
			i1++;

		}
		return newList;
	}

	public static List<Integer> selectionSort(List<Integer> newList) {

		for (int i = 0; i < newList.size(); i++) { 	//Loop throught the entirety of the List

			int min = i;							//Creates a minimum value
			int currValue;							//Creates a current value

			for (currValue = i + 1; currValue < newList.size(); currValue++) { //The for loop will loop through every single value
				
				if (newList.get(currValue) < newList.get(min)) { 				//Checks if the current value is less than the minimum value

					min = currValue; 					//If so, then the min value is set equal to the current value.
				}
			}
			if (i != min) { 							//If i doesn't equal the minimum value
				int temp = newList.get(i); 
				int temp2 = newList.get(min);

				newList.set(min, newList.get(i)); 		//Swap i with the minimum value and vice versa
				newList.set(i, temp2);

			}
		}
		return newList;
	}

	protected static double elapsedTime(double x, double y) { //Subtracts the starting and ending times
		double z = y - x; 									 //sets variable z to the difference of the end time and the beginning time
		double seconds = (z / 1000) % 60 ; 					 //Converts seconds to milliseconds
		return seconds;
	}

	public static double start(double startTime) { //The method to calculate the start time
		startTime = System.currentTimeMillis();   	//Sets our startTime to the current UTC time
		return startTime;
	}

	public static double stop(double x) { //Method to calculate the end time
		x = System.currentTimeMillis();   //Sets our endtime to the current UTC time
		return x;
	}
}
