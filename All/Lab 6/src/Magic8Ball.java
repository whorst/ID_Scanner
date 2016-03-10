import java.util.Scanner;

//	   Authors:	   Patrick	   Seeling	   
public class Magic8Ball {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a1, a2, a3, b1, b2, b3, c1, c2, c3;
		while (true) {
			System.out
					.println("What	   is	   your	   question?	   ('q'	   to	   quit)");
			String question = in.nextLine();

			if ((question.length() == 1) && question.charAt(0) == 'q')
				break;

			if (!question.endsWith("?")) {
				System.out.println("That	   was	   not	   a	   question.");
				continue;
			} else {
				int number = (int) (Math.random() * 8);

				switch (number) {
				case 1:
					a2 = "O";
					break;
				case 2:
					a1 = "O";
					break;
				case 3:
					b1 = "O";
					break;
				case 4:
					b2 = "O";
					break;
				case 5:
					b3 = "O";
					break;
				case 6:
					c1 = "O";
					break;
				case 7:
					c2 = "O";
					break;
				default:
					c3 = "O";
					break;

				}
			}
		}
	}
}System.out.println(number);
