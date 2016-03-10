import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;;

public class Methods extends Storage {
	
	
	
	static Scanner kb = new Scanner(System.in);
	
	static LinkedList<String> doubleL = new LinkedList<String>();
	static ArrayList<String> AL = new ArrayList<String>(); // I dont know // EXACTLY what
	static ArrayList<String> ques = new ArrayList<String>();
	
	static ArrayList<String> urls = new ArrayList<String>();
	static ArrayList<String> password = new ArrayList<String>();
	static ArrayList<String> username = new ArrayList<String>();
	
	
	

	

	public static void securityCode() {
		
		
		
		//System.out.println(URLs3.toString());
		
		Scanner kb = new Scanner(System.in);
		
		String answer,one,two,three;
		one = "What is your mom's maiden name?";
		two = "What city did you grow up in?";
		three = "What is your favorite Website?";
		
		System.out.println("\n"	+ "Please enter in an answer for each of the following questions"+ "\n");

		System.out.println("1) What is your mom's maiden name?");
		ques.add("1) "+one);
		answer = kb.next();
		AL.add(answer);
		// I created a second add method. I should change that.

		System.out.println("\n" + "2) What city did you grow up in?");
		ques.add("\n"+"2) "+two);
		answer = kb.next();
		AL.add("\n"+answer);

		System.out.println("\n" + "3) What is your favorite Website?");
		ques.add("\n"+"3) "+three);
		answer = kb.next();
		AL.add("\n"+answer);
		
//		System.out.println(ques);
//		System.out.println(AL);
	}

	
	public static void URLs() {

		String URL, Password, User, Username2, Password2;
		Scanner kb = new Scanner(System.in);
		
		
		
		System.out.println("Please type in your current username and password to perform this operation."+ "\n");

		System.out.println("Enter your username:");

		User = kb.next();
		
		
	try{
		
		if (User.equals(doubleL.getFirst())) {
			System.out.println("Your usernamme is good. Now enter your password");
		} else {
			System.out.println("That was wrong. Returning to menu screen");
			MenuScreen();
		}

		Password2 = kb.next();
		if (Password2.equals(doubleL.getLast())) {
			System.out.println("Your password is good. Continuing along...");
		} else {
			System.out.println("That was wrong. Returning to menu screen");
			MenuScreen();
		}

		System.out.println();
		
		Menu2();
		
	}catch(NoSuchElementException e){
		System.out.println("You do not have an account. Please create one.");
		MenuScreen();
	}
		

	}


	static int i = 1;
	protected static void URLs2() {
		
		String URL = " ", Password = " ", User = " ", Username2, Password2;
		int decisions = 0;
		
		
		
			while (true) {
			
			System.out.println("Type in the URL or subject you'd like to add to your account.");
			System.out.println("Press z if you'd like to exit.");
			URL = kb.next();

			if (URL.equalsIgnoreCase("Z")) {
				Menu2();
			}

			System.out.println("\n" + "Now type the username for that account.");
			User = kb.next();
			if (User.equalsIgnoreCase("Z")) {
				Menu2();
			}

			System.out.println("\n"+ "Now type in the password for that account.");
			Password = kb.next();

			if (Password.equalsIgnoreCase("z")) {

				Menu2();
			}

			
			
			urls.add(URL);  
			username.add(User);
			password.add(Password);
			
			System.out.println("The url is: " + URL);
			System.out.println("The username is: " + User);
			System.out.println("The password is: " + Password);

			System.out.println("\n"+"If you'd like to continue adding URL's, press 1."+ "\n"+ "If you'd like to go back to the menu screen, press 2.");
			decisions = kb.nextInt();
			
				if (decisions == 1) {
					URLs2();
				}
				if (decisions == 2) {
					Menu2();

				} else {

					Menu2();
				}

		
		}
	}

	protected static void create() {
		String password, password2, username;
		int counter;
		System.out.println("\n"+ "What would you like your new username to be?");
		username = kb.next();
		//while(username.length()< 8 ){
//		while(!username.contains(0x0041)){
//			System.out.println("Please choose a username of at least 8 characters");
//			username = kb.next();}
		
		System.out.println("\n" + "What would you like your new Pasword to be?");
		password = kb.next();
		while(password.length()< 8 ){
			System.out.println("Please choose a password of at least 8 characters");
			password = kb.next();}
		containPass(password);
		
		while(username.equals(password)){
			System.out.println("Your username  can not be the same as your password. Please try again");
			password = kb.next();
			containPass(password);
		}

		for (counter = 0; counter < 3;) {
			System.out.println("\n"+ "Please enter your CASE SENSITIVE password again (Just to be safe for you know...reasons.)");
			password2 = kb.next();
			if (!password2.equals(password)) {
				if (counter == 0) {
					System.out.println("WARNING: PASSWORD INVALID ASSHOLE YOU HAVE "+ (2 - counter) + " MORE TRIES");
				}
				if (counter == 1) {
					System.out.println("WARNING: PASSWORD INVALID ASSHOLE YOU HAVE 1 MORE TRY");
				}
				if (counter == 2) {
					System.out.println("WARNING: PASSWORD INVALID ASSHOLE YOU HAVE NO MORE TRIES."+ "\n"+ "I WOULD TELL YOU TO CONTACT YOUR ADMINISTRATOR, BUT YOU'D FUCK THAT UP TOO!");
					create();
				}
				counter++;
			} else {
				System.out.println("Password and username being added to your account...bitch");

				doubleL.add(username);
				doubleL.add(password);

				counter = 3;

				securityCode(); // Invokes the Security Code method
				System.out.println("You have now created your account. Returning to the main menu...");
				MenuScreen();
			}
		}

	}
	protected static void delete(){
		String decision7;
		
		System.out.println("Are you sure you'd like to delete your current account?"+"\n" + "Doing so will get rid of all passwords, security questions, and saved URL's"+"\n");
		System.out.println("Press y for yes and n for no.");
		
		decision7 = kb.next();

		switch (decision7) {

		case "y":
			System.out.println("Deleting...");
			
			 deleteAll(AL, doubleL, urls, password, username);
			 
			MenuScreen();
			
			break;

		case "n":
			System.out.println("No selected. Returning to main menu");
			MenuScreen();
			break;
		}
		if (decision7 != "y" || decision7 != "n") {
			System.out.println(decision7 + " was not an option. Try again");
			delete();
		}

	}
	protected static void URLedit() {
		int i, decision; 
		String newURL, newPassword, newUsername;
	
		if (urls.isEmpty()){
			System.out.println("You have no URLs to edit. Returning to main menu.");
			MenuScreen();
		}else{
			System.out.println("Which of your URLs would you like to edit?" + "\n");
			printURL();
			
			i = kb.nextInt();
		
			System.out.println("Your URL is "+ urls.get(i -1) + "\n");
			System.out.println("Your username is "+ username.get(i -1) + "\n");
			System.out.println("Your password is "+ password.get(i -1) + "\n");
			
			System.out.println("Press 1 to edit your URL.");
			System.out.println("Press 2 to edit your username.");
			System.out.println("Press 3 to edit the password.");
			System.out.println("Press 4 to delete your entry.");
			System.out.println("Press 5 to exit.");
			
			decision=kb.nextInt();
			while(decision!=1 || decision!=2 || decision!=3 || decision!=4 || decision!=5){
				URLedit();
			}
			
			switch(decision){
			case 1:
				System.out.println("What would you like your new URL to be?");
				newURL=kb.next();
				urls.remove(i-1);
				urls.add(i-1, newURL);
				System.out.print(urls.toString());
				URLedit();
			case 2:
				System.out.println("What would you like your new username to be?");
				newUsername=kb.next();
				username.remove(i-1);
				username.add(i-1, newUsername);
				System.out.print(username.toString());
				URLedit();
			case 3:
				System.out.println("What would you like your new password to be?");
				newUsername=kb.next();
				password.remove(i-1);
				password.add(i-1, newUsername);
				System.out.print(password.toString());
				URLedit();
			case 4:
				System.out.println("Deleting...");
				urls.remove(i-1);
				username.remove(i-1);
				password.remove(i-1);
				URLedit();
			case 5:	
				Menu2();
			}
		}
		
	}
	

	protected static void forgot(){
	
		
		int decisions = 0;
		
		System.out.println("Have you forgotten your (1)username or (2)password?");
	try{
		decisions= kb.nextInt();
	}catch(InputMismatchException e){
		System.out.println("Wrong");
		}
	
		swap2(decisions);
	}
	
	
		
	
	private static void swap2(int decisions) {
		String Answer, Password, Username, newPassword, newUsername;

		switch (decisions) {

		case 1:
			System.out.println("Okay, you'll need to enter your current password.");

			Password = kb.next();

			if (Password.equals(doubleL.getLast())) {

				System.out.println("Please answer the security question.");
				int i = (int) (Math.random() * 2);

				
				System.out.println(ques.get(i));
				Answer = kb.next();

				if (Answer.equals(AL.get(i).trim())) {
					System.out.println("Correct");
					System.out.println("What would you like your new username to be?");
					doubleL.removeFirst();
					Username = kb.next();
					doubleL.removeFirst();
					doubleL.addFirst(Username);
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

			if (Username.equals(doubleL.getFirst())) {

				System.out.println("Please answer the security question.");
				int i = (int) (Math.random() * 2);

				System.out.println(ques.get((i)));
				Answer = kb.next();

				if (Answer.equals(AL.get(i).trim())) {
					System.out.println("Correct");
					System.out.println("What would you like your new password to be?");
					Password = kb.next();
					containPass2(Password);
					doubleL.removeLast();
					doubleL.addLast(Password);
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
		
	


	public static void Menu2(){
		System.out.println("What would you like to do with your account?");
				
				System.out.println("___________________________________" + "\n");
				System.out.println("Press 1 to add URLs to your account.");
				System.out.println("Press 2 to print your URLs.");
				System.out.println("Press 3 to edit your username or password.");
				System.out.println("Press 4 to edit your URLs.");
				System.out.println("Press 5 to exit.");
				System.out.println("___________________________________");
				
				int decisions = kb.nextInt();
				
				switch(decisions){
				
				case 1:
					URLs2();
					break;
				case 2:
					printAll();
				case 3:
					change();
					break;
				case 4:
					URLedit();
					break;
				case 5:
					MenuScreen();
					break;	
				}
			}
	
	
	public static void printAll() {
		try{
		for(int i = 0; i < urls.size(); i++){
			System.out.println("Your URL is: " + urls.get(i));
			System.out.println("Your username is: " + username.get(i));
			System.out.println("Your password is: " + password.get(i)+"\n");
		}
		}catch(IndexOutOfBoundsException e){
			System.out.println("You don't have any URLs yet. Please add some");
		}
			Menu2();
	}
	
	
	public static void printURL(){
		for(int i = 0; i < urls.size(); i++){
			System.out.println(i+1+") " + urls.get(i));
		}
	}
	
	public static void containPass(String password){
		char[] text;
		boolean retval;
		int i;
		
		 text= password.toCharArray();
		boolean actual = containsChar(text);
			if (actual==false){
				System.out.println("Your Password should contain one uppercase letter and one number.");
				create();
			}
		boolean actual2 = containsNum(text);
			if (actual2==false){
				System.out.println("Your Password should contain one number.");
				create();
			}	}

	public static void containPass2(String password) {
		char[] text;
		boolean retval;
		int i;
		text = password.toCharArray();
		boolean actual = containsChar(text);
		if (actual == false) {
			System.out.println("Your Password should contain one uppercase letter and one number.");
			forgot();
		}
		boolean actual2 = containsNum(text);
		if (actual2 == false) {
			System.out.println("Your Password should contain one number.");
			forgot();
		}			
		
//		if(str.contentEquals('\u0041')){
//			System.out.println("Right");
//		}else{
//			System.out.println("Wrong");
//		}
//		
//		for (i = 0; i < password.length(); i++) {
//			char text = password.charAt(i);
//			if (text < '\u0041' || text > '\u005A') {
//				retval = false;
//			} else {
//				retval = true;
//			}
		//	switch(retval)
//		}
		
		
		
		return;
	}
	
	public static boolean containsChar(char [] text) {
		boolean retval = false;
		for(int i=0; i< text.length; i++){
			if (text[i] < '\u0041' || text[i] > '\u005A') {
				retval = false;
			} else {
				retval = true;
				break;
			}
		}
		return retval;
	}
	
	public static boolean containsNum(char [] text) {
		boolean retval = false;
		for(int i=0; i< text.length; i++){
			if (text[i] < '\u0030' || text[i] > '\u0039') {
				retval = false;
			} else {
				retval = true;
				break;
			}
		}
		return retval;
	}
	
	
	public static LinkedList<String> getDoubleL() {
		return doubleL;
	}

	public static ArrayList<String> getAL() {
		return AL;
	}

	public static ArrayList<String> getUrls() {
		return urls;
	}

	public static ArrayList<String> getUsername() {
		return username;
	}
	public static ArrayList<String> getPassowrd() {
		return password;
	}
	public static ArrayList<String> getQues() {
		return ques;
	}

}