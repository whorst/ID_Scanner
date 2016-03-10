import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Triangle.java
//Will Horst
//HW2d
//9/16/2015
//This program allows a user to enter three values. 
//If the three values don't form a proper triangle, then a custom exception is thrown


public class Triangle {

	private static double side1, side2, side3;
	static Scanner kb = new Scanner(System.in);
	static PrintWriter prw;


	public static void main(String[] args) throws InvalidTriangleException, IOException {
		
		File k = new File ("HW2.txt");			//Create a file called HW@
		prw =new PrintWriter(new BufferedWriter(new FileWriter("HW2.txt", true)));	//This line of code allows one to not overwrite .txt files
		
		System.out.println("Please enter in 3 numbers to make up the three sides of a triangle.");
		side1 = kb.nextDouble();	//These lines of code allow the user to input their data
		side2 = kb.nextDouble();
		side3 = kb.nextDouble();
		
		prw.print(side1 +" " + side2 + " "  + " "+ side3); //Write the sides to the .txt file.
		
		Triangle obj = new Triangle(side1, side2, side3); //Create a triangle object
		
		prw.close();
	}

	public Triangle(double side1, double side2, double side3)throws InvalidTriangleException { //Create a constructor
		this.side1 = side1;		
		this.side2 = side2;
		this.side3 = side3;

		if (side1 + side2 <= side3 || side3 + side2 <= side1|| side3 + side1 <= side2) {	//If one side is larger than any two sides, throw the custom exception
			throw new InvalidTriangleException();
		} else {
			getPerimeter(side1, side2, side3);	//If everything checks out, simply print the perimeter.

		}
	}

	public static double getPerimeter(double side1, double side2, double side3) {//getPerimieter allows us discover the perimeter of the triangle.
		double perim = side1 + side2 + side3;

		System.out.println("The perimeter of the triangle (" + side1 + ", "+ side2 + ", " + side3 + "," + ") is: " + perim);
		prw.print("The perimeter of the triangle (" + side1 + ", "+ side2 + ", " + side3 + "," + ") is: " + perim);
		return perim;

	};



}


