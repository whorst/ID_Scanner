import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//Fruit.java
//Will Horst
//HW5
//10/16/2015
//This program add strings from a text file to an object and then sorts a list of those 
//objects base on a user selected nutritional value

public class Fruit implements Comparable<Fruit> {

	String name, amount;
	static int i;
	private static int index;

	ArrayList<Float> nutritionLabel = new ArrayList();
	ArrayList<Float> nutritionValues = new ArrayList();
	//Two arrylists to hold nutritional values

	public Fruit(String name, String amount, List nutritionValues,List nutritionLabel) {
		this.name = name;
		this.amount = amount;
		this.nutritionValues = (ArrayList<Float>) nutritionValues;
		this.nutritionLabel = (ArrayList<Float>) nutritionLabel;
		
		//Declare a fruit object

	}

	public String toString() {

		//ToString Method
		
		return "The name of the fruit is " + name + " The amount is " + amount
				+ " The nutritional values are " + '\n' + nutritionLabel + '\n'
				+ nutritionValues + "\n";
	}

	@Override
	public int compareTo(Fruit o) {
		//Compareto for comparing nutritions indexes
		
		int retval = 0;

		float temp = o.getNutritionIndex();


		if (this.getNutritionIndex() > o.getNutritionIndex()) {
			retval = 1;
		}
		if (this.getNutritionIndex() == o.getNutritionIndex()) {
			retval = 0;
		}
		if (this.getNutritionIndex() < o.getNutritionIndex()) {
			retval = -1;
		}


		return retval;

	}

	public String getName() {
		return name;
	}

	public float getNutritionIndex() {
		return nutritionValues.get(Fruit.index);
	}

	public void setIndex(int index) {
		Fruit.index = index;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}