package binaryTreeImplementation;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		int numberOfElements  = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter the number of elements you want to insert into tree."));
		int startingSize  = Integer.parseInt(JOptionPane.showInputDialog
                 ("Enter the lowest possible value"));
		int endingSize = Integer.parseInt(JOptionPane.showInputDialog
                 ("Enter the largest possible value"));
		int seed    = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter a random number generator seed.")); 
		
		int numberRange = endingSize - startingSize;
		Random randomIntegerGenerator;
		Integer [] randomList = new Integer [numberOfElements];
		
		

		randomIntegerGenerator = new Random(seed);
		
		String list = "";
		for (int i = 0; i < numberOfElements; i++){
			randomList [i] = randomIntegerGenerator.nextInt(numberRange+1) + startingSize;
			list = list + (randomList[i])  + ", ";
			if(i%10==0){
				list = list + "\n";            	
	            }
			
		}
		
		 JOptionPane.showMessageDialog(null, list, "Here is your randomly generated list:", JOptionPane.INFORMATION_MESSAGE);
		
		
		LinkedBinaryTree tree1 = new LinkedBinaryTree();
		
		for(int x = 0; x < numberOfElements; x++){
			tree1.insert(randomList[x]);
		}
		
	        
	        
		//Traversal calls:
		boolean done = false;
	    
    	String [] choices = {"Run Pre-Order Traversal", "Run In-Order Traversal", "Run Post-Order Traversal", "Check for a Value", "Quit"};
    	
    	while (!done){
			int choice = JOptionPane.showOptionDialog(
                    null,
                    "Driver",
                    "Traverse the Tree",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]);
			
			switch (choice){
            case 0:   

            tree1.preOrderTraverse(tree1.getRoot());
       		 JOptionPane.showMessageDialog(null, tree1.getPreOrderValues(), "Pre-Order Traversal Results:", JOptionPane.INFORMATION_MESSAGE);
            	
            	
            	break;
            	
            case 1:
            	tree1.inOrderTraverse(tree1.getRoot());
          		 JOptionPane.showMessageDialog(null, tree1.getInOrderValues(), "In-Order Traversal Results:", JOptionPane.INFORMATION_MESSAGE);

            	break;
        	
            case 2:
            	tree1.postOrderTraverse(tree1.getRoot());
         		JOptionPane.showMessageDialog(null, tree1.getPostOrderValues(), "Post-Order Traversal Results:", JOptionPane.INFORMATION_MESSAGE);

            	break;
        	
            case 3:
            	int testValue = Integer.parseInt(JOptionPane.showInputDialog
                        ("Enter a number to test.")); 
            	if(tree1.checkValue(testValue, tree1.getRoot())){
             		JOptionPane.showMessageDialog(null, testValue + " was found!", "Test Results", JOptionPane.INFORMATION_MESSAGE);
            	}
            	else{
             		JOptionPane.showMessageDialog(null, testValue + " was not found in the binary tree.", "Test Results", JOptionPane.INFORMATION_MESSAGE);

            	}
            	
            	break;
            case 4:
            	done = true;
                JOptionPane.showMessageDialog(
                    null,
                    "...ending!",
                     "",
                     JOptionPane.ERROR_MESSAGE);
                break;
		
                
		
    
	     
		    
		    

		
		

	}

}
	}
}
