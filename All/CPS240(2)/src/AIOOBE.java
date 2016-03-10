import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


//stopWatch.java
//Will Horst
//HW2b
//9/16/2015
//This program generates an array, sized 100, and fills it with random numbers
//The user is able to get the value of the index of the array
//Then everything is written to a .txt file.

public class AIOOBE {

	static Scanner kb = new Scanner(System.in); //Creates a scanner object
	static PrintWriter prw;						//Creates a printwriter object

	
	public static void main(String[] args) throws IOException {
		 
		File k = new File ("HW2.txt");
		prw = new PrintWriter(new BufferedWriter(new FileWriter("HW2.txt", true))); //This line of code allows one to not overwrite .txt files
		
		int index;

		int[] array = new int[100]; 						//Create an array, sized 100

		for (int i = 0; i < 99; i++) {						//loops through and adds value to the array
			int ran = (int) (Math.random() * 10000 - 0) + 0;//ran is an integer that can be between the size of 0 and 10,0000
			array[i] = ran;									//sets the index  equal to the value of ran

			System.out.println(array[i]);
			

		}

		displayIndex(array);
		prw.close();
	}

	public static void displayIndex(int[] array) throws FileNotFoundException {
		int index;
		try {
			System.out.println('\n' + "Please enter the index of the array you'd like to see.");
			index = kb.nextInt();	//Allows the user to select the index
			prw.print("  "+index+" ");	//Writes that index to a .txt file
			System.out.println(array[index]); //Prints the value of the index of the array
			prw.println("  "+array[index]);
		} catch (ArrayIndexOutOfBoundsException e) { //Catch an outofboundsexception
			prw.print((e.fillInStackTrace()));		//Prints the error	
			System.err.println(e.fillInStackTrace());		
			displayIndex(array); //If there is an error then this method is recursively called
		}
	prw.close();
	}
	
}
