import javax.xml.soap.Node;



public class NodesNPointers {
	private String name;
	private int age;
	private Node next;

	
	public NodesNPointers(String string) {
		// TODO Auto-generated constructor stub
	}

	public NodesNPointers() {
		// TODO Auto-generated constructor stub
	}

	public NodesNPointers(String name, int age) {
		this.name=name;
		this.age=age;
		next=null;
		
	}

	class Node{    //create a class called node
		String name;
		Node next;   //One can take this node and link it to another node.
		
		public Node (String name) {
			this.name=name;     //in this thing I am constructing, the name part is going to be equal 
				age = 68;				//to the name I just passed in
			next=null;
			
		}
		
		public Node(String name, Node next){
			this.name=name;
			this.next=next;
		}
	
		public String toString(){
			
			return(" the name is "+ this.name+ " his age is"+ age );
		}
	
	}
	}

