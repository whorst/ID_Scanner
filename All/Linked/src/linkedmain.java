import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedmain {

	public static void main(String[] args) throws IOException {
		File fi1 = new File("grocery.txt");
		Scanner sc1 = new Scanner(fi1).useDelimiter("[,|\n|\r]+");
		LinkedList<bankacct> list = new LinkedList<bankacct>();
		String name;
		// int pin;

		while (sc1.hasNext()) {
			name = sc1.next();
			// pin = sc1.nextInt();
			bankacct b1 = new bankacct(null);
			list.add(b1);
		
		}
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		name = "cookies";
		bankacct b1 = new bankacct(name);
		list.addFirst(b1);
		System.out.println(list);
		name = "ice cream";
		bankacct b2 = new bankacct(name);
		list.addLast(b2);
		System.out.println(list);

	}

	public class bankacct {
		String name;

		public bankacct(String name) {
			this.name = name;
			// this.pin = pin;

		}

		public String toString() {
			return (name);
		}
	}}

