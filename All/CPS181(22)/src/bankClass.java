import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class bankClass {
	private String firstName;
	private String lastName;
	private int firstpin;
	private double amount;
	private int decision;
	ArrayList<bankClass> list = new ArrayList<>();

	
	Scanner kb= new Scanner(System.in);
	
	public bankClass(PrintWriter pw){

	
	System.out.println("Welcome to the bank. What wold you like to do today?");
	System.out.println("Press 1 to add an account");
	System.out.println("Press 2 to modify an exsisting account");
	
	
	decision = kb.nextInt();

	if (decision == 1) {

		System.out.println("What is your first name?");
		firstName = kb.next();
		pw.println(firstName + ",");
		list.add(new bankClass (firstName));
		for(int count= 0; count< list.size();count++){
			System.out.println(list.get(count).toString());
		} 
		

		System.out.println("What is your Last name?");
		lastName = kb.next();
		pw.println(lastName + ",");

		System.out.println("What is your pin?");
		firstpin = kb.nextInt();
		pw.println(firstpin + ",");
		

		System.out.println("What is your starting amount?");
		amount = kb.nextDouble();
		pw.println(amount + ",");
	
	
	}
	
	
	
	
	}


	
		
	public bankClass(String firstName2) {
		// TODO Auto-generated constructor stub
	}




	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFirstpin() {
		return firstpin;
	}
	public void setFirstpin(int firstpin) {
		this.firstpin = firstpin;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
