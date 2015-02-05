package queueWithArray;



public class GenericQueue <T> {

	int sizeOfArray = 10;	//Sets the size of the array
	CircularArray<T> myArrayQueue = new CircularArray<T>(sizeOfArray);
	
	public void enqueue(T newElement){
		myArrayQueue.addELement(newElement);
	}
	
	
	public T dequeue(){
		return myArrayQueue.subtractElement();
	}
	

	public boolean isEmpty(){
		return myArrayQueue.noObjects();
	}
	
	public String getALlInfo(){
		return "asdf";
	}
	
}
