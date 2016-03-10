//Graph.java
// CPS 240
// Will Horst
// This program uses an adjacency list to print out connected points in a graph

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;



public class Graph {

	
	
	static Map<Integer, List<Integer>> adjListMap = new HashMap<Integer, List<Integer>>();

	//Create a node class. The indivivual nodes will hold our values
	static class Node {
		public int label;
		public boolean visited = false;

		//The label is the integer value held by the node
		public Node(int i) {
			this.label = i;
		}
	}
	

	
	//The root node is the node that's first looked at.
	public Node rootNode;
	//A list for holding nodes.
	public List<Node> nodesList = new ArrayList<Node>();
	int size;

	//SetRootNode allows us to declare a root node
	public void setRootNode(Node n) {
		rootNode = n;
	}

	//Return the value of the root node
	public Node getRootNode() {
		return rootNode;
	}

	//Add a node to the nodeList ArrayList
	public void addNode(Node n) {
		nodesList.add(n);
	}

	// This method will be called to make connect two nodesList
	public void connectNode(Node src, Node dst) {

		int source = src.label;
		int dist = dst.label;

		// make sure src key is in adj list
		// if it is, add dst to the ArrayList key
		// if not, then add the key to the map, the valuse of src are a locally declared ArrayList
		// Then add the dst to the list

		if (adjListMap.containsKey(source)) {
			adjListMap.get(source).add(dist);
		} else {
			adjListMap.put(source, new ArrayList<Integer>());
			adjListMap.get(source).add(dist);
		}

		if (adjListMap.containsKey(dist)) {
			adjListMap.get(dist).add(source);
		} else {
			adjListMap.put(dist, new ArrayList<Integer>());
			adjListMap.get(dist).add(source);
		}
	}


	// BFS traversal: iterative version
	public void bfs() {
		// BFS uses a Queue data structure
		Queue<Node> q = new LinkedList<Node>();
		
		//Add the root node to queue
		q.add(rootNode);
		
		//Print the root node
		printNode(rootNode);
		//Declare root node as visited, because we've already visited it
		rootNode.visited = true;
		//While the queue contains something
		while (!q.isEmpty()) {
			//n is equal to the root node. .remove gets rid of and returns the first element
			Node n = q.remove();
			//The child node is null
			Node child = null;
			//While the child node equals the node that was passed through the method
			while ((child = getUnvisitedChildNode(n)) != null) {
				//set the child to visited
				child.visited = true;
				printNode(child);
				//Add it to the queue
				q.add(child);
			
			}
			
		}

	}
	
	// DFS traversal: iterative version
	public void dfs() {
		ArrayList AL = new ArrayList();
		// DFS uses a Stack data structure
		Stack<Node> s = new Stack<Node>();
		s.push(rootNode);
		rootNode.visited = true;
		printNode(rootNode);
		while (!s.isEmpty()) {
			Node n = s.peek();


			Node child = getUnvisitedChildNode(n);

			if (child != null) {
				child.visited = true;
				printNode(child);
				AL.add(child.label);
				s.push(child);
			} else
				s.pop();
		}
	
	}
	private Node getUnvisitedChildNode(Node n) {
		//Declare a pointer at the specified node
		int pointer = nodesList.indexOf(n);
		//Loop through adjlist
		for (int i = 0; i < adjListMap.get(pointer).size(); i++)
			//If the pointer within the nodes list has not yet been visited
			if (nodesList.get(adjListMap.get(pointer).get(i)).visited == false)
				//Then return the specific node
				return nodesList.get(adjListMap.get(pointer).get(i));
		return null;
	}


	// Utility methods for clearing visited property of node
	private void reset() {
		for (Node n : nodesList)
			n.visited = false;
	}

	// Utility methods for printing the node's label
	private void printNode(Node n) {
		System.out.print(n.label + " ");
	}



	public static void main(String[] args) {
		
	    String directoryFile = "C:/users/willy/desktop/Steam.lnk";

		
        try {
        	Desktop.getDesktop().open(new File(directoryFile));		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// Lets create nodes as given as an example in the article
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);


		// Create the graph, add nodes, create edges between nodes
		Graph g = new Graph();
		g.addNode(n0);
		g.addNode(n1);
		g.addNode(n2);
		g.addNode(n3);
		g.addNode(n4);
		g.addNode(n5);
		g.addNode(n6);
		g.addNode(n7);
		g.addNode(n8);
		g.addNode(n9);
		g.setRootNode(n0);

		g.connectNode(n0,n3);
		g.connectNode(n0, n8);
		g.connectNode(n0, n5);
		g.connectNode(n3, n6);
		g.connectNode(n6, n7);
		g.connectNode(n7, n2);
		g.connectNode(n2, n4);
		g.connectNode(n2, n5);
		g.connectNode(n4, n9);
		g.connectNode(n5, n8);
		g.connectNode(n8, n1);

	//	System.out.println(adjList);

		// Perform the DFS and BFS traversal of the graph
		System.out.print("DFS Traversal (Iterative):    ");
		g.dfs();
		g.reset();

		
		
		System.out.print("\nBFS Traversal (Iterative):   ");
		g.bfs();
		g.reset();
	}
}