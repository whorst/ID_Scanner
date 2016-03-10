
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class bankAccount {

	
	
	
    Scanner kb = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int firstpin;
    private int i;
    private int decision2;
    private int Decision5;

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    
    private double amountbalance;
    int decision1;
    
    File dates = new File("dates.txt");  //Import events.txt

   

    

    ArrayList<bankAccount> list1 = new ArrayList<bankAccount>(); // Array list
    ArrayList<bankAccount> list2 = new ArrayList<bankAccount>();
    ArrayList<bankAccount> list3 = new ArrayList<bankAccount>();
    ArrayList<bankAccount> list4 = new ArrayList<bankAccount>();
    ArrayList<bankAccount> list5 = new ArrayList<bankAccount>();
    private int i1,temp1;

    public bankAccount(double amount, String firstname, String lastname,
            int pin, ArrayList list1, ArrayList list2, ArrayList list3,
            ArrayList list4, ArrayList list5, int i,int temp, int decision, int decision4, int decision5, BufferedWriter bw,  BufferedWriter bw2) throws IOException
    // Pass through the constructor
    {
        this.i1 = i;
        this.firstName = firstname;
        this.lastName = lastname;
        this.firstpin = pin;
        this.amountbalance = amount;
        this.decision2 = decision4;
        this.temp1=temp;
        this.Decision5=decision5;
       
       
     //   while(j<=5){
        if (i1 == 1 ) {
            if(temp==0)
            {
            list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }

            System.out.println("in i1==1"+list1.toString());
            bw.write("\n"+list1 +" "+(dateFormat.format(date)));

        }

        if (i1 == 2) {
            if(temp==0)
            {

            list2.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println("in i1==2"+list2.toString());
            bw.write("\n"+list2 +" "+(dateFormat.format(date)));
        }

        if (i1 == 3) {
            if(temp==0)
            {

            list3.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println("in i1==3"+list3.toString());
            bw.write("\n"+list3 +" "+(dateFormat.format(date)));

        }
        if (i1 == 4) {
            if(temp==0)
            {

            list4.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println("in i1==4"+list4.toString());
            bw.write("\n"+list4 +" "+(dateFormat.format(date)));

        }
        if (i1 == 5) {
            if(temp==0)
            {

            list5.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                    + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                    + amount + "\n");
            }
            System.out.println("in i1==5"+list5.toString());
            bw.write("\n"+list5 +" "+(dateFormat.format(date)));

            

        }
        
        if(decision5==1){
        	int des = 0;
       	 System.out.println("Enter Pin for account 1: ");
       	 int newpin = kb.nextInt();
        
        	
        	 if(newpin != pin){
            	System.out.println("Sorry! Wrong pin.");
            	bw.close();
            	System.exit(0);
            }
            	  
        	
        	 if(newpin == pin){ 
               	 System.out.println(list1.toString());	

           System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
          des = kb.nextInt();
     
          if(des == 1){     
       	   System.out.println("Enter the amount to be added:");
       	   double madd = kb.nextDouble();
       	   double newamount = madd + amount;
       	   
       	   list1.remove(0);
       	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
       	bw.write("\n"+newamount +" "+(dateFormat.format(date)));
       	   
       }   
          }
          
		if(des == 2){
  
			  System.out.println("Enter the amount to be removed:");
      	   double mSub = kb.nextDouble();
      	   	if(mSub > amount){
      	   		System.out.println("Insufficient Funds.");
      	   		bw.close();
      	   		System.exit(0);
      	   	}
      	   
      	   double newamount = amount - mSub;
      	   	
      	   
      	   list1.remove(0);
      	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                     + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                     + newamount + "\n");
      	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       	   
       	   
          }
		
      }
        if(decision5==2){
        	int des = 0;
       	 System.out.println("Enter Pin for account 2: ");
        	int newpin = kb.nextInt();
        
        	
        	 if(newpin != pin){
            	System.out.println("Sorry! Wrong pin.");
            	bw.close();
            	System.exit(0);
            }
            	  
        	
        	 if(newpin == pin){ 
               	 System.out.println(list2.toString());	

           System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
          des = kb.nextInt();
     
          if(des == 1){     
       	   System.out.println("Enter the amount to be added:");
       	   double madd = kb.nextDouble();
       	   double newamount = madd + amount;

       	   
       	   list1.remove(0);
       	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       }   
          }
          
		if(des == 2){
  
			  System.out.println("Enter the amount to be removed:");
      	   double mSub = kb.nextDouble();
      	   	if(mSub > amount){
      	   		System.out.println("Insufficient Funds.");
      	   		bw.close();
      	   		System.exit(0);
      	   	}
      	   
      	   double newamount = amount - mSub;
      	   	
      	   
      	   list1.remove(0);
      	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                     + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                     + newamount + "\n");
      	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       	   
       	   
          }
		
      }
        if(decision5==3){
        	int des = 0;
       	 System.out.println("Enter Pin for account 3: ");
        	int newpin = kb.nextInt();
        
        	
        	 if(newpin != pin){
            	System.out.println("Sorry! Wrong pin.");
            	bw.close();
            	System.exit(0);
            }
            	  
        	
        	 if(newpin == pin){ 
               	 System.out.println(list3.toString());	

           System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
          des = kb.nextInt();
     
          if(des == 1){     
       	   System.out.println("Enter the amount to be added:");
       	   double madd = kb.nextDouble();
       	   double newamount = madd + amount;
       	   
       	   list1.remove(0);
       	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       }   
          }
          
		if(des == 2){
  
			  System.out.println("Enter the amount to be removed:");
      	   double mSub = kb.nextDouble();
      	   	if(mSub > amount){
      	   		System.out.println("Insufficient Funds.");
      	   		bw.close();
      	   		System.exit(0);
      	   	}
      	   
      	   double newamount = amount - mSub;
      	   	
      	   
      	   list1.remove(0);
      	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                     + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                     + newamount + "\n");
      	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       	   
       	   
          }
		
      }
        if(decision5==4){
        	int des = 0;
       	 System.out.println("Enter Pin for account 4: ");
        	int newpin = kb.nextInt();
        
        	
        	 if(newpin != pin){
            	System.out.println("Sorry! Wrong pin.");
            	bw.close();
            	System.exit(0);
            }
            	  
        	
        	 if(newpin == pin){ 
               	 System.out.println(list4.toString());	

           System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
          des = kb.nextInt();
     
          if(des == 1){     
       	   System.out.println("Enter the amount to be added:");
       	   double madd = kb.nextDouble();
       	   double newamount = madd + amount;
       	   
       	   list1.remove(0);
       	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       }   
          }
          
		if(des == 2){
  
			  System.out.println("Enter the amount to be removed:");
      	   double mSub = kb.nextDouble();
      	   	if(mSub > amount){
      	   		System.out.println("Insufficient Funds.");
      	   		bw.close();
      	   		System.exit(0);
      	   	}
      	   
      	   double newamount = amount - mSub;
      	   	
      	   
      	   list1.remove(0);
      	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                     + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                     + newamount + "\n");
      	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       	   
       	   
          }
	
      }
        if(decision5==5){
        	int des = 0;
       	 System.out.println("Enter Pin for account 5: ");
        	int newpin = kb.nextInt();
        
        	
        	 if(newpin != pin){
            	System.out.println("Sorry! Wrong pin.");
            	bw.close();
            	System.exit(0);
            }
            	  
        	
        	 if(newpin == pin){ 
               	 System.out.println(list5.toString());	

           System.out.println("Press one to Add funds." + "\n" + "Press two to Remove funds.");
          des = kb.nextInt();
     
          if(des == 1){     
       	   System.out.println("Enter the amount to be added:");
       	   double madd = kb.nextDouble();
       	   double newamount = madd + amount;
       	   
       	   list1.remove(0);
       	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                      + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                      + newamount + "\n");
       	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       }   
          }
          
		if(des == 2){
  
			  System.out.println("Enter the amount to be removed:");
      	   double mSub = kb.nextDouble();
      	   	if(mSub > amount){
      	   		System.out.println("Insufficient Funds.");
      	   		bw.close();
      	   		System.exit(0);
      	   	}
      	   
      	   double newamount = amount - mSub;
      	   	
      	   
      	   list1.remove(0);
      	   list1.add("\n" + "Bank Account " + i + "\n" + "Name: " + firstname
                     + " " + lastname + "\n" + "Pin: " + pin + "\n" + "Amount: "
                     + newamount + "\n");
      	   System.out.println("New Account Balance: " + newamount + ".");
         	bw.write("\n"+newamount +" "+(dateFormat.format(date)));

       	   
       	   
          }
	
      }
        if (decision5 == 6) {
        	
        	bw.close();
        	bw2.close();

        	System.exit(0);
}
        }
       
       
    

    
    public void bankAccount1(double amount, String firstname, String lastname,
            int pin, ArrayList list1, ArrayList list2, ArrayList list3,
            ArrayList list4, ArrayList list5, int i, int decision, int decision4)
    // Pass through the constructor
    {
        this.i1 = i;
        this.firstName = firstname;
        this.lastName = lastname;
        this.firstpin = pin;
        this.amountbalance = amount;
        this.decision2 = decision4;}
    // Loop through arrayList to find pin.




//
//    public int getDecision5() {
//        return Decision5;
//    }

    public int getDecision4() {
        return decision2;
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
