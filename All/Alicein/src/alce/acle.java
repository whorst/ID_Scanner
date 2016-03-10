package alce;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class acle {
	public static void main(String[] args) throws FileNotFoundException {
		File Alice = new File("Alice.txt");
		Scanner fr = new Scanner(Alice);
		int[] counts = new int[26];
		char[] letters = {'a', 'b', 'c', 'd', 'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' }; //This is in shorthand. I can change it to regular later.
		while (fr.hasNext()) {
			String so = fr.nextLine().toLowerCase(); //Goes line by line

			for (int i = 0; i < so.length(); i++) { //i goes through the length of the line character by character and quits, moving to the next line, when we've gone through every singles character.
				char co = so.charAt(i); //checks the character value at the respective character.
			if (co - 'a'>= 0){   //if the character is between 0 and 26, add 1, going to the next letter.
				counts[co -'a']++; //allows one to move to the next char value
				
				System.out.print(so);
				}
			}
		}
	}
}
