import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.AbstractCollection;
import java.util.LinkedList;


public class Decision extends Methods {

	
	private int decisions2, username, password;
	static int counter;

	static Scanner kb = new Scanner(System.in);



	public Decision(int decisions) {{// <<<<<THIS SHIT RIGHT HERE IS THE
										// CONSTRUCTOR. I REPEAT-THIS IS THE
										// CONSTRUCTOR
		
			this.decisions2 = decisions;

			switch (decisions2) {

			case 1:
				System.out.println("Accessing old account..." + "\n");
				URLs();
				break;

			case 2:
				
				if (!doubleL.isEmpty()) {
					System.out.println("You already have an account, therefore you can't create a new account.");
					MenuScreen();
				} else {
					System.out.println("Constructing new Account...");
					create(); // This line invokes the Create method.
					// }
					break;
				}
			case 3:
				System.out.println("Preparing to delete...");
				delete();
				break;

			case 4:
				System.out.println("Goodbye...(FAGGOT)");
				System.exit(0);
				break;
			case 5:
				forgot();
			}

		}

	}

	String password3;

}
