/* Casey Blades
 * CPS 180
 * Homework Assignment 6
 * 3/26/15
 * 
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {

	public static void main(String[] args) throws IOException {

		Random rand = new Random();
		int randInt = 0;
		ArrayList<Integer> binarySearch = new ArrayList<Integer>();

		// generate 10 random numbers && add Integer object to array list
		for (int i = 0; i < 10000; i++) {
			randInt = rand.nextInt(100000);
			binarySearch.add(new Integer(randInt));
		}

		// sort low to high
		Collections.sort(binarySearch);
		System.out.println(binarySearch);
		 int foundat = binsearch(binarySearch, 1000, 45, 666);
	}

	// Do binary Search
	// Search s = new Search(binarySearch, 666);


	public static int binsearch(ArrayList<Integer> bin, int highVal, int lowVal, int key) {
		int position;
		boolean found = true;
		int mid = highVal + lowVal / 2;

		System.out.println(bin.get(mid));
		System.out.println(mid + key);

		if (bin.get(mid).compareTo(key) == 0) {

			found = true;
			position = mid;
			System.out.println(position);

		} else {

			if (bin.get(mid).compareTo(key) > 1) {
				highVal = mid - 1;
				position = binsearch(bin, highVal, lowVal, key);
			} else {
				lowVal = mid - 1;
				position = lowVal;
				System.out.println(position);

			}

		}

		return (0);
	}
}
