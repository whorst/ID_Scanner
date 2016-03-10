
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bankAccount{ 

    Scanner kb = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int firstpin;
    private int i;
    private int decision2 = 0;

    private double amountbalance;
    int decision1;
  

    ArrayList<bankAccount> list1; // Array list
    ArrayList<bankAccount> list2;
    ArrayList<bankAccount> list3;
    ArrayList<bankAccount> list4;
    ArrayList<bankAccount> list5;
    private int i1,temp1;

    public bankAccount(double amount, String firstname, String lastname,
            int pin,  int i,int temp, int decision, int decision4) throws IOException
    // Pass through the constructor
    {
    	File file = new File ("trans.txt");
        PrintWriter printWriter = new PrintWriter (file);
    
        list1 = new ArrayList<bankAccount>();
        list2 = new ArrayList<bankAccount>();
        list3 = new ArrayList<bankAccount>();
        list4 = new ArrayList<bankAccount>();
        list5 = new ArrayList<bankAccount>();

        this.i1 = i;
        this.firstName = firstname;
        this.lastName = lastname;
        this.firstpin = pin;
        this.amountbalance = amount;
        this.decision2 = decision4;
        this.temp1=temp;
        
        
        printWriter.println ("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                + amount + "\n");    
        printWriter.close (); 

        if (i1 == 1 ) {
            if(temp==0)
            {
            list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }

            System.out.println(list1.toString());


        }

        if (i1 == 2) {
            if(temp==0)
            {

            list2.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println(list2.toString());


        if (i1 == 3) {
            if(temp==0)
            {

            list3.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println(list3.toString());

        }
        if (i1 == 4) {
            if(temp==0)
            {

            list4.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println(list4.toString());

        }
        if (i1 == 5) {
            if(temp==0)
            {

            list5.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println(list5.toString());

        }    
        if(decision2==1){
        	
        	decision2 = 0;
     	 
        	int poon = 0;
        	 System.out.println("Enter Pin for account 1: ");
         	int newpin = kb.nextInt();
         
         	
         	 if(newpin != pin){
             	System.out.println("Sorry! Wrong pin.");
             	System.exit(0);
             }
             	  
         	
         	 if(newpin == pin){ 

            System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
           poon = kb.nextInt();
      
           if(poon == 1){     
        	   System.out.println("Enter the amount to be added:");
        	   double madd = kb.nextDouble();
        	   double newamount = madd + amount;
        	   
        	   list1.remove(0);
        	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                       + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                       + newamount + "\n");
        	   System.out.println("New Account Balance: " + newamount + ".");
        	   
        }   
           }
           
		if(poon == 2){
   
			  System.out.println("Enter the amount to be removed:");
       	   double mSub = kb.nextDouble();
       	   	if(mSub > amount){
       	   		System.out.println("Insufficient Funds.");
       	   		System.exit(0);
       	   	}
       	   
       	   double newamount = amount - mSub;
       	   	
       	   
       	   list1.remove(0);
       	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
        	   
        	   
        	   
           }
 
       }

        if(decision2==2){
        	 decision2=0;
        	int poon = 0;
        	 System.out.println("Enter Pin for account 2: ");
         	int newpin = kb.nextInt();
         	
         	 if(newpin != pin){
             	System.out.println("Sorry! Wrong pin.");
             	System.exit(0);
             }
             	  
         	
         	 if(newpin == pin){ 

            System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
           poon = kb.nextInt();
      
           if(poon == 1){     
        	   System.out.println("Enter the amount to be added:");
        	   double madd = kb.nextDouble();
        	   double newamount = madd + amount;
        	   
        	   list2.remove(0);
        	   list2.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                       + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                       + newamount + "\n");
        	   System.out.println("New Account Balance: " + newamount + ".");
        	   
        }   
           }
           
		if(poon == 2){
   
			  System.out.println("Enter the amount to be removed:");
       	   double mSub = kb.nextDouble();
       	   	if(mSub > amount){
       	   		System.out.println("Insufficient Funds.");
       	   		System.exit(0);
       	   	}
       	   
       	   double newamount = amount - mSub;
       	   	
       	   
       	   list2.remove(0);
       	   list2.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
        	   
        	   
        	   
		}
        }
    
         if(decision2==3){
        	 decision2=0;
         	int poon = 0;
         	 System.out.println("Enter Pin for account 3: ");
          	int newpin = kb.nextInt();
          	
          	 if(newpin != pin){
              	System.out.println("Sorry! Wrong pin.");
              	System.exit(0);
              }
              	  
          	
          	 if(newpin == pin){ 

             System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
            poon = kb.nextInt();
       
            if(poon == 1){     
         	   System.out.println("Enter the amount to be added:");
         	   double madd = kb.nextDouble();
         	   double newamount = madd + amount;
         	   
         	   list3.remove(0);
         	   list3.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                        + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                        + newamount + "\n");
         	   System.out.println("New Account Balance: " + newamount + ".");
         	   
         }   
            }
            
 		if(poon == 2){
    
 			  System.out.println("Enter the amount to be removed:");
        	   double mSub = kb.nextDouble();
        	   	if(mSub > amount){
        	   		System.out.println("Insufficient Funds.");
        	   		System.exit(0);
        	   	}
        	   
        	   double newamount = amount - mSub;
        	   	
        	   
        	   list3.remove(0);
        	   list3.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                       + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                       + newamount + "\n");
        	   System.out.println("New Account Balance: " + newamount + ".");
         	   
         	   
         	   
 		}

         }

        	 decision2=0;
          	int poon = 0;
          	 System.out.println("Enter Pin for account 4: ");
           	int newpin = kb.nextInt();
           	
           	 if(newpin != pin){
               	System.out.println("Sorry! Wrong pin.");
               	System.exit(0);
               }
               	  
           	
           	 if(newpin == pin){ 

              System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
             poon = kb.nextInt();
        
             if(poon == 1){     
          	   System.out.println("Enter the amount to be added:");
          	   double madd = kb.nextDouble();
          	   double newamount = madd + amount;
          	   
          	   list4.remove(0);
          	   list4.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                         + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                         + newamount + "\n");
          	   System.out.println("New Account Balance: " + newamount + ".");
          	 //  out.print("hi");
          	   
          }   
             }
             
  		if(poon == 2){
     
  			  System.out.println("Enter the amount to be removed:");
         	   double mSub = kb.nextDouble();
         	   	if(mSub > amount){
         	   		System.out.println("Insufficient Funds.");
         	   		System.exit(0);
         	   	}
         	   
         	   double newamount = amount - mSub;
         	   	
         	   
         	   list4.remove(0);
         	   list4.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                        + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                        + newamount + "\n");
         	   System.out.println("New Account Balance: " + newamount + ".");
          	   
          	   
          	   
  		}
  	}
        
         if(decision2==5){
        	 decision2=0;
          	int poon = 0;
          	 System.out.println("Enter Pin for account 5: ");
           	int newpin = kb.nextInt();
           	
           	 if(newpin != pin){
               	System.out.println("Sorry! Wrong pin.");
               	System.exit(0);
               }
               	  
           	
           	 if(newpin == pin){ 

              System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
             poon = kb.nextInt();
        
             if(poon == 1){     
          	   System.out.println("Enter the amount to be added:");
          	   double madd = kb.nextDouble();
          	   double newamount = madd + amount;
          	   
          	   list5.remove(0);
          	   list5.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                         + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                         + newamount + "\n");
          	   System.out.println("New Account Balance: " + newamount + ".");
          	   
          }   
             }
             
  		if(poon == 2){
     
  			  System.out.println("Enter the amount to be removed:");
         	   double mSub = kb.nextDouble();
         	   	if(mSub > amount){
         	   		System.out.println("Insufficient Funds.");
         	   		System.exit(0);
         	   	}
         	   
         	   double newamount = amount - mSub;
         	   	
         	   
         	   list5.remove(0);
         	   list5.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                        + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                        + newamount + "\n");
         	   System.out.println("New Account Balance: " + newamount + ".");
          	   
          	   
          	   
  		}}}
        
        
        
        
    

    
    private FileWriter FileWriter(File file2) {
		// TODO Auto-generated method stub
		return null;
	}







	public void bankAccount1(double amount, String firstname, String lastname,
            int pin, ArrayList list1, ArrayList list2, ArrayList list3,
            ArrayList list4, ArrayList list5, int decision4, int i, int decision)
    // Pass through the constructor
    {
        this.i1 = i;
        this.firstName = firstname;
        this.lastName = lastname;
        this.firstpin = pin;
        this.amountbalance = amount;
        this.decision2 = decision4;}
    // Loop through arrayList to find pin.

	



    public int getDecision4() {
        return decision2;
    }

    public String getName() {
        return firstName;
    }

    public String getName2() {
        return lastName;
    }

    public int getfirstPin() {
        return firstpin;
    }

    public int geti() {
        return i;
    }

    public double getAmount() {
        return amountbalance;
    }

    public void setName(String firstName) {
        firstName = firstName;
    }

}