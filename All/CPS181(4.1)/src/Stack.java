import java.util.LinkedList;

public class Stack {
	LinkedList<Character> st = new LinkedList<Character>(); // Container. It
															// holds our stack.
															// We'll right all
															// of our methods
															// for Stack.

	public Character pop() { // takes charcters off our list at top of the stack

		Character ch;
		ch = st.removeFirst();
		return (ch);

	}

	public void push(Character C) { // adds one to stack

		st.addFirst(C);
		return;
	}

	public Character top() { // gets us a charcter at the top without removing

		Character ch;
		ch = st.peek();
		return (ch);

	}

	public boolean ismt() {

		boolean retval = false;
		if (st.isEmpty()) {
			return true;// Returns true or false boolean
		}
		return (retval);

	}

	public boolean isfull() {

		boolean retval = false;

		return false; // checks to see if stack is full

	}

	public String toString() {
		String myString = "";

		for (int count = 0; count < st.size(); count++) {
			// System.out.println()
			myString = myString + st.get(count) + "\n ";
		}
		myString = myString + "\n";
		return myString;

	}

}