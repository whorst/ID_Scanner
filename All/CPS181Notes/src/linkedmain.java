import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

//this is connected to bankacct and groceries

public class linkedmain {

	public static void main(String[] args) throws IOException {
		File fi1 = new File("intfile.txt");
		File fi2 = new File("grocery.txt");

		Scanner sc1 = new Scanner(fi1).useDelimiter("[,|\n|\r]+");
		LinkedList<bankacct> list = new LinkedList<bankacct>(); // This is a linked list
		
		
		Scanner sc2 = new Scanner (fi2).useDelimiter("[,|\n|\r]+");
		LinkedList<groceries> food = new LinkedList<groceries>();  //THIS IS A FUCING LINKED LIST
		
		String name;
		
	int pin;
	
	while (sc1.hasNext()) {
			name = sc1.next();
			pin = sc1.nextInt();
			bankacct b1 = new bankacct(name, pin);

			list.add(b1);
			System.out.println(list);

			while (sc2.hasNext()) {
				name = sc2.next();
				groceries g1 = new groceries(name);
				
			food.add(g1);
				System.out.println(food);

				// ONLY OBJECTS CAN GO INTO LINKED LISTS

			}
			System.out.println(food);
			food.remove(2);
			System.out.println(food);
			name= "cookies";
			groceries g1 = new groceries(name);
			food.addFirst(g1);
			System.out.println(food);
			name = "ice cream";
			groceries g2 = new groceries(name);
			food.remove(2);
			food.add(g2);
			System.out.println(food);

			
		}
	}
}
