
public class BinaryTree {
	
	Node root;
	Node newNode;
	
	
	public void addNode(int key, String name){
		
		newNode= new Node(key,name);
		
		if(root == null){
			
			root = newNode;
			
		}else{ 
			Node focusNode = root;
			
			Node parent;
			while (true){
				
				parent  = focusNode;
				
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					
					if(focusNode == null){
						
						parent.leftChild = newNode;
						
						return;
						
					}
				}else{
					
					focusNode = focusNode.rightChild;
					
					if(focusNode == null){
						
						parent.rightChild = newNode;
						return;
						
					}
					
				}
				
			}
			
		}
	}

	public void inOrderTraverseTree(Node focusNode){
	
		if(focusNode != null){
			
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(7, "seven");
		theTree.addNode(6, "six");
		theTree.addNode(5, "five");
		theTree.addNode(4, "four");
		theTree.addNode(3, "three");
		theTree.addNode(2, "two");
		theTree.addNode(1, "one");

		theTree.inOrderTraverseTree(theTree.root);

	}

}

class Node{
	
	int key;
	String name;
//	String lastName;
//	String birthday;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String Name){
		
		
		this.key=key;
		this.name=Name;
	
	}
//	public Node(String name, String lastName, String birthday){
//		this.name=name;
//		this.lastName=lastName;
//		this.birthday=birthday;
		
//	}
	
	public String toString(){
	
		return name + " Has a key " + key; 
	}
}
