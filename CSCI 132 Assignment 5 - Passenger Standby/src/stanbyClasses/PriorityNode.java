package stanbyClasses;

//import stanbyClasses.DoublyLinkedList.Node;

public class PriorityNode<T>{
	T data;
	int comparable;
	PriorityNode<T> next;
	PriorityNode<T> previous;
	
	
	
	public PriorityNode  (T newData, int priorityData){
		data = newData;
		comparable = priorityData;
	}
	
	
	
	public void setNext(PriorityNode<T> newNext){
		next = newNext;
	}
	public void setPrevious(PriorityNode<T> newPrevious){
		previous = newPrevious;
	}
	
	
	public T getData(){
		return data;
	}
	public PriorityNode<T> getNext(){
		return next;
	}
	public PriorityNode<T> getPrevious(){
		return previous;
	}
	
	public int getComparable(){
		return comparable;
	}
}