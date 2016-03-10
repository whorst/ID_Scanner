
public class bankClass {
	String firstName;
	String lastName;
	int pinNumber;
	Double accountBalance;
	
	
	
	public bankClass(String firstName, String lastName, int pinNumber,
			Double accountBalance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinNumber = pinNumber;
		this.accountBalance = accountBalance;
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
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	

}
