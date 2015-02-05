package airlineBoarding;

//import queueWithLinkedList.Node;

public class PriorityQueue<T> {
	
	DoublyLinkedList<T> myList = new DoublyLinkedList<T>();
	
	public PriorityQueue(){
		
	}
	
	public void enqueue(T newElement, int comparable){
		
		myList.addElement(newElement, comparable);
		
	}
	
	public T dequeue(){
		return myList.subtractElement();
	}
	
	
	public boolean isEmpty(){
		return myList.isEmpty();
	}
	
	
}
