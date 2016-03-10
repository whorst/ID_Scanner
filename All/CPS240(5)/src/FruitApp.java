import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

//FruitApp.java
//Will Horst
//HW5
//10/16/2015
//This program add strings from a text file to an object and then sorts a list of those 
//objects base on a user selected nutritional value

public class FruitApp {

	static ArrayList<String> fruitName = new ArrayList<String>();
	// A String ArrayList that will hold the Fruit names.
	static ArrayList<String> fruitAmount = new ArrayList<String>();

	// A String ArrayList that will hold the serving sizes.

	public static void main(String[] args) throws FileNotFoundException {

		File file2 = new File("Fruit.txt");
		PrintWriter prw = new PrintWriter(file2);
		// The file and printwriter above are for printing output

		File f = new File("FruitNutrition.txt");
		Scanner sc = new Scanner(f);
		int index;
		// The file and scanner are for reading in values

		ArrayList<String> nutLabels = new ArrayList<String>();
		// An ArrayList for nutritional Labels
		ArrayList<Float> nutritionValue = new ArrayList();
		// An ArrayList for nutritional values type float

		ArrayList f1 = new ArrayList();

		String[] nutValue;
		// This will hold the nutritional values
		String name, amount;

		nutValue = sc.nextLine().split("\t");
		// Split every single word by a tab.
		for (int i = 2; i < nutValue.length; i++) {
			nutLabels.add(nutValue[i]);
		}

		while (sc.hasNext()) {
			String row = sc.nextLine();

			name = getName(sc, row);
			amount = getAmount(sc, row);
			nutritionValue = readFruitData(sc, row);
			// Call multiple methods, the difinitions can be seen below

			Fruit fruit1 = new Fruit(name, amount, nutritionValue, nutLabels);
			// Create a new fruit object that accepts the name, serving size,
			// the nutritional values of the fruit, and the labels

			f1.add(fruit1);
			// Add the fruit object to an ArrayList

			fruitName.add(fruit1.getName());
			fruitAmount.add(fruit1.getAmount());
			// The above sata structures are used for holding names and serving
			// sizes of fruit

		}
		int ui = selectItem(nutLabels, f1);
		// Return the user input ofr the selected fruit

		ArrayList<Fruit> f2 = MyUtil.selectionSort(f1);
		// An ArrayList that holds the sorted Values

		for (Fruit fruit : f2) {
			ArrayList<String> temp1 = new ArrayList();
			ArrayList<String> temp2 = new ArrayList();

			temp1.add(fruit.name);
			// This temporary AL will hold fruit names
			temp2.add(fruit.amount);
			// This temporary AL will hold serving sizes

			System.out.println(fruit.name + "\t" + fruit.amount + "\t"
					+ nutLabels.get(ui) + "\t" + fruit.getNutritionIndex());
			prw.print(fruit.name + "\t" + fruit.amount + "\t"
					+ nutLabels.get(ui) + "\t" + fruit.getNutritionIndex()
					+ "\n");
		}
		prw.close();
	}

	public static ArrayList readFruitData(Scanner sc, String row) {
		// Read in fruit data from the .txt file

		String g[] = row.split("\t");
		ArrayList t = new ArrayList();

		for (int i = 2; i < g.length; i++) {
			// Read the elements starting at element 2, else we'd get hte
			// serving size and name

			float var = Float.parseFloat(g[i]);
			t.add(var);
			// Convert our Strings to floats and add them to an Array

		}

		return t;
		// Return the FLoat Array

	}

	public static String getName(Scanner sc, String row) {
		// Return the name of the fruit
		String g[] = row.split("\t");

		String name = (g[0]);
		return name;
	}

	public static String getAmount(Scanner sc, String row) {
		// Return the amount of the fruit
		String g[] = row.split("\t");

		String name = (g[1]);
		return name;
	}

	public static int selectItem(ArrayList AL, ArrayList obj) {
		// Asks the user to select which nutritional value they'd like to see

		Scanner kb = new Scanner(System.in);

		System.out.println("What nutritional value would you like to see?");

		int ui;

		for (int i = 0; i < AL.size(); i++) {
			System.out.print(i + 1 + " ");
			System.out.println((AL.get(i)) + "\n");
		}

		ui = kb.nextInt() - 1;
		System.out.println(AL.get(ui));

		for (int i = 0; i < obj.size() - 1; i++) {
			Fruit f = (Fruit) obj.get(i);
			Fruit f1 = (Fruit) obj.get(i + 1);
			f.setIndex(ui);

		}
		return ui;

	}
}
