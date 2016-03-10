


		import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

		public class bankMain {

		    public static void main(String[] args) throws IOException {

		        Scanner kb = new Scanner(System.in);
		        int decision, pin = 0, decision4 = 0;
		        String firstname = null, lastname = null;
		        double amount = 0.0;
		        int i = 0,temp=0;

		        while (i < 5) {
		            System.out.println("\n"
		                    + "Welcome to the bank. What wold you like to do today?");
		            System.out.println("\n" + "Press 1 to add an account");
		            System.out.println("\n" + "Press 2 to modify an exsisting account");

		            decision = kb.nextInt();

		            if (decision == 1) {
		                

		                System.out.println("What is your first name?");
		                firstname = kb.next();

		                System.out.println("What is your Last name?");
		                lastname = kb.next();

		                System.out.println("What is your pin?");
		                pin = kb.nextInt();

		                System.out.println("What is your amount?");
		                amount = kb.nextDouble();
		                i++;

		                
		                bankAccount obj1 = new bankAccount(amount, firstname, lastname,
		                        pin, i,temp, decision,
		                        decision4);

		              
		            }

		            if (decision == 2) {
		            
		                System.out.println("Which account would you like to view?"
		                        + "\n");
		                System.out.println("Press one to view your first account.");
		                System.out.println("Press two to view your second account.");
		                System.out.println("Press three to view your third account.");
		                System.out.println("Press four to view your fourth account.");
		                System.out.println("Press five to view your fifth account.");

		                decision4 = kb.nextInt();
		                int temp1=1;
		                
		                bankAccount obj1 = new bankAccount(amount, firstname, lastname,
		                        pin, decision4,temp1, decision,
		                        decision4);
		             
		            }
		           
		        }
		        
		
		        
		        
		        
		        
		        
		        
		        
		        
		     
		        
		        
		        //////////////////////////////////////////////////////////////////////////////////////////////
		    }
		
		   
	}

