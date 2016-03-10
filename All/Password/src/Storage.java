import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

	static Scanner kb = new Scanner(System.in);
	private static Methods method;
	
	 ArrayList <String> AL = method.getAL();			//holds the answer for the security question
	 ArrayList <String> ques = method.getQues();		//holds the security questions
	 LinkedList<String> getDoubleL = method.getDoubleL();//holds the main account password and username
	
		

	public static void deleteAll(ArrayList<String> AL,
			LinkedList<String> doubleL, ArrayList<String> urls, ArrayList<String> password, ArrayList<String> username) {
		doubleL.clear();
		AL.clear();
		urls.clear();
		password.clear();
		username.clear();

		System.out.println(doubleL);
		System.out.println(AL);
		System.out.println(urls);
	}
	
	
	public static void Password(){
		
		String Password, Answer;
		
		ArrayList <String> AL = method.getAL();
		LinkedList <String> doubleL = method.getDoubleL();
		ArrayList<String> ques = method.getQues();
		
		System.out.println("Please enter your current password");
		Password=kb.next();
		
		if(Password.equals(doubleL.getLast())){
		
		System.out.println("Please answer the security question.");
		int i = (int) (Math.random()*2);
		
		
		System.out.println(ques.get(i));
		Answer = kb.next();

		if (Answer.equals(AL.get(i).trim())) {
			System.out.println("Correct");
			System.out.println("What would you like your new password to be?");
			doubleL.removeLast();
			Password = kb.next();
			doubleL.addLast(Password);
			System.out.println(doubleL);
			MenuScreen();

			/////This is where I ended	
			
			
		} else {
			System.out.println("Wrong"); // Add lockout here
			change();
		}

	}
	}
	
	public static int MenuScreen() {
	
		
		
		int decisions;
	 Scanner kb = new Scanner(System.in);

		System.out.println("___________________________________" + "\n");
		System.out.println("Press 1 to access your account.");
		System.out.println("Press 2 to make your account.");
		System.out.println("Press 3 to delete your account.");
		System.out.println("Press 4 to exit.");
		System.out.println("Press 5 if you've forgotten your username or password.");
		System.out.println("___________________________________");

		decisions = kb.nextInt();
		while(decisions!=1 && decisions!=2 && decisions!=3 && decisions!=4 && decisions!=5){
			MenuScreen();
		}

		Decision object1 = new Decision(decisions); // This is the object

		return decisions;
	}
	
	
	
	protected static void change() {
		int decisions;
		String Password, Answer;

		System.out.println("Would you like to change your (1) password or (2) username?");
		decisions = kb.nextInt();
		swap(decisions);

	}

	protected static void swap(int decisions) {
		ArrayList <String> ques = method.getQues();
		LinkedList<String> getDoubleL = method.getDoubleL();
		 ArrayList <String> AL = method.getAL();

		String Answer, Password, Username, newPassword, newUsername;

		switch (decisions) {

		case 1:
			System.out.println("Okay, you'll need to enter your current password.");

			Password = kb.next();

			if (Password.equals(getDoubleL.getLast())) {

				System.out.println("Please answer the security question.");
				int i = (int) (Math.random() * 2);

				
				System.out.println(ques.get(i));
				Answer = kb.next();

				if (Answer.equals(AL.get(i).trim())) {
					System.out.println("Correct");
					System.out.println("What would you like your new password to be?");
					getDoubleL.removeLast();
					Password = kb.next();
					
					while(Password.length()< 8 ){
						System.out.println("Please choose a username of at least 8 characters");
						Password = kb.next();}
					
					getDoubleL.addLast(Password);
					MenuScreen();

					// ///This is where I ended

					break;

				} else {
					System.out.println("Wrong"); // Add lockout here
					change();
				}

			}
		case 2:
			System.out.println("Okay, you'll need to enter your current username.");

			Username = kb.next();

			if (Username.equals(getDoubleL.getFirst())) {

				System.out.println("Please answer the security question.");
				int i = (int) (Math.random() * 2);

				System.out.println(ques.get((i)));
				Answer = kb.next();

				if (Answer.equals(AL.get(i).trim())) {
					System.out.println("Correct");
					System.out.println("What would you like your new username to be?");
					
					while(Username.length()< 8 ){
						System.out.println("Please choose a username of at least 8 characters");
						Username = kb.next();}
					
					getDoubleL.removeFirst();
					Username = kb.next();
					
					getDoubleL.addFirst(Username);
					MenuScreen();

					// ///This is where I ended

					break;

				} else {
					System.out.println("Wrong"); // Add lockout here
					change();
				}

			}

		}

	}

}
