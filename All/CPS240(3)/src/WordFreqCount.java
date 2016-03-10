import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;



//WordFreqCount.java
//Will Horst
//HW3
//9/30/2015
//This program counts the frequency of a word appearing in a text file using a hashmap 

public class WordFreqCount {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		try{
		
		File f = new File("WordFreqCount.txt"); 		//Create a new File
		PrintWriter pw = new PrintWriter(f);			//Create a PrintWriter for the File
		
		Map map = new TreeMap();						//Create a TreeMap called Map.
		

		BufferedReader bufr = new BufferedReader(new FileReader("book.txt"));		//Create a BufferedReader Class that will read from an inputStream.
			
		StringBuilder sbud = new StringBuilder();	//Creates a StringBuilder object. Advantageous because it's mutable.
		String row = bufr.readLine();				//Declare a new String called row that reads each individual row
			
		while (row != null) {							//While there is still a row to read within the txt file.
			String[] theWord = row.replaceAll("[^a-zA-Z0-9\\s]", "").split(" "); //This declares an array where the contents are split by spaces and anything that not a letter or word is replaced.  

			int i = 0;
			while (i < theWord.length) {			//While the Array still has something in it.
				if (map.get(theWord[i]) == null) {	//If the word in the array doesn't exist within the Map 
					map.put(theWord[i], 1);			//Then add the word to the map with a value of 1
				} else {
					int newValue = (int) map.get(theWord[i]); //If it does exist then get the value (which I've declared as newValue)
					newValue++;								  //and add one to the value.
					map.replace(theWord[i], newValue);			  //return that value and the word into the Map
				}
				i++;				
			}
			row = bufr.readLine();
		}

		map.remove(""); // Remove the instance of spaces in the map
		for (Object key : sortByValues(map).keySet()) { // Iterate through the hashmap that is sorted by values.
			pw.print("Word: " + key + "\tCounts: " + map.get(key) + '\n'); // Print it to a txt file
		}
		pw.close();
		}catch(FileNotFoundException e){
			System.err.println("No such file exists");
		}
	}
	
	public static <Key extends Comparable, Value extends Comparable> Map<Key, Value> sortByValues(Map map) { //Create a method that returns a hashmap and takes a hashmap as a parameter.
		List<Map.Entry<Key, Value>> entries = new LinkedList<Map.Entry<Key, Value>>( //Create a list object called entries that can take a map as a parameter
				map.entrySet()); //map.entrySet basically iterates through the map.		

		Collections.sort(entries, new Comparator<Map.Entry<Key, Value>>() {

			@Override
			public int compare(Entry<Key, Value> o1, Entry<Key, Value> o2) {	
				return o1.getValue().compareTo(o2.getValue());  	//Compare 2 values 
			}
		});

		Map<Key, Value> sorted = new LinkedHashMap<Key, Value>(); // Declares a sorted linked hashmap

		for (Map.Entry<Key, Value> entry : entries) {
			sorted.put(entry.getKey(), entry.getValue()); // Put every key and every value in the entries list into the sorted Map
		}
		System.out.println("The 20 least appearing words are: " + '\n'); // Print out the 20 least appearing words
		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1) + ") " + entries.get(i).getKey()+ " --> " + entries.get(i).getValue());
		}
		System.out.println("\n" + "The 20 most appearing words are:" + '\n'); // Print out the 20 most appearing words.
		int i = 1;
		for (int y = entries.size() - 1; y >= entries.size() - 20; y = y - 1) {
			System.out.println((i) + ") " + entries.get(y).getKey() + " --> "+ entries.get(y).getValue());
			i++;
		}
		return sorted; // Return sorted, which will now be sorted by values and not keys
	}

}
