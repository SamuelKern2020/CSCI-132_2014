package queueWithLinkedList;

public class Person {

	String firstName;
	String lastName;
	
	//Constructor:
	public Person (String first, String last){
		firstName = first;
		lastName = last;
	}
	
	public String getAllInfo(){
		return firstName + " " + lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
}
