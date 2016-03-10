import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class reverseMain {

	public static void main(String[] args) throws FileNotFoundException {
		File Polish = new File("Polish.txt");
		File out = new File("outfile.txt");
		File finish = new File("Finish.txt");

		PrintWriter printWriter = new PrintWriter(finish);

		Scanner f = new Scanner(Polish);
		Queue inputQ = new Queue();
		Stack stack2 = new Stack();
		stack2.pop();
		Queue outputQ = new Queue();

		String word;
		Character ch;

		while (f.hasNext()) {
			String myString = f.nextLine();

			for (int count = 0; count < myString.length(); count++) {
				ch = myString.charAt(count);
				inputQ.addtoRear(ch);
			}
			while (!inputQ.ismtQ()) {
				ch = inputQ.remfront();

				if (isAlpha(ch)) {
					// System.out.println(ch);
					outputQ.addtoRear(ch);
				} else {
					if (isOperator(ch)) {

						if (stack2.ismt()) {
							stack2.push(ch);

						} else {
							if (valueOf(ch) > valueOf(stack2.top())) {
								stack2.push(ch);
							} else {
								outputQ.addtoRear(stack2.pop());
								stack2.push(ch);
							}
						}
					}
				}
			}
			while (!stack2.ismt()) {
				outputQ.addtoRear(stack2.pop());
			}
			System.out.println(outputQ.toString() + "\n\n");

			printWriter.println(outputQ.toString() + "\n\n");

			while (!outputQ.ismtQ()) {
				outputQ.remfront();
			}

		}
		printWriter.close();
	}

	public static boolean isAlpha(Character ch) {
		boolean retVal = false;
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
			retVal = true;

		return (retVal);
	}

	public static boolean isOperator(Character ch) {
		boolean retVal = false;
		if (ch == '+' || ch == '-' || ch == '/' || ch == '*')
			retVal = true;

		return (retVal);
	}

	public static int valueOf(Character ch) {
		int retval = 0;
		if (ch == '/' || ch == '*')
			retval = 2;
		else
			retval = 1;
		return retval;
	}

}
