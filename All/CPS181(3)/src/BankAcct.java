
public class BankAcct {
	
	// variables
	
	private String first;
	private String last;
	private double balance;
	private int pin;
	
	
	// constructor
	
	public BankAcct(String fi, String la, double bal, int pinn) {
		first=fi;
		last=la;
		balance=bal;
		pin=pinn;
	}
	
	// default constructor
	public BankAcct(){};
	
	// getter for the attributes 
	
	public String getAcctInfo() {
		return (first+","+last+","+balance+","+pin);
	}

}
//Does the action you want to perform involve a specific bank account? If so, please enter the NUMBER of the account you want to work with:
//Bank Account 1
//Bank Account 2
//Bank Account 3
//Bank Account 4
//Bank Account 5
//If your action does not refer to a specific account please enter '6'
//If you are finished please enter '7'
//1
//What do you want to do with this bank account? Please enter the number of the action:
//1) Add the bank account to the front of the list
//2) Add the bank account to the rear of the list
//3) Add the bank account to a certain position in the list
//1
//Does the action you want to perform involve a specific bank account? If so, please enter the NUMBER of the account you want to work with:
//Bank Account 1
//Bank Account 2
//Bank Account 3
//Bank Account 4
//Bank Account 5
//If your action does not refer to a specific account please enter '6'
//If you are finished please enter '7'
//6
//What do you want to do? Please enter the NUMBER.
//1) Print the list.
//2) Remove the first account of the list
//3) Remove the last account of the list
//1
//1) Rob,Summer,300.0,123
//
//2) Rob,Summer,300.0,123
//
//3) Bob,Winter,400.0,456
//
//4) Tom,Spring,500.0,789
//
//5) Nina,Fall,500.0,321
//
//6) Klaus-Dieter,Maier,5000.0,654
//
//Does the action you want to perform involve a specific bank account? If so, please enter the NUMBER of the account you want to work with:
//Bank Account 1
//Bank Account 2
//Bank Account 3
//Bank Account 4
//Bank Account 5
//If your action does not refer to a specific account please enter '6'
//If you are finished please enter '7'
//7
