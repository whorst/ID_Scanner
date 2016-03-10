//At author William Horst. I collaborated with Tom Ostro, Casey Blades, and Brandon Conrellier


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) throws FileNotFoundException {
	
		File fi1 = new File("grocerylist.txt");
		Scanner kb = new Scanner(System.in);
		//creates file and scanner objects for grocerylist.txt

		Scanner sc1 = new Scanner(fi1).useDelimiter("[\n|\r]+");
		//Scanner for the file
		
		ArrayL obj1 = new ArrayL(sc1);
		//Constructor
		
		System.out.println(obj1.getLogsize());
		//Prints out the logical size
		
		File obt = new File("obtained.txt");
		PrintWriter prw = new PrintWriter(obt);
		prw.close();
		obj1.printArray();
		obj1.getmyArray();

		System.out.println(obj1.getLogsize());

		// transaction file

		menu();
		//Calls the menu method
	}

	// menu

	public static int menu() throws FileNotFoundException {
		//Creates a new method
		
		
		File fi1 = new File("grocerylist.txt");
		File obt = new File("obtained.txt");
		//Creates a file for both text files
		
		
		Scanner sc1 = new Scanner(fi1).useDelimiter("[\n|\r]+");
		Scanner kb = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Scanner scObt = new Scanner(obt);
		//Creates different scanners that will be used through out this method
		
		PrintWriter prw = new PrintWriter(obt);
		//Creates a printwriter for obtained
		
		ArrayL obj1 = new ArrayL(sc1);
		obj1.getLogsize();
		
		int choice = 0;

		for (int i = 4; i < 19; i++) {
			//Iterates through the loop 20 times
			
			
			System.out.println("Input the number corresponding to your choice");
			System.out.println("Press 1 to add to the grocery list.");
			System.out.println("Press 2 to remove from the grocery list.");
			System.out.println("Press 3 to exit");
			//the above three lines of code are the menu
			
			choice = kb.nextInt();
			//sets choice as user input
			
			obj1.getmyArray();

			if (choice == 1) {
				System.out.println("What would you like to add to your list?");
				obj1.addelement(scan.next());
				obj1.printArray();
				i++;
				System.out.println(obj1.getLogsize());
				//Allows the user to add something
				continue;
			}
			if (choice == 2) {
				System.out.println("Which would you like to remove?");
				obj1.getRemove();
				obj1.printArray();
				System.out.println(obj1.getLogsize());
				//Allows the user to remove something from the list. That something is then added to obtained.txt
			}
			if (choice == 3) {
				System.exit(0);
				i--;
				System.out.println(obj1.getLogsize());
				//Exits the menu
			}
			if (choice < 1 || choice > 3) {
				System.out.println("Try again");
			}
		}
		return choice;

	}
}




//4
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//
//
//4
//Input the number corresponding to your choice
//Press 1 to add to the grocery list.
//Press 2 to remove from the grocery list.
//Press 3 to exit
//1
//What would you like to add to your list?
//Chickem
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//4) Chickem
//
//
//5
//Input the number corresponding to your choice
//Press 1 to add to the grocery list.
//Press 2 to remove from the grocery list.
//Press 3 to exit
//2
//Which would you like to remove?
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//4) Chickem
//
//
//Input the number of the item to remove
//4
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//
//
//4
//Input the number corresponding to your choice
//Press 1 to add to the grocery list.
//Press 2 to remove from the grocery list.
//Press 3 to exit
//1
//What would you like to add to your list?
//Turkey
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//4) Turkey
//
//
//5
//Input the number corresponding to your choice
//Press 1 to add to the grocery list.
//Press 2 to remove from the grocery list.
//Press 3 to exit
//1
//What would you like to add to your list?
//Deer
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//4) Turkey
//5) Deer
//
//
//6
//Input the number corresponding to your choice
//Press 1 to add to the grocery list.
//Press 2 to remove from the grocery list.
//Press 3 to exit
//1
//What would you like to add to your list?
//Pheasant
//The list is:
//0) milk
//1) dog food
//2) eggs
//3) flour
//4) Turkey
//5) Deer
//6) Pheasant
//
//
//7
//Input the number corresponding to your choice
//Press 1 to add to the grocery list.
//Press 2 to remove from the grocery list.
//Press 3 to exit
//3




