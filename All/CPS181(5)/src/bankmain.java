import java.util.ArrayList;


public class bankmain {

	public static void main(String[] args) {
		
		ArrayList<bankacct> bank = new ArrayList<bankacct>();
		
		Savings s1 = new Savings(); //S1 is an object
		System.out.println(s1.getName());
		bank.add(s1);

	}

}
