package airlineBoarding;
import java.util.Random;

public class Passenger {
	
	String lastName;
	int longevity;
	String passengerClass;
	String confirmationNumber;
	
	//For confirmation number generation:
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	//Constructor for regular passenger
	public Passenger (String last,int pClass){
		lastName = last;
		
		if (pClass == 0){
			passengerClass = "First Class";
		}
		if (pClass == 1){
			passengerClass = "Platinum";
		}
		if (pClass == 2){
			passengerClass = "Standard";
		}
		
		confirmationNumber = alphabet.charAt(((int) Math.random() * 26) + 1) + Integer.toString((int) (Math.random() * 9999) + 1);	
	}
	
	//Constructor for Standby
		public Passenger (String last, int longev, int pClass){
			lastName = last;
			longevity = longev;
			if (pClass == 3){
				passengerClass = "Standby";
			}
			confirmationNumber = alphabet.charAt(((int) Math.random() * 26) + 1) + Integer.toString((int) (Math.random() * 9999) + 1);	
		}
		
		
		public String getInfo(){
			String allInfo = (lastName +"\n"+ passengerClass + "\n" + confirmationNumber);
			
			return allInfo;
		}
	public String getName(){
		return lastName;
		
	}
	
	public int getLongevity(){
		return longevity;
	}
	
	public String getConfirmationNumber(){
		return confirmationNumber;
	}
	
	public String getPassengerClass(){
		return passengerClass;
	}
}
