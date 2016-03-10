import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryTree {

	Node root;
	Node newNode;

	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(Node n) {
		root = n;
	}
	
	public void insertNode(Node node) {
		Node currentNode = root;
		boolean inserted = false;
		
		if (root == null) {
			root = node;
			inserted = !inserted;
		}
		
		while (!inserted) {
			if (currentNode.name.compareTo(node.name) > 0) {
				if (currentNode.leftChild == null) {			///If there's an empty space, the node will go there
					currentNode.leftChild = node;
					inserted = !inserted;
				} else {
					currentNode = currentNode.leftChild; //else it's not empty, the node will go to 
				}										//the left of the left child and run search again
			}
			else {
				if (currentNode.rightChild == null) {
				 	currentNode.rightChild = node;
				 	inserted = !inserted;
				} else {
					currentNode = currentNode.rightChild;
				}
			}
			
		}
	}




	/**
	 * Printing the contents of the tree in a Postorder way.
	 */
	public void printPostorder() {
		printPostOrderRec(root);
		System.out.println("");

	}

	/**
	 * Helper method to recursively print the contents in a Postorder way
	 */
	private void printPostOrderRec(Node currRoot) {
		
		
		if (currRoot == null) {
			return;
		}
		printPostOrderRec(currRoot.leftChild);
		System.out.print(currRoot +  "\n" + "\n");
		printPostOrderRec(currRoot.rightChild);

	}

	public String search(String value) {
		if (root == null) {
			return "false";
		} else {
			int counter= 0;
			return root.searchNode(value,counter);
		
		}
	}

}
                                                                       