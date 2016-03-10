import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class alice {

	public static void main(String[] args) throws FileNotFoundException {

		
		
		PrintWriter output = new PrintWriter("wonder5.txt");
		File f0 = new File ("wonder1.txt");
		File f1 = new File ("wonder2.txt");
		File f2 = new File ("wonder3.txt");
		File f3 = new File ("wonder4.txt");
		processFile(f0, output);
		processFile(f1, output);
		processFile(f2, output);
		processFile(f3, output);
		
		output.close();
		
		
	}
		public static void processFile(File f0 ,PrintWriter output)throws FileNotFoundException{
			Scanner input = new Scanner(f0);
			while(input.hasNext()) {
				
				String part1 = input.nextLine();
				System.out.println(part1);
				output.print(part1);
				}
			
		
		}
}
	


