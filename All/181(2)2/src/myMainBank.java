import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class myMainBank {

	
	public static void main(String[] args) throws IOException {
		File f1 = new File("bankfiles.txt");
		Scanner sc1 = new Scanner(f1);
		File f2 = new File("transactions.txt");
		PrintWriter prw = new PrintWriter(f1);
		ArrayList<BankAcct> list = new ArrayList<>();

		Scanner kb = new Scanner(System.in);

		int CoA;
		String fName;
		String lName;
		int pin = 0;
		double balance;

		while (sc1.hasNext()) {
			fName = sc1.next();
			lName = sc1.next();
			balance = sc1.nextDouble();
			pin = sc1.nextInt();
			list.add(new BankAcct(fName, lName, balance, pin));
		}

		// //////////////////////////////////MENU//////////////////////////////////////////////////

		// 1 Ask to create account if not ask for pin which is read from
		// bankfiles.txt
		// 2 They enter in credentials to create a new account and continue to
		// level 2
		// 3 if they enter in pin correct enter level 2 of account display info/
		// withdraw/ change pin/ deposit
		// 4every transaction must be sent to transaction file and not
		// overwritten
		// 5

		// Level 1
		System.out.println("Hello! Welcome to Blades Brothers Credit Union");
		System.out
				.println("Please  enter the number corresponding  with the action you wish to take");
		System.out
				.println("---------------------------------------------------------------------------------"
						+ "\n"); // \n denotes new line
		System.out.println("1) Create a New Account");
		System.out.println("2) Access my account");
		System.out.println("3) Ask for the bank teller's number");
		System.out.println("4) Quit");

		CoA = kb.nextInt();

		if (CoA == 1) {
			System.out.println("option 1");
			System.out.println("What is your first name?");
			fName = kb.next();
			System.out.println("What is your last name?");
			lName = kb.next();
			System.out.println("What is your starting balance");
			balance = kb.nextDouble();
			System.out.println("Please set your pin");
			pin = kb.nextInt();

			// creating new object --- need to go under account creation
			BankAcct newb = new BankAcct(fName, lName, balance, pin);
			// adding to the array list
			list.add(newb);

		} else if (CoA == 2) {
			System.out.println("Please enter your pin now!");
			// need pin check here
			pin =kb.nextInt();
			BankAcct currAccount = getAccount(list,pin);
			
			System.out.println("fname"+ currAccount.fname);
			
			// display account information
			// ask for next task
		} else if (CoA == 3) {
			System.out.println("option 3");

		} else if (CoA == 4) {
			System.out.println("Goodbye ");
			System.exit(0);
		} else {
			System.out.println("Try one more time ya jackass!");
			CoA = kb.nextInt();
		}

	}

	private static BankAcct getAccount(ArrayList<BankAcct> list,int pin) {
		BankAcct currAccount;
		for (int i = 0; i < list.size(); i++) {
			currAccount = list.get(i);
			if (currAccount.pin == pin) {
				return currAccount;
			}
		}
		return null;
	}
}
