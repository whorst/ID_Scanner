import java.util.Scanner;

//William Horst
public class FinanceProject {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		

		double investment_amount, annual_interest_rate, future_investment_amount;
		int number_of_years;
		
		System.out.println("What is your invetment amount?");
		investment_amount = keyboard.nextDouble();
		
		System.out.println("What is your annual interest rate?");
		annual_interest_rate = keyboard.nextDouble();
		
		System.out.println("How many years?");
		number_of_years = keyboard.nextInt();
		
		future_investment_amount = (int) (investment_amount * (1 + annual_interest_rate));
		
		Math.pow(future_investment_amount, number_of_years*12);
		
		System.out.println(future_investment_amount);
		
	}

}
