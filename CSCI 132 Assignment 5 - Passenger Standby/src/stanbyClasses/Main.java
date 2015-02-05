 package stanbyClasses;

import javax.swing.JOptionPane;

//import queueWithLinkedList.GenericQueue;
//import queueWithLinkedList.Person;

public class Main {

	public static void main(String[] args) {

		PriorityQueue<StandbyPassenger> queue1 = new PriorityQueue<StandbyPassenger>();
		
		
		boolean done = false;
		
		
		String[] choices = {"Sign In", "Next Passenger", "Quit"};
		while (!done){
			int choice = JOptionPane.showOptionDialog(
                    null,
                    "Standby Passenger Queue",
                    "Stack Operations Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]);
			
			switch (choice){
            case 0:   
            	int inputLongevity;
                //User inserts their first and last name:
                String inputFirstName = JOptionPane.showInputDialog( "Enter your first name");
                String inputMiddleInitial = JOptionPane.showInputDialog( "Enter your middle initial");
                String inputLastName = JOptionPane.showInputDialog( "Enter your last name");
                String stringInput = JOptionPane.showInputDialog( "What date did you begin working for this company? (Use format YearMonthDay");
                inputLongevity = Integer.parseInt(stringInput);
                             

                queue1.enqueue(new StandbyPassenger (inputFirstName, inputMiddleInitial, inputLastName, inputLongevity), inputLongevity);
                break;

            case 1:
            	if(!queue1.isEmpty()){
            	
            		JOptionPane.showMessageDialog(
            				null,
                            "Next Passenger: "+ queue1.dequeue().getFullName());
            	}
            	else{
            		JOptionPane.showMessageDialog(
            				null,
                            "There are no standby passengers.");
            	}
            	
            	break;
            	
            	
            case 2:
                done = true;
                JOptionPane.showMessageDialog(
                    null,
                    "...quitting!",
                     "",
                     JOptionPane.ERROR_MESSAGE);
                break;
        }
		}
		
	}

}
