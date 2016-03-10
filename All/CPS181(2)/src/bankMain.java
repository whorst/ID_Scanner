import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//William Horst

public class bankMain {

    public static void main(String[] args) throws IOException {

        File file = new File("BankPeople.txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		//I used a bufferedwriter here
		
		
		 File file2 = new File("bankfiles.txt");
	        FileWriter fw2 = new FileWriter(file2.getAbsoluteFile());
			BufferedWriter bw2 = new BufferedWriter(fw2);
		
		Scanner kb= new Scanner(System.in);
       
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //Prints out the datse
        

        ArrayList<bankAccount> list1 = new ArrayList<>();
        ArrayList<bankAccount> list2 = new ArrayList<>();
        ArrayList<bankAccount> list3 = new ArrayList<>();
        ArrayList<bankAccount> list4 = new ArrayList<>();
        ArrayList<bankAccount> list5 = new ArrayList<>();
        //Makes 5 different array lists
        
        
        int decision, pin = 0, decision4 = 0, decision5=0;
        String firstname = null, lastname = null;
        double amount = 0.0;
        int i = 0,temp=0, j = 0;
        
      //  while(j<=5){

        while (i < 6) {
            System.out.println("\n"
                    + "Welcome to the bank. What wold you like to do today?");
            System.out.println("\n" + "Press 1 to add an account");
            System.out.println("\n" + "Press 2 to modify an exsisting account");
            System.out.println("\n" + "Press 3 to exit");
            //This is the menu
            
            
            decision = kb.nextInt();
            //allows you to decide which dwcision you'd like to make
            
            if (decision == 1) {
                

                System.out.println("What is your first name?");
                firstname = kb.next();
                bw2.write("\n"+firstname);
                bw.write("\n"+firstname + " "+(dateFormat.format(date)));
                
                System.out.println("What is your Last name?");
                lastname = kb.next();
                bw2.write("\n"+lastname);
                bw.write("\n"+lastname +" "+(dateFormat.format(date)));


                System.out.println("What is your pin?");
                pin = kb.nextInt();
                bw2.write("\n"+pin);
                bw.write("\n"+pin +" "+(dateFormat.format(date)));


                System.out.println("What is your amount?");
                amount = kb.nextDouble();
                bw2.write("\n"+amount);
                bw.write("\n"+amount +" "+(dateFormat.format(date)));

                i++;

                

                // Constructor

                // System.out.println(obj1.getName() + " " + obj1.getName2());
                // System.out.println(" ");
                // System.out.println("Pin number:" + " " + obj1.getfirstPin());
                // System.out.println(" ");
                // System.out.println("Amount added:" + " " + obj1.getAmount());
                // System.out.println(" ");
                bankAccount obj1 = new bankAccount(amount, firstname, lastname,
                        pin, list1, list2, list3, list4, list5, i,temp, decision,
                        decision4,decision5,bw,bw2);

                
            }

      
            if (decision == 2) {
            
                
                
                
               
                System.out.println("Press 1 to add or remove from your first account.");
                System.out.println("Press 2 to add or remove from your second account.");
                System.out.println("Press 3 to add or remove from your third account.");
                System.out.println("Press 4 to add or remove from your fourth account.");
                System.out.println("Press 5 to add or remove from your fifth account.");

                
                
                
                
                
                decision5 = kb.nextInt();
                int temp1=1;
 
                
                bankAccount obj1 = new bankAccount(amount, firstname, lastname,
                        pin, list1, list2, list3, list4, list5, decision4,temp1, decision,
                        decision4, decision5,bw,bw2);
        }
           
            
            if(decision == 3){
            
            	System.out.println("Press 6 to exit.");
            	bw2.close();
            	decision5 = kb.nextInt();
            	bankAccount obj1 = new bankAccount(amount, firstname, lastname,
                        pin, list1, list2, list3, list4, list5, i,temp, decision,
                        decision4, decision5,bw,bw2);
            }
    }
      
        
}
     
}
//Welcome to the bank. What wold you like to do today?
//
//Press 1 to add an account
//
//Press 2 to modify an exsisting account
//
//Press 3 to exit
//1
//What is your first name?
//Will
//What is your Last name?
//Horst
//What is your pin?
//4444
//What is your amount?
//44
//in i1==1[
//Bank Account 1
//Name: Will Horst
//Pin: 4444
//Amount: 44.0
//]
//
//Welcome to the bank. What wold you like to do today?
//
//Press 1 to add an account
//
//Press 2 to modify an exsisting account
//
//Press 3 to exit
//2
//Press 1 to add or remove from your first account.
//Press 2 to add or remove from your second account.
//Press 3 to add or remove from your third account.
//Press 4 to add or remove from your fourth account.
//Press 5 to add or remove from your fifth account.
//1
//Enter Pin for account 1: 
//4444
//[
//Bank Account 1
//Name: Will Horst
//Pin: 4444
//Amount: 44.0
//]
//Press one to Add funds.
//Press two to Remove funds.
//1
//Enter the amount to be added:
//6734
//New Account Balance: 6778.0.
//
//Welcome to the bank. What wold you like to do today?
//
//Press 1 to add an account
//
//Press 2 to modify an exsisting account
//
//Press 3 to exit
//3
//Press 6 to exit.
//6
//in i1==1[
//Bank Account 0
//Name: Will Horst
//Pin: 4444
//Amount: 6778.0
//, 
//Bank Account 1
//Name: Will Horst
//Pin: 4444
//Amount: 44.0
//]

