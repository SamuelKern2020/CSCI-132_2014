package queueWithArray;

import javax.swing.JOptionPane;

public class ArrayDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericQueue<Person> queue1 = new GenericQueue<Person>();
		
		
		boolean done = false;
		
		
		String[] choices = {"Sign In", "Next Person", "Quit"};
		while (!done){
			int choice = JOptionPane.showOptionDialog(
                    null,
                    "Waiting List",
                    "Stack Operations Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]);
			
			switch (choice){
            case 0:           
                //User inserts their first and last name:
                String inputFirstName = JOptionPane.showInputDialog( "Enter your first name");
                String inputLastName = JOptionPane.showInputDialog( "Enter your last name");

                queue1.enqueue(new Person (inputFirstName, inputLastName));
                break;

            case 1:
            	if(!queue1.isEmpty()){
            	
            		JOptionPane.showMessageDialog(
            				null,
                            "Next Person: "+ queue1.dequeue().getAllInfo());
            	}
            	else{
            		JOptionPane.showMessageDialog(
            				null,
                            "The waiting list is empty");
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
