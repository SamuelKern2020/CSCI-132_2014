package airlineBoarding;



public class GenericQueue <T> {

	LinkedList<T> myList = new LinkedList<T>();
	
	public void enqueue(T newElement){
		myList.addELementToQueue(newElement);
	}
	
	
	public T dequeue(){
		return myList.subtractElement();
	}
	

	public boolean isEmpty(){
		return myList.noObjects();
	}
	
	public String getALlInfo(){
		return "asdf";
	}
	
}
