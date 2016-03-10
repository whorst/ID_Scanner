import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class teest {


	public static void main(String[] args) throws Exception {

		File f1 = new File("grocerylist.txt");
		File obt = new File("obtained.txt");
		PrintWriter prw = new PrintWriter(obt);
		
		try {
			Scanner sc = new Scanner(f1).useDelimiter("[\n\r\t]");
			Scanner userIn = new Scanner(System.in).useDelimiter("[\n\r\t]");
			boolean continu = true;
			testclass myList = new testclass(sc);
			System.out
					.println("A new list has been created for you from grocerylist.txt");

			while (continu == true) {
				createMsg();
				System.out
						.println(" 1 Add something to the list \n 2 Remove an obtained item \n 3 Display your list");
				System.out.println("Or are you done? Then please enter 4");
				System.out
						.println("If you would be so kind as to enter the number of your choice now: ");

				int selection = userIn.nextInt();
				userIn.next();

				switch (selection) {

				case 1:
					myList.addFromMenu(userIn);
					break;
				case 2:
					myList.remove(userIn,prw);
					break;
				case 3:
					myList.displayList();
					break;
				case 4:
					continu = false;
					break;
				default:
					System.out
							.println("1,2,3 or 4 please. Come on, you can do it!");
					break;

				}

				continue;
			}

			sc.close();
			userIn.close();
			prw.close(); // close prw, apparently very important for actually
							// having something written into the file!
			System.out
					.println("Congratulations! You finished shopping. Hopefully you didn't forget anything.");
		}
		catch(InputMismatchException e){System.out.println("Only NUMBERS are accepted. Restart program.");}
		catch (Exception e) {
			System.out.println(e+" Something went wrong here. Restart program to try again.");
			System.exit(1);
		}
	}

	public static void createMsg() {
		int random = (int) (Math.random() * 6);

		switch (random) {
		case 0:
			System.out.println("How can I help you today?");
			break;
		case 1:
			System.out.println("What can I do for you?");
			break;
		case 2:
			System.out
					.println("What do you want? Make it short, I'm busy...");
			break;
		case 3:
			System.out
					.println("Hello gorgeous! What can I help you with on such a nice day?");
			break;
		case 4:
			System.out.println("What is thy desire?");
			break;
		default:
			System.out.println("Please choose an option: ");
		}
	}

}
