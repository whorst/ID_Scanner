
public class BankAcct {


	String fname;
	String lname;
	int pin;
	double balance;

	BankAcct(String fname, String lName, double bal, int pin) {
		this.fname = fname;
		this.lname = lName;
		this.pin = pin;
		this.balance = bal;
	}
	
//	// Create a setter that allows you to add money to the account.
//	public void addMoney(int pin) {
//		this.pin = pin;
//		Scanner kb = new Scanner(System.in);
//
//		System.out.println("How much money would you like to deposit?");
//		int addedMoney = kb.nextInt();
//
//	}

	public String getfName() {
		return fname;
	}

	public void setfName(String fname) {
		this.fname = fname;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Create a method that would allow you to remove money from the account if
	// the proper pin is used. It should also check to see if the amount in the
	// account is above the requested amount.

	// All actions should be sent to a file listing both date and time. (This is
	// often referred to as a transaction file).

	// All Objects should be saved in a file called bankfiles.txt.

	// Create at least five accounts in the ArrayList.

}


