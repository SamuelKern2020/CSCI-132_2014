package airlineBoarding;

import javax.swing.JOptionPane;

//import stanbyClasses.PriorityQueue;
//import stanbyClasses.StandbyPassenger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirlineBoarding flight1 = new AirlineBoarding ();
		
		
		boolean done = false;
		
		
		String[] choices = {"Enqueue", "Dequeue Passenger", "Dequeue Standby Passenger", "Close Program"};
		while (!done){
			int choice = JOptionPane.showOptionDialog(
                    null,
                    "Main Menu",
                    "Airline Boarding",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    choices,
                    choices[0]);
			
			switch (choice){
            case 0:   
            	int inputLongevity;
                //User inserts their first and last name:
               
                String inputLastName = JOptionPane.showInputDialog( "Enter your last name");
                String whatQueue = null;
                
                String[] selectButton = {"First Class", "Platinum", "Standard", "Standby"};
        		
        			int classChoice = JOptionPane.showOptionDialog(
                            null,
                            "Select passenger type:",
                            "Airline Boarding",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            selectButton,
                            selectButton[0]);
        			
        			switch (classChoice){
        			case 0: whatQueue = "0";
        					break;
        			case 1: whatQueue = "1";
        					break;
        			case 2: whatQueue = "2";
        					break;
        			case 3: whatQueue = "3";
        					break;
        			
        				
        					
        			}
                
               
                //If the new passenger is a standby passenger:
                if (whatQueue.equals("3")){
                	 String stringInput = JOptionPane.showInputDialog( "What date did you begin working for this company? (Use format YearMonthDay");
                	 inputLongevity = Integer.parseInt(stringInput);
                	 int passengerTypeStandby = Integer.parseInt(whatQueue);
                	 flight1.enqueueStandby(new Passenger (inputLastName, inputLongevity, passengerTypeStandby), inputLongevity);
                }
                
                //If the new passenger is a non-standby passenger:
                else {
                	int passengerType = Integer.parseInt(whatQueue);
                	flight1.enqueueNonStandby(new Passenger (inputLastName, passengerType), passengerType);	
                }
                break;

                
            case 1:
            	if (flight1.isNonStandbyEmpty()){
            		JOptionPane.showMessageDialog(
            				null,
                            "There are no passengers with tickets.");
            	}
            	else {
            		JOptionPane.showMessageDialog(
            				null,
                            "Next Passenger: "+ flight1.dequeueNonStandby().getInfo());
            	}
            	
            	break;
           
            case 2:
            	
            	if (flight1.isStandbyEmpty()){
            		JOptionPane.showMessageDialog(
            				null,
                            "There are no standby passengers.");
            	}
            	else {
            		
            		JOptionPane.showMessageDialog(
            				null,
                            "Next Passenger: "+ flight1.dequeueStandby().getInfo());
            	}
            	break;
            
            
            
            case 3:
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
