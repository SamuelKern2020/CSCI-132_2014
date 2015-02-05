package airlineBoarding;

//import stanbyClasses.PriorityQueue;
//import stanbyClasses.StandbyPassenger;

//import queueWithLinkedList.GenericQueue;
//import queueWithLinkedList.Person;

public class AirlineBoarding {
	
	GenericQueue<Passenger>[] queueDirectory;
	
	//Constructor:
	public AirlineBoarding(){
		
		queueDirectory = new GenericQueue[3];	
		
		queueDirectory[0] = new GenericQueue<Passenger>();	//First Class queue
		queueDirectory[1] = new GenericQueue<Passenger>();	//Platinum queue
		queueDirectory[2] = new GenericQueue<Passenger>();	//Standard queue
	}
	
	PriorityQueue<Passenger> standbyQueue = new PriorityQueue<Passenger>();
	
//	GenericQueue<Passenger>[] queueDirectory = (GenericQueue<Passenger>[])new Object[3];

	
	public void enqueueNonStandby(Passenger newPassenger, int queueSelection){
		System.out.println("Passenger enqueued to " + queueSelection);
		queueDirectory[queueSelection].enqueue(newPassenger);	
	}
	
	
	public void enqueueStandby(Passenger newPassenger, int comparable){
		standbyQueue.enqueue(newPassenger, comparable);
	}
	

	
	public Passenger dequeueNonStandby (){
		int queueNumber = 3;
		
		if(!queueDirectory[2].isEmpty()){
			queueNumber = 2;
		}
		if(!queueDirectory[1].isEmpty()){
			queueNumber = 1;
		}
		if(!queueDirectory[0].isEmpty()){
			queueNumber = 0;
		}
		
		switch (queueNumber){
		
		case 0: 
			return queueDirectory[0].dequeue();
		case 1: 
			return queueDirectory[1].dequeue();
		case 2: 
			return queueDirectory[2].dequeue();
		case 3:
			return null;
			
		default: return null;

		}
	}
	
	
	
	public Passenger dequeueStandby(){
		if (!standbyQueue.isEmpty()){
			return standbyQueue.dequeue();
		}
		else {
			return null;
		}
	}
	
	
	
	public boolean isNonStandbyEmpty(){
		if (queueDirectory[0].isEmpty() && queueDirectory[1].isEmpty() && queueDirectory[2].isEmpty()){
			return true;
		}
		else{
			return false;
		}	
	}
	
	public boolean isStandbyEmpty(){
		if (standbyQueue.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
	
}
