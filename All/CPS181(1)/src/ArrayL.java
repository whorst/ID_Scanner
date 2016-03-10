import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//William Horst

public class ArrayL {

	private final int Physize = 20;

	private int Logsize = 0;

	private String[] myArray = new String[Physize];

// Declares an array with Physical Size, Logical Size, Name, Type

	public ArrayL(Scanner sc) // Not a default constructor
	{
		String input;
		while (sc.hasNext()) {
			input = sc.next();
			myArray[Logsize] = input;
			Logsize++;
		}
	}

	public int getLogsize() {
		return Logsize;
	}//getter for logical size

	public int getRemove() throws FileNotFoundException {
		return remove();
	}//getter for the remove method

	public String[] getmyArray() {
		return myArray;
	}//getter for the array

	public void setLogsize(int size) {
		this.Logsize = size;
	}//Setter for the logical size

	public int Physize() {
		return Physize;
	}

	public void addelement(String word) // Write a method for adding
	{
		myArray[Logsize] = word;
		Logsize++;
	}

	public int remove() throws FileNotFoundException { // Write a method for
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		//method for the dates
		

		File obt = new File("obtained.txt");
		PrintWriter pr = new PrintWriter(obt);
		//File and printwriter objects for obtained.txt
		
		Scanner kb = new Scanner(System.in);
		int rempos;
		printArray();
		System.out.println("Input the number of the item to remove");
		rempos = kb.nextInt();
		pr.println("removing " + myArray[rempos] + " " + dateFormat.format(date));
		pr.close();
		int success = 0;
		if ((rempos >= 0) && (rempos < Physize)) {
			if (rempos == Physize) {
				myArray[rempos] = null;
			} else {
				for (int cnt = rempos; cnt < Logsize; cnt++) {
					myArray[cnt] = myArray[cnt + 1];
				}
			}
			success = 1;
			Logsize--;
		}
		return success;
	}

	public void printArray() {
		System.out.println("The list is:");
		for (int count = 0; count < Logsize; count++) {
			System.out.println(count + ") " + myArray[count]);
		}
		System.out.println("\n");
	}//Method for printing the array

}
// Object Oriented