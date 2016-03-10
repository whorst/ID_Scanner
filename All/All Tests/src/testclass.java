// Gallmann, Tanja (gallm1t)
// CPS181, Tu,Th 9:30-10:45
// Due date: 01/23/2015

import java.util.*;
import java.io.*;

public class testclass {

	private final int phySize = 20;
	private String[] myArray = new String[phySize];
	private int logSize = 15;

	// default constructor
	public testclass() {
	};

	// constructor from Scanner
	public testclass(Scanner sc) {
		String item;
		while (sc.hasNext()) {
			item = sc.next();
			myArray[logSize] = item;
			logSize++;
		}
	}

	// display list
	public void displayList() {
		System.out.println("The current list:");
		for (int i = 0; i < logSize; i++) {
			System.out.println((i + 1) + " " + myArray[i]);
		}
		System.out.println();
	}

	// add an item to the list from an awesome variety of options
	public void addFromMenu(Scanner sc) {

		// Scanner scAdd = new Scanner(System.in);
		System.out.println("What would you like to add? Options: ");
		// display menu
		System.out
				.println("1=Apple /n 2=Banana/n 3=Pear/n 4=Orange/n 5=Toilet paper");
		int choice = sc.nextInt();
		sc.next();

		// add user's choice
		switch (choice) {

		case 1:
			add("Apple");
			break;
		case 2:
			add("Banana");
			break;
		case 3:
			add("Pear");
			break;
		case 4:
			add("Orange");
			break;
		case 5:
			add("Toilet paper");
			break;
		default:
			System.out
					.println("This was not an option. Please put in one of the following numbers: ");
			break;

		}

	}

	public void add(String item) {
		// Check if there's space left
		if (logSize < phySize) {
			// add item
			myArray[logSize] = item;
			logSize++;
			System.out.println(item + " successfully added.");
		} else {
			System.out
					.println("Add failed, list is full! Don't buy so much, think of your budget!");
		}
	}

	public void remove(Scanner sc, PrintWriter prw) {
			
			// Display the list so that user sees the numbers
			displayList();
			System.out
					.println("Please enter the number of the item you obtained:");
			// get the position of the item in the array
			int obtained = sc.nextInt() - 1;
			sc.next();
			// check if user made a valid choice
			if (obtained >= 0 && obtained < logSize) {
				String tempo = myArray[obtained];
				// change array
				for (int i = obtained; i < logSize-1; i++) {
					System.out.println(myArray[i]);
					myArray[i] = myArray[i + 1];
					System.out.println(myArray[i]);
				}
				logSize--;
				System.out.println(logSize);
				prw.println(tempo + " obtained and removed from the list.");
			} else { // show user that he can't just do what he wants!
				System.out
						.println("Nasty, nasty, nasty! Choose a number that's actually on your list!");

			} 
}
}


