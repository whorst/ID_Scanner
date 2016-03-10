import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class Main {
	public static void main(String[] args) throws IOException {

		Scanner Sc = new Scanner(System.in);
		File f1 = new File("nameswithbirthdays.txt");
		Scanner input = new Scanner(f1);
		

		BinaryTree theTree = new BinaryTree();		

				while (input.hasNext()){
					String fName = input.next().trim();
					String lName = input.next().trim();
					String date = input.next().trim();			
					theTree.insertNode(new Node(fName, lName, date));
					
					
					 
				}
		

	
	theTree.search("Al");	
	theTree.search("Ben");

	theTree.printPostorder();
	
	
	
		
	}

}
