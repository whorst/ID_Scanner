import java.util.Scanner;


public class Magic8 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	

	
	System.out.println("PLease enter a question.");
	String question = input.next();
	

		
		
  while(!question.equals("q")) {	
	  
	  if(question.endsWith("?")){
		  int number =1 +  (int)(Math.random()*(8));
		  
		  switch (number){
		  case 1 : System.out.println("Outlook good.");
		  			break;
		  case 2 : System.out.println("Don’t  count  on  it.");
		  			break;
		  case 3 : System.out.println("Yes.");
		  			break;
		  case 4 : System.out.println("Maybe.");
		  			break;
		  case 5 : System.out.println("Definitely  not.");
		  			break;
		  case 6 : System.out.println("Highly  likely.");
		  			break;		
		  case 7 : System.out.println("Why  not?");
		  			break;
		  case 8 : System.out.println("I better not tell you.");
		  			break;
		  }
	  }
	}
	}
	
	
	

}
