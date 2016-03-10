public class bankacct {

	String name;
	int pin;

	public bankacct(String name, int pin) { // constructor
		this.name= name;
		this.pin = pin;
	
	
	}
	
	public String toString(){
		return (name+ " " + pin);
	}
}
