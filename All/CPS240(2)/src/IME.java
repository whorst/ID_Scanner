import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedWriter;

//stopWatch.java
//Will Horst
//HW2a
//9/16/2015
//Prompts the user to enter two integers.
//The integers are then added together
//If the user doesn't enter an integer, then an exception is thrown.


public class IME {

	static Scanner kb = new Scanner(System.in);
	static PrintWriter prw;
	
	public static void main(String[] args) throws IOException {
		
		File k = new File ("HW2.txt");				//Create a file called HW2.txt
		prw = new PrintWriter(new BufferedWriter(new FileWriter("HW2.txt", true))); //This line of code allows one to not overwrite .txt files
		
		System.out.println("Please enter two integers");
		
		enterInt();	//Call the enterInt method
		prw.close();//Close the print writer
	}

	public static void enterInt() { //This method will display the sum of two integers, and throw an exception if anythin other then an int is used
		Scanner kb = new Scanner(System.in);

		try {
			int int1, int2, sum;

			int1 = kb.nextInt(); //Allows the 2 integers to be decided by user input
			int2 = kb.nextInt();

			sum = int1 + int2; //Variable sum equals the sum of int1 and int2
			System.out.println("Sum is: " + sum);
			prw.print("The sum is: " + sum);
		} catch (InputMismatchException e) {	//Catch an InputMismatchException
			e.printStackTrace();				//Print where the error happened
			System.err.println("Incorrect input and re-enter two integers:");
			prw.print("Incorrect input and re-enter two integers:");
			enterInt();	//Recursively call the method until the user puts in the correct input.

		}
	}
}
