import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

//MyUtil.java
//Will Horst
//HW5
//10/16/2015
//This program add strings from a text file to an object and then sorts a list of those 
//objects base on a user selected nutritional value

public class MyUtil<T extends Comparable<T>> {
	// Create a generic method that extends comparable

	public static <T> ArrayList selectionSort(ArrayList<T> newList) {
		// Generic selectionSort

		for (int i = 0; i < newList.size(); i++) { // Iterate through the values
													// of the ArrayList

			int min = i; // The minimum values
			int currValue; // Current Value

			T currObj;
			T minObj;
			// Create 2 new objects

			for (currValue = i + 1; currValue < newList.size(); currValue++) {

				minObj = (T) newList.get(min);
				currObj = (T) newList.get(currValue);
				// Get the smallest and most current (i and i+1 respectively)
				// Objects in the AL

				if (((Comparable<T>) minObj).compareTo(currObj) > 0) {
					// Compare the two objects
					min = currValue;

				}
			}

			if (i != min) { // If i doesn't equal the minimum value

				T temp = (T) newList.get(i);
				T temp2 = (T) newList.get(min);

				newList.set(min, temp); // Swap i with the minimum
										// value and vice versa
				newList.set(i, temp2);
			}

		}

		// System.out.println(newList);
		return newList;

	}

}
