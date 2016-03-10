import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class TestExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File ("Age.txt");
		Scanner sc = new Scanner(System.in);
	
	
			
			try {
			int age = sc.nextInt();
			
			if (age < 0 || age > 150) {
					throw new InvalidAgeException("Nice try");
					
			}} catch (InvalidAgeException e) {
						System.out.println("Good try");
						e.printStackTrace();
					
					}
			}
	}
	


class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg){
		super (msg);
	}
	public String toString(){
		return "Invalid Age: " + super.toString();
	}
	
}