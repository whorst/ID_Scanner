// CP S181 Spring 2015 Assignment 3
// Due 02/11/2015
// Tanja Gallmann, gallm1t
// William Horst and I worked on this together

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.io.*;


public class myMain {
	
	public static LinkedList<BankAcct> list = new LinkedList<>();
	static BankAcct b1; 
	static BankAcct b2;
	static BankAcct b3;
	static BankAcct b4;
	static BankAcct b5;

	public static void main(String[] args) throws IOException {

		//variables
		
		File f1 = new File("accountsStart.txt");
		Scanner sc1 = new Scanner(f1).useDelimiter("[,|\n|\r]+");
		String tempS1;
		String tempS2;
		double tempD;
		int tempI;
		File trans = new File("transactions.txt");
		PrintWriter prw= new PrintWriter(trans);
		File out = new File("outfile.txt");
		PrintWriter pOut= new PrintWriter(out);
		Scanner scM = new Scanner(System.in);

		// creating 5 bank accounts from the file and adding them to the list

			tempS1 = sc1.next();
			tempS2 = sc1.next();
			tempD = sc1.nextDouble();
			tempI = sc1.nextInt();
			b1 = new BankAcct(tempS1, tempS2, tempD, tempI);
			list.add(b1);
			
			tempS1 = sc1.next();
			tempS2 = sc1.next();
			tempD = sc1.nextDouble();
			tempI = sc1.nextInt();
			b2 = new BankAcct(tempS1, tempS2, tempD, tempI);
			list.add(b2);

			tempS1 = sc1.next();
			tempS2 = sc1.next();
			tempD = sc1.nextDouble();
			tempI = sc1.nextInt();
			b3 = new BankAcct(tempS1, tempS2, tempD, tempI);
			list.add(b3);

			tempS1 = sc1.next();
			tempS2 = sc1.next();
			tempD = sc1.nextDouble();
			tempI = sc1.nextInt();
			b4 = new BankAcct(tempS1, tempS2, tempD, tempI);
			list.add(b4);

			tempS1 = sc1.next();
			tempS2 = sc1.next();
			tempD = sc1.nextDouble();
			tempI = sc1.nextInt();
			b5 = new BankAcct(tempS1, tempS2, tempD, tempI);
			list.add(b5);
		
		sc1.close();
		
		// the loop to keep the program running
		
		while (menu(prw,scM)==0) {}
		Iterator<BankAcct> it = list.iterator();
		BankAcct TempAcc= new BankAcct();
		while(it.hasNext()) {
			TempAcc = it.next();
			pOut.println(TempAcc.getAcctInfo());
		}
		
		pOut.close();
		prw.close();
		File f2= new File("infile.txt");
		if (f2.isFile()) { f2.delete();}
		out.renameTo(f2);
	}
	
	// menu
	
	public static int menu(PrintWriter prw, Scanner scM) {
		BankAcct Temp = new BankAcct();
		
		// Showing the user his options
		
		System.out.println("Does the action you want to perform involve a specific bank account? If so, please enter the NUMBER of the account you want to work with:");
		System.out.println("Bank Account 1");
		System.out.println("Bank Account 2");
		System.out.println("Bank Account 3");
		System.out.println("Bank Account 4");
		System.out.println("Bank Account 5");
		System.out.println("If your action does not refer to a specific account please enter '6'");
		System.out.println("If you are finished please enter '7'");
		
		// Get user's input
		
		int chosen= scM.nextInt();
		
		// if bank account was chosen, get the bank account
		
		switch(chosen) {
		case 1: Temp = b1;
		break;	
		case 2: Temp = b2;
		break;
		case 3: Temp = b3;
		break;
		case 4: Temp = b4;
		break;
		case 5: Temp = b5;
		break;
		case 6: Temp=null;
		break;

		case 7: printDT(prw); prw.println(" Program was terminated by the user."); return 1;
		default: System.out.println("Please enter a valid NUMBER next time."); return 0;
		}
		
		// depending on former input, show two different new menus
		
		if(Temp!=null){
		System.out.println("What do you want to do with this bank account? Please enter the number of the action:");
		System.out.println("1) Add the bank account to the front of the list");
		System.out.println("2) Add the bank account to the rear of the list");
		System.out.println("3) Add the bank account to a certain position in the list");
		
		// get the new input
		
		chosen=scM.nextInt(); 
		
		// do what was chosen
		
		switch(chosen){
		case 1: list.addFirst(Temp);
		printDT(prw); prw.println(" "+Temp+" added to the front of the list");
		
			break;
		case 2: list.addLast(Temp);
		printDT(prw); prw.println(" "+Temp+" added to the rear of the list");
		break;
		case 3: {
			System.out.println("Please enter the position you wish to add at: ");
			int pos=scM.nextInt();
			list.add(pos-1, Temp);
			printDT(prw); prw.println(" "+Temp+" added to position "+pos+" of the list");}
		
		break;
		default: System.out.println("Please enter a valid NUMBER.");
		
		}
		}
		
		else {
			
			// menu if no bank account was chosen
			
			System.out.println("What do you want to do? Please enter the NUMBER.");
			System.out.println("1) Print the list.");
			System.out.println("2) Remove the first account of the list");
			System.out.println("3) Remove the last account of the list");
			
			// get new input
			
			chosen=scM.nextInt();
			
			// do what was chosen
			
			switch(chosen) {
			
			case 1: print(list);
			printDT(prw); prw.println(" The list has been printed");
			break;
		case 2: list.removeFirst();
		printDT(prw); prw.println(" The first entry of the list has been removed");
		break;
		case 3: list.removeLast();
		printDT(prw); prw.println(" The last entry of the list has been removed");
		break;
		default: System.out.println("Please enter a valid NUMBER.");
			
			}
			
		}
		
		return 0;
		}
	
	// Printing the list
	
	public static void print(LinkedList<BankAcct> list) {
		Iterator<BankAcct> it = list.iterator();
		BankAcct TempAcc= new BankAcct();
		int i=1;
		while(it.hasNext()) {
			TempAcc = it.next();
			System.out.print(i+") ");
			System.out.println(TempAcc.getAcctInfo());
			System.out.println();
			i++;
		}
	}
	
	// I looked up how to print the date and time on this website: http://www.developer.com/java/java-se-8-and-the-new-date-and-time-library.html

	public static void printDT(PrintWriter pw) {
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now(Clock.systemDefaultZone());
		pw.print(date+" "+time);
	}
		
		
		
	}

