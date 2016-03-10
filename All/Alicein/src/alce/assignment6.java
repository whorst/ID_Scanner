//William Horst
package alce;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class assignment6 {

	public static void main(String[] args) throws FileNotFoundException{

		File madHatter = new File("alice.txt"); //Imports and names the file
		Scanner itput = new Scanner(madHatter); //Creates the scanner object and gives it a parameter
		int[] counter = new int[26]; //Names an Array and give it 26 spots.
		
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	//Creates a char array and defines it parameters
		while(itput.hasNext()) {     //While there's still a line to read
			String str = itput.nextLine(); //Creates a String of the next object
			str = str.toLowerCase(); //Sets the String to lower case.
			for (int i = 0; i < str.length(); i++) {
				char c1 = str.charAt(i);//Counts every character and prints it to its position in the array.
				switch(c1) {
				case 'a':
					counter[0]++;
					break;
				case 'b':
					counter[1]++;
					break;
				case 'c':
					counter[2]++;
					break;
				case 'd':
					counter[3]++;
					break;
				case 'e':
					counter[4]++;
					break;
				case 'f':
					counter[5]++;
					break;
				case 'g':
					counter[6]++;
					break;
				case 'h':
					counter[7]++;
					break;
				case 'i':
					counter[8]++;
					break;
				case 'j':
					counter[9]++;
					break;
				case 'k':
					counter[10]++;
					break;
				case 'l':
					counter[11]++;
					break;
				case 'm':
					counter[12]++;
					break;
				case 'n':
					counter[13]++;
					break;
				case 'o':
					counter[14]++;
					break;
				case 'p':
					counter[15]++;
					break;
				case 'q':
					counter[16]++;
					break;
				case 'r':
					counter[17]++;
					break;
				case 's':
					counter[18]++;
					break;
				case 't':
					counter[19]++;
					break;
				case 'u':
					counter[20]++;
					break;
				case 'v':
					counter[21]++;
					break;
				case 'w':
					counter[22]++;
					break;
				case 'x':
					counter[23]++;
					break;
				case 'y':
					counter[24]++;
					break;
				case 'z':
					counter[25]++;
					break;
				}
			}
		}
		
		
		
		for (int i =0; i < counter.length; i++) {
			System.out.println(alphabet[i] +": "+ counter[i]);//displays the array
		}



	}

}
