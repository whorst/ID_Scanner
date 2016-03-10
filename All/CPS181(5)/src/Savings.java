
public class Savings extends bankacct {
	private final int type = 1;
	private String name = "Bob";   //Savings is extended. Savings overtakes name
	private int balance = 1000;
	
	public Savings(){
		System.out.println("Constructing a savings account");				//MY constructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
