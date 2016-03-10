import java.util.Scanner;


public class FinanceProject {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		double investment_amount, annual_interest_rate, future_investment;
		double number_of_years = keyboard.nextDouble();
		
		System.out.println("What is your investment amount?");
		investment_amount = keyboard.nextDouble();
		
		System.out.println("What is your annual interest rate?");
		annual_interest_rate = keyboard.nextDouble();
		
		System.out.println("What is your future investment?");
		future_investment = keyboard.nextDouble();
		
		System.out.println("How many years?");
		number_of_years = keyboard.nextInt();
		
		future_investment = investment_amount * (1 + annual_interest_rate);
				Math.pow(future_investment, number_of_years*12);
				
		System.out.println("Your future investment amount is" + future_investment);		
	}

}
