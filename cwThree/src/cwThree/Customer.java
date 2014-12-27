/**
 * 
 */
package cwThree;
import java.util.Random; 
/**
 * @author HP
 *
 */
public class Customer {
	private static int counter = 1;
	int customerID = 0;
	int currentFloor = 0;
	int destinationFloor = 0;
	boolean inElevator = false;
	boolean finished = false;
	
	public Customer (int floor){
		 Random rand = new Random(); 
		 this.currentFloor = rand.nextInt(floor) + 1;
		 this.destinationFloor = rand.nextInt(floor) + 1;
		 this.customerID = counter++;
		 if (currentFloor == destinationFloor){
			 finished = true;
		 }
		 //13th floor does not exist so customers are technically on the 14th floor.
		 if (currentFloor == 13){
			 currentFloor = 14;
		 }
	}
	public int getcustomerID (){
		return this.customerID;		
	}
	public int getcurrentFloor(){
		return this.currentFloor;	
	}
	public boolean getfinished(){
		return this.finished;
	}
	public void setfinished(Boolean status){
		this.finished = status;
	}
	public int getdestinationFloor(){
		return this.destinationFloor;
	}
	public boolean getInElevator(){
		return this.inElevator;
	}
	public void setInElevator(Boolean status){
		this.inElevator = status;
	}
	
	
}
