package stanbyClasses;

public class StandbyPassenger {

	String firstName;
	String middleInitial;
	String lastName;
	int longevity;
	String confirmationNumber;
	//int PassengerCount = 0;
	
	//Constructor
	public StandbyPassenger (String first, String middle, String last, int longev){
		firstName = first;
		middleInitial = middle;
		lastName = last;
		longevity = longev;
		confirmationNumber ="T1000";
	}
	
	public String getFullName(){
		return firstName + " " + middleInitial + " " + lastName;
		
	}
	
	public int getLongevity(){
		return longevity;
	}
	
	public String getConfirmationNumber(){
		return confirmationNumber;
	}
}
