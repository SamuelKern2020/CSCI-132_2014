package queueWithLinkedList;

public class LinkedList <T>{

	private Node<T> first = null;
	private Node<T> last = null;
	
	
	public void addELementToQueue(T newElement){	//Adds element to end of linked list 
		Node<T> newNode = new Node<T>();
		newNode.setData(newElement);
		if(noObjects()){
			first=newNode;
			last = first;
		}
		else{
			last.setNext(newNode);
			last = newNode;
		}
		
	}
	
	public void addELementToStack(T newElement){	//Adds element to beginning of linked list 
		Node<T> newNode = new Node<T>();
		newNode.data = newElement;
//		Node<T> oldFirst = first;
//		first = newNode;
		if(last == null){
			last = first;
		}
		else{
			newNode.setNext(first);
			first = newNode;
		}
		
	}
	public T subtractElement(){	//Removes first element
//		T returnValue = first.getData();
//		first = first.getNext();
//		return returnValue;
		
		Node<T> oldFirst = first;		//Assigns temporary variable
		first = first.getNext();	//Reassigns "first" to the next element
		return oldFirst.getData();
	}
	
	
	
	public boolean noObjects(){
		return (first == null);
	}
	
}

