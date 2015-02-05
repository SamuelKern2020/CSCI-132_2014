package airlineBoarding;

public class Node <T> {
	
	T data;
	Node<T> next;
	
//	public Node  (T newData, Node newNext){
//		data = newData;
//		next = newNext;
//	}
	public Node() {
		// TODO Auto-generated constructor stub
	}

	
	public void setData(T newData){
		data = newData;
	}
	public void setNext(Node<T> newNext){
		next = newNext;
	}
	
	
	public T getData(){
		return data;
	}

	public Node<T> getNext(){
		return next;
	}
}
