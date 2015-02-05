package stanbyClasses;




public class DoublyLinkedList<T> {
	
		PriorityNode<T> first;
		PriorityNode<T> last;
	
	
	
	public void addElement(T newElement, int comparable){
		PriorityNode<T> newNode = new PriorityNode<T>(newElement, comparable);
		
		if (isEmpty()){
			first = newNode;
			last = newNode;
			first.setNext(null);
			first.setPrevious(null);
		}
		
		else {
			PriorityNode<T> currentNode = first;
			boolean foundLocation = false;
			
			//If the new node has a smaller comparable than the first element, set to be the FIRST NODE:
			if(newNode.getComparable() < first.getComparable()){
				newNode.setNext(first);
				first.setPrevious(newNode);
				newNode.setPrevious(null);
				first = newNode;
				foundLocation = true;
			}
			
			//Otherwise, iterate through queue to find the right location:
			while(!foundLocation){
				if(newNode.getComparable() >= currentNode.getComparable()){		
					//Checks to see if currentNode is the last node of the queue	
					if(currentNode != last){
							currentNode = currentNode.getNext();
						}
					
					//If it is, the currentNode is set to be the LAST NODE:	
					else{
							currentNode.setNext(newNode);
							last = newNode;
							newNode.setPrevious(currentNode);
							newNode.setNext(null);
							foundLocation = true;
						}
					
				}
				//Once the comparable of the new node is less than the current node, insert into queue:
				else {
					newNode.setNext(currentNode);
					newNode.setPrevious(currentNode.getPrevious());
					currentNode.setPrevious(newNode);
					currentNode.getPrevious().setNext(newNode);
					foundLocation = true;
					
				}
			}
		}
	}
	
	public T subtractElement(){
		PriorityNode<T> output = first;
		first = first.getNext();
		return output.getData();
		
	}
	public boolean isEmpty(){
		if(first == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
}
