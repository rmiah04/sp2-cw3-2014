/**
 * 
 */
package cwThree;

/**
 * @author HP
 *
 */
import java.util.ArrayList;
import java.util.List;
public class Elevator {
	static int NUM_OF_FLOORS = 0;
	int currentFloor = 0;
	List<?> register = new ArrayList<Object>();
	
	public Elevator(int floor){
		Elevator.NUM_OF_FLOORS = floor;
	}

}
