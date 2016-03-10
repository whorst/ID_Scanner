
public class MyLinkedList<T> {

	private class Node<T>{
		T value;
		Node<T> next;
		
		Node(T e){
			value = e;
			next = null;
		}
	}
	
}
