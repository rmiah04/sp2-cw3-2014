/**
 * 
 */
package cwThree;
import java.util.Random; 
/**
 * This class creates a customer object with current floor and destination floor details, 
 * based on those values status of the object is also set such as whether current floor is 13 or 
 * whether they have reached their destination.
 * Default is -
 * customerID = 0
 * currentFloor = 0
 * destinationFloor = 0
 * inElevator = false 
 * finished = false 
 * @author Ronu Miah
 * @version 1.0
 *
 */
public class Customer {
	private static int counter = 1;
	int customerID = 0;
	int currentFloor = 0;
	int destinationFloor = 0;
	int numVisited = 1;
	boolean inElevator = false;
	boolean finished = false;
	/**
	 * Constructor with random current and destination floors from number of floors in the building.
	 * @param floor number of floors in the building
	 */
	public Customer (int floor){
		 Random rand = new Random(); 
		 this.currentFloor = rand.nextInt(floor) + 1;
		 this.destinationFloor = rand.nextInt(floor) + 1;
		 this.customerID = counter++;
		 //13th floor does not exist so customers are technically on the 14th floor.
		 if (currentFloor == 13){
			 currentFloor = 14;
		 }
		 //checks to see whether customers are where they wish to be
		 if (currentFloor == destinationFloor){
			 finished = true;
		 }
		 
	}
	/**
	 * Constructor with predefined current and destination floors. 
	 * @param curFloor current floor of the customer 
	 * @param destFloor destination floor of the customer
	 */
	public Customer (int curFloor, int destFloor){
		 this.currentFloor = curFloor;
		 this.destinationFloor = destFloor;
		 this.customerID = counter++;
		 //13th floor does not exist so customers are technically on the 14th floor.
		 if (currentFloor == 13){
			 currentFloor = 14;
		 }
		 //checks to see whether customers are where they wish to be
		 if (currentFloor == destinationFloor){
			 finished = true;
		 }
		 
	}
	/**
	 * method to get customer id
	 * @return method returns customer id
	 */
	public int getcustomerID (){
		return this.customerID;		
	}
	/**
	 * method to get customers current floor
	 * @return method returns customers current floor
	 */
	public int getcurrentFloor(){
		return this.currentFloor;	
	}
	/**
	 * method returns customers destination floor
	 * @return destination floor
	 */
	public int getdestinationFloor(){
		return this.destinationFloor;
	}
	/**
	 * method to check the status of the customer whether are finished or not
	 * @return finished status true or false
	 */
	public boolean getfinished(){
		return this.finished;
	}
	/**
	 * method sets the finished status to either true or false
	 * @param status finished status of customer either true or false
	 */
	public void setfinished(Boolean status){
		this.finished = status;
	}
	/**
	 * method to check whether or not the customer is in elevator
	 * @return inElevator status either true or false
	 */
	public boolean getInElevator(){
		return this.inElevator;
	}
	/**
	 * method to set if the customer is inside the elevator or not
	 * @param status set status of inElevator to true or false.
	 */
	public void setInElevator(Boolean status){
		this.inElevator = status;
	}
	/**
	 * Method returns the count of number of times the object has been visited
	 * @return numVisited number of the object has been accessed
	 */
	public int getnumVisited(){
		return this.numVisited;
	}
	/**
	 * Method increments every time the object is accessed
	 */
	public void setVisited(){
		this.numVisited++;
	}
	
}
