//William Horst. I tried my best. 10/9/2015. My main class that is used for checking my map and finding values

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	
	static TreeMap<String, List<Publication>> database = new TreeMap(); //New Map called Database

	public static void main(String[] args) throws FileNotFoundException {

		
		File f = new File("publicationData.txt");
		Scanner sc = new Scanner(f);
		ArrayList<String> AuthorNames1 = new ArrayList<String>();

		File g = new File("queries.txt");
		Scanner sc1 = new Scanner(g);

		database = initDatabase(sc, AuthorNames1); //The init database method checks to see what's in the database

		processQueries(database); //Process the queries

	}


	public static TreeMap<String, List<Publication>> initDatabase(Scanner sc,  //My init DataBase Method
			ArrayList<String> AuthorNames1) throws FileNotFoundException {
		while (sc.hasNextLine()) {

			String type, date, publisher, isbn, price, pages, author, journalName, startingPage, endingPage, title;
			Publication title1;

			String row = sc.nextLine();

			String[] myString = row.split(","); //Create an array that splits strings up at the comma
			String typeOfPub = myString[0];  //This is the type of publication


			if (typeOfPub.equals("book")) { //If it's a book

				type = myString[0];  //The next few lines will populate the constructor
				title = myString[1];
				date = myString[2];
				publisher = myString[3];
				isbn = myString[4];
				price = myString[5];
				pages = myString[6];

				Book book = new Book(type, title, date, publisher, isbn, price, //Create a new book object
						pages, AuthorNames1);

				AuthorNames1 = getAuthors(myString);  //Returns all the authors that appear
				// pub.add(book.getTitle());

				for (String s : AuthorNames1) {  //Loop throught an array of a row and find all authors
					ArrayList<Publication> pub = new ArrayList<Publication>();
					if (database.containsKey(s)) {
						((List<Publication>) database.get(s)).add(book);
					} else {
						pub.add(book);
						database.put(s, pub);
					}

				}

			}
			if (typeOfPub.equals("journal")) { //If the entry is a journal, create a new journal object
				type = myString[0];
				title = myString[1];
				date = myString[2];
				publisher = myString[3];
				journalName = myString[4];
				startingPage = myString[5];
				endingPage = myString[6];
				
				JournalPaper journal = new JournalPaper(type, title, date,  //New journal object
						publisher, journalName, startingPage, endingPage,
						AuthorNames1);

				AuthorNames1 = getAuthors(myString);

				for (String s : AuthorNames1) {   //Add the authors to a list.
					ArrayList<Publication> pub = new ArrayList<Publication>();
					if (database.containsKey(s)) {
						((List<Publication>) database.get(s)).add(journal);
					} else {
						pub.add(journal);
						database.put(s, pub);
					}
				}

			}

		}

		return database;

	}

	public static void processQueries(TreeMap<String, List<Publication>> db) //Method for processing the queries
			throws FileNotFoundException {
		
		File f = new File("Hw3.txt");

		 PrintWriter pw = new PrintWriter(f);


		File q = new File("queries.txt"); // Create a new file object
		Scanner q1 = new Scanner(q).useDelimiter("[,|\n|\r]+"); //New scanner object

		

		while (q1.hasNext()) {
			String name = q1.next();
			String type = q1.next();
			Iterator it = db.keySet().iterator();
		
			
			System.out.println("Searching " + name + " For " + type);
			pw.println("Searching " + name + " For " + type);

		while (it.hasNext()) {		
				if (db.containsKey(name) == false) {
					System.out.println(name + " Does not have any publications");
					pw.println(name + " Does not have any publications");
					break;
				}else{
					String author = (String) it.next();
		
					for (Document d : db.get(author)) {
					if (author.equals(name)) {
							if ((d instanceof Book)) {
								System.out.println(name + db.get(name));
								pw.println(name + db.get(name));

								
							}if (d instanceof JournalPaper) {
								System.out.println(name + db.get(name));
								pw.println(name + db.get(name));

							}
						}
					}
					
				}
		
			
			}
		}
		pw.close();
			
			}
		
			
		

		

	
	private static List<Publication> newList(Entry<String, List<Publication>> b) {
		// TODO Au-generated method stub
		return null;
	}

	public static ArrayList putAuthors(String[] myString,
			List<Publication> string) {
		for (int i = myString.length - 1; i > 0; i--) { // Iterate through the
														// ArrayList
			String authors = myString[i]; // Set the String author to the
											// current Index
			if (containsNum(authors) == true) {
				// If the string is not a letter
				break; // Stop the program
			} else {
				database.put(authors, string);
				// System.out.println(authors);
				// System.out.println(database);

				continue;

			}

		}
		// System.out.println(list);
		return null;
	}

	public static ArrayList getAuthors(String[] myString) { //Return the list of authors
		ArrayList list = new ArrayList();
		for (int i = myString.length - 1; i > 0; i--) { // Iterate through the
														// ArrayList
			String authors = myString[i]; // Set the String author to the
											// current Index
			if (containsNum(authors) == true) {
				// If the string is not a letter
				break; // Stop the program
			} else {
				list.add(authors);
				// System.out.println(authors);
				// System.out.println(database);
				// database.put(authors, value)
				continue;

			}

		}
		// System.out.println(list);
		return list;
	}

	// public void author

	public static boolean containsNum(String s) { //Check and see if the string contains a num
		boolean retVal = false;
		for (int i = 0; i < s.length(); i++) {
			char myChar = s.charAt(i);
			if ((myChar < 'a' || myChar > 'z')
					&& (myChar < 'A' || myChar > 'Z')) {

				retVal = true;
			} else {
				retVal = false;
			}
		}

		return retVal;

	}

}
