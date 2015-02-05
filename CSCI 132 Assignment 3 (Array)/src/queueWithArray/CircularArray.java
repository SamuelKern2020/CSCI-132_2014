package queueWithArray;

public class CircularArray <T>{

	T[] array;
	
	private int frontElement = 0;	//Keeps track of the next element in queue
	private int nextEmptyIndex = 0;	//Keeps track of next available free index in array
	private int currentSize = 0;	//Keeps track of the number of elements inserted into array
	
	public CircularArray (int capacity){		//Creates new generic instance of array with size "capacity"
		array = (T[])new Object[capacity];
	}
	
	public void addELement(T newElement) throws IllegalStateException{	//Adds element to the next available index
		if(array.length == currentSize){
			throw new IllegalStateException("Queue is full");
		}
		else{
			array[nextEmptyIndex] = newElement;
			nextEmptyIndex=(nextEmptyIndex+1)%10;
			currentSize++;
		}
	}
	
	
	public T subtractElement(){	//Removes most current element from array
		T value = array[frontElement];
		array[frontElement] = null;
		frontElement=(frontElement+1)%10;
		currentSize--;
		return value;
		
	}
	
	
	
	public boolean noObjects(){
		return (currentSize == 0);
	}
	
}

