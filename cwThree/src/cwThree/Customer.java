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
	static int customerID = 0;
	int currentFloor = 0;
	int destinationFloor = 0;
	boolean inElevator = false;
	boolean finished = true;
	
	public Customer (int floor){
		 Random rand = new Random(); 
		 this.currentFloor = rand.nextInt(floor) + 1;
		 this.destinationFloor = rand.nextInt(floor) + 1;
		 customerID ++;
	}
	public Customer(){
	customerID ++;
	}

}
