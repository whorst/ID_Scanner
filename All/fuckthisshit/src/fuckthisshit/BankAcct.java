package fuckthisshit;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class BankAcct {
	
	// defining the variables
	private String FirstName;
	private String LastName;
	private double AccountBalance;
	private int pin;

	// creating the constructor
	public BankAcct (String firstn, String lastn, int pinNum, double startAmount, PrintWriter pw) {
		
		if(startAmount>0) {
		FirstName=firstn;
		LastName=lastn;
		AccountBalance=startAmount;
		pin=pinNum;
		printDT(pw);
		pw.println("\tBank account \""+ this.FirstName+ "\" created");
		}
		else System.out.println("Bank account cannot be created if you don't deposit money.");
	}
	
	
	// getters and setters
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName, PrintWriter pw) {
		FirstName = firstName;
		printDT(pw);
		pw.println("\tFirst name of account \""+this.FirstName +"\" has been changed to "+FirstName);
	}
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName, PrintWriter pw) {
		LastName = lastName;
		printDT(pw);
		pw.println("\tLast name of account \""+ this.FirstName+ "\" has been changed to \""+LastName+"\"");
	}
	
	//I needed this to get the account balance to then write it into bankfiles.txt
	public double getAccountBalance() {
		return AccountBalance;
	}
	
	
	// getPin isn't good for security reasons but I made an exception because I needed it in the main to write it to the bankfiles.txt
	public int getPin() {
		return pin;
	}
		
	public void setPin(int pin, PrintWriter pw) {
		this.pin = pin;
		printDT(pw);
		pw.println("PIN of account \""+ this.FirstName+ "\" has been changed to "+pin);
	}
	
	
	// display the account balance
	public double displayAccB(int pinInp, PrintWriter pw) {
		
		// check the PIN
		if (pinInp==pin) {
			printDT(pw);
			pw.println("\tAccount balance of account \""+this.FirstName+ "\" inquired. Current account balance: "+AccountBalance+" $");
		return AccountBalance;
		}
		else {
			System.out.println("PIN does not match.");
			printDT(pw);
			pw.println("\tWrong PIN entered for account \""+this.FirstName+"\"");
			return -1;
		}
	}
	
	// withdraw money
	public void withdraw(double withd, int pinN, PrintWriter pw) {
		//check the PIN
		if(pinN==this.pin) {
			
		//check if enough money is in the account
		if (AccountBalance >= withd) {
			AccountBalance -= withd;
			printDT(pw);
			pw.println("\t"+withd+" $ withdrawn from \""+this.FirstName+"\"");
		}
		else {
			System.out.println("Not enough money in the account.");
			printDT(pw);
			pw.println("\tWithdrawal from account \""+this.FirstName+"\" failed");
		}
		}
		else {
			System.out.println("Wrong PIN");
			printDT(pw);
			pw.println("\tWrong PIN entered for account \""+this.FirstName+"\"");
		}
		
	}
	
	
	// I looked up how to print the date and time on this website: http://beginnersbook.com/2013/05/current-date-time-in-java/

	public void printDT(PrintWriter pw) {
		DateFormat df = new SimpleDateFormat("MM/dd/yy HH:MM:ss");
		Calendar cal = Calendar.getInstance();
		pw.print(df.format(cal.getTime()));
	}
	
	// add money to the account
	public void deposit(double accB, PrintWriter pw)  {
		AccountBalance += accB;
		printDT(pw);
		pw.println("\t"+accB+"$ were deposited in the account \""+this.FirstName+"\"");
	}
}
