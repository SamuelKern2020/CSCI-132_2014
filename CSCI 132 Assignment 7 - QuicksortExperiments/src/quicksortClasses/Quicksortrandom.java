package quicksortClasses;

import java.util.Random;


import javax.swing.JOptionPane;

public class Quicksortrandom {
    
    public static void main(String args[]){
    	
    	boolean done = false;
    
    	String [] choices = {"Run Test", "Quit"};
    	
    	while (!done){
			int choice = JOptionPane.showOptionDialog(
                    null,
                    "Time Complexity Test - Insertion Sort",
                    "Insertion Sort",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]);
			
			switch (choice){
            case 0:   
            	
            		String inputSize = JOptionPane.showInputDialog("Enter the size of list to be sorted: ");
                	int listSize = Integer.parseInt(inputSize);
                    
                    Random randomInteger     = new Random();
                    Integer[] randomList     = new Integer[listSize];
                    
                    for (int j = 0; j < listSize; j++){
                        randomList[j] = randomInteger.nextInt();
                    }
                        
                    long startTime = System.currentTimeMillis();
                    QuickSort.quickSort(randomList, 0, listSize-1);
                    long endTime = System.currentTimeMillis();
                    JOptionPane.showMessageDialog(null, ("The time taken to sort this random array of "
                         + listSize + " elements was " 
                         + (((float)(endTime - startTime))/1000.0)
                         + " seconds."), "Result", JOptionPane.INFORMATION_MESSAGE);
                    

                    int i = 0;
                    while (i < listSize-1 && (randomList[i] <= randomList[i+1])){
                        i++;
                    }
                    if (i == listSize-1){
                        System.out.println("List was sorted properly");
                    }
                    else {
                        System.out.println("List was not sorted properly: "
                                + "List[" + (i) + "] = " + randomList[i]
                                + " and List[" + (i+1) + "] = " + randomList[i+1] + ".");
                    }
            	
            	
                break;
                
                
                
                
            case 1:
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
			
			
