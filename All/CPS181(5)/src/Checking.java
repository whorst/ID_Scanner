
public class Checking extends bankacct {
	private final int typeC = 1;
	private String name = "Bob";   //Savings is extended. Savings overtakes name
	private int balance = 1000;
	
	public Checking(){
		System.out.println("Constructing a savings account");				//MY constructor
	}

	public String getNameC() {
		return name;
	}

	public void setNameC(String name) {
		this.name = name;
	}

	public int getBalanceC() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}