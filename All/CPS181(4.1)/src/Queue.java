import java.util.LinkedList;

public class Queue {
	LinkedList<Character> que = new LinkedList<Character>(); // Container. It
																// holds our
																// stack. We'll
																// right all of
																// our methods
																// for Stack.

	public Character remfront() { // takes charcters off our list at top of the
									// stack

		Character ch;
		ch = que.removeFirst();
		return (ch);

	}

	public void addtoRear(Character C) { // adds one to stack

		que.addLast(C);
		return;
	}

	public Character front() { // gets us a charcter at the top without removing

		Character ch;
		ch = que.peek();
		return (ch);

	}

	public boolean ismtQ() {

		boolean retval = false;
		if (que.isEmpty()) {
			return true;// Returns true or false boolean
		}
		return (retval);

	}

	public boolean isfullQ() {

		boolean retval = false;

		return false; // checks to see if stack is full

	}

	public String toString() {

		String myString = "";

		for (int count = 0; count < que.size(); count++) {
			// System.out.println()
			myString = myString + que.get(count) + " ";
		}
		myString = myString + "\n";
		return myString;
	}
}
