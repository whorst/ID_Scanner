import java.lang.Integer.*;
import java.util.Scanner;

public class competition {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int p = kb.nextInt();

		String t = Integer.toBinaryString(p);
		String f = new StringBuilder(t).reverse().toString();
		int f1 = Integer.parseInt(f, 2);
		System.out.println(f1);

	}

}
