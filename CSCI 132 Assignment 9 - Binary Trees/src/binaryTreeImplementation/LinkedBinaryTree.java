package binaryTreeImplementation;


public class LinkedBinaryTree {
	
	//Nested Node class:   ---------------------------------------
	public static class Node <E> {
		E data;
		Node<E> parent;
		Node<E> left;
		Node<E> right;
		
		//int comparable = (int)element; // MIGHT WANT TO MODIFY THIS....
		
		
		//Constructor:
		public Node (E e, Node<E> newParent, Node<E> newLeft, Node<E> newRight) {
			data = e;
			parent = newParent;
			left = newLeft;
			right = newRight;
			
		}
		
		//Accessor methods:
		public E getData(){
			return data;
		}
		public Node<E> getParent(){
			return parent;
		}
		public Node<E> getLeft(){
			return left;
		}
		
		public Node<E> getRight(){
				return right;
		}
//		public int getComparable(){
//			return comparable;
//		}
		
		//Setter methods:
		public void setElement(E e){
			data = e;
		}
		public void setParent(Node<E> someParentNode){
			parent = someParentNode;
		}
		public void setLeftChild(Node<E> someLeftNode){
			left = someLeftNode;
		}
		public void setRightChild(Node<E> someRightNode){
			right = someRightNode;
		}
	}
	
	//END OF NESTED CLASS --------------------------------

	
	//instance variables:
	Node<Integer> root = null;
	int size = 0;
	
	//Constructs an empty binary tree:
	public LinkedBinaryTree(){
		
	}
	
	public int getSize(){
		return size;
	}
	public Node<Integer> getRoot(){
		return root;
	}
	
	
	public void insert(Integer number) {
		Node<Integer> newNode = new Node<Integer>(number, null, null, null);
        if (root == null) {
            root = newNode;
            size++;
        } else {
            Node<Integer> currentNode = root;
            while (true) {
                if ((int)newNode.data <= currentNode.data) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        newNode.parent = currentNode;
                        size++;
                        return;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else { //newNode.data > currentNode.data
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        newNode.parent = currentNode;
                        return;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }

//	Integer [] traverseValues = new Integer [size];
//	int traverseValuesSize=0;
//	
//	public void addToTraverseValues(Integer value){
//		traverseValues[traverseValuesSize] = value;
//		traverseValuesSize++;
//	}
//	
//	public void printTraverseValues(){	
//		for(int x=0; x<traverseValuesSize; x++){
//			System.out.print(traverseValues[x] + ", ");
//		}
//	}
	
	//PRE_ORDER Traversal -----------------------------------------------
	String preOrderValues = "";
	public String getPreOrderValues(){
		return preOrderValues;
	}
	public int count1 = 0;
	
	public void preOrderTraverse(Node<Integer> currentNode){
		
		if(currentNode == null){
			return;
		}
		preOrderValues = preOrderValues  + currentNode.getData() + ", ";
		count1++;
		if(count1 %10 == 0){
			preOrderValues = preOrderValues  + "\n"	;	
			}
		preOrderTraverse(currentNode.left);
		preOrderTraverse(currentNode.right);
	}
	
	
	
	//IN_ORDER Traversal -----------------------------------------------
public String inOrderValues = "";
	public String getInOrderValues(){
		return inOrderValues;
	}
	public int count2 = 0;
	
	public  void inOrderTraverse(Node<Integer> currentNode){
		if(currentNode == null){
			return;
		}
		inOrderTraverse(currentNode.left);
		inOrderValues = inOrderValues + currentNode.getData() + ", " ;
		count2++;
		if(count2 %10 == 0){
			inOrderValues = inOrderValues  + "\n"	;	
			}
		inOrderTraverse(currentNode.right);
	}
	
	//POST_ORDER Traversal -----------------------------------------------
	public String postOrderValues = "";
	public String getPostOrderValues(){
		return postOrderValues;
	}
	public int count3 = 0;
	
	public void postOrderTraverse(Node<Integer> currentNode){
		if(currentNode==null){
			return;
		}
		
		postOrderTraverse(currentNode.left);
		postOrderTraverse(currentNode.right);
		postOrderValues = postOrderValues + currentNode.getData() + ", " ;
		count3++;
		if(count3 %10 == 0){
			postOrderValues = postOrderValues  + "\n"	;	
			}
	}
	
	
	
	public boolean checkValue(int testValue, Node<Integer> currentNode){
			boolean end = false;
			boolean outcome = false;
			while (!end){
				
				if(currentNode != null){
					if(currentNode.getData() == testValue){
						end = true;
						outcome = true;
					}

					if(testValue < currentNode.getData()){
						currentNode = currentNode.left;
					}
					else{
						currentNode = currentNode.right;
					}
				}
				else{
					end = true;
					outcome = false;
				}
			}
			
			return outcome;
	}

}
