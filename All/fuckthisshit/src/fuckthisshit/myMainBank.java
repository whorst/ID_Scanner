package fuckthisshit;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class myMainBank {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File trans = new File("transactions.txt");
		PrintWriter toTrans = new PrintWriter(trans);
		File bankfiles = new File("bankfiles.txt");
		PrintWriter toBF = new PrintWriter("bankfiles");
		BankAcct Tom = new BankAcct("Tom", "Smith", 1234, 300.0, toTrans);
		BankAcct Tim = new BankAcct("Tim", "Smith", 2341, 400.0, toTrans);
		BankAcct Sam = new BankAcct("Sam", "Smith", 3412, 500.0, toTrans);
		BankAcct Ben = new BankAcct("Ben", "Smith", 4123, 600.0, toTrans);
		BankAcct Dan = new BankAcct("Dan", "Smith", 5678, 1000.0, toTrans);
		ArrayList<BankAcct> accounts= new ArrayList <BankAcct>();
		accounts.add(Tom);
		accounts.add(Tim);
		accounts.add(Sam);
		accounts.add(Sam);
		accounts.add(Dan);
		Iterator<BankAcct> it = accounts.iterator();
		
	// write all accounts to bankfiles.txt
		while (it.hasNext()) {
			BankAcct current = it.next();
		toBF.println("Account \""+ current.getFirstName()+"\":");
		toBF.println("\tFirst name: "+current.getFirstName());
		toBF.println("\tLast name: "+current.getLastName());
		toBF.println("\tPIN: "+current.getPin());
		toBF.println("\tBalance: "+current.getAccountBalance()+"$");
		toBF.println();
		}
		
		
		
		// make some transactions
		
		Dan.withdraw(50.50, 5678, toTrans);
		Tim.deposit(50.50, toTrans);
		Dan.displayAccB(5678, toTrans);
		Tom.withdraw(400, 1234, toTrans);
		Sam.displayAccB(3456, toTrans);
		Ben.deposit(60, toTrans);
		
		
		toBF.close();
		toTrans.close();
	}
	

}
