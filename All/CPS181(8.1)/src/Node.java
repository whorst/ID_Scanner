public class Node {

	int key;
	String name;
	String lastName;
	String birthday;

	Node leftChild;
	Node rightChild;

	public Node(String name, String lastName, String birthday) {
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;

		leftChild = null;
		rightChild = null;

	
	}

	public String searchNode(String value, int counter) {

		if (value.equals(this.name)) {

			counter++;
			System.out.println(counter + " Comparison(s) has/have been made");

			System.out.println(value + " Has been found" + "\n");
		} else {
			if (name.compareTo(value) > 0) {
				if (leftChild == null) {
					counter++;

					System.out.println(value + " Doesn't exist");
				} else {
					counter++;
					return leftChild.searchNode(value, counter);
				}

			}

		}
		if (name.compareTo(value) < 0) {

			if (rightChild == null) {
				counter++;

				System.out.println(value + " Doesn't exist");
			} else {
				counter++;

				return rightChild.searchNode(value, counter);

			}

		}

		return "false";
	}

	public String toString() {

		return birthday + " " + lastName + " " + name;

	}

}
// if (value.equals(this.name)) {
// System.out.println(value+ " Has been found");
// // System.out.println("You found it you dirty little mug");
//
// } else if (name.compareTo(value) > 0) {
// if (leftChild == null)
// System.out.println(value+ " Doesn't exist");
// else
// return leftChild.searchNode(value);
//
// } else if (name.compareTo(value) < 0) {
//
// if (rightChild == null)
// System.out.println(value+ " Doesn't exist");
//
// else
//
// return rightChild.searchNode(value);
//
// }
// return "false";
// }

