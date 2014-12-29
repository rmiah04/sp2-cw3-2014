/**
 * 
 */
package cwThree;

/**
 * @author Ronu Miah
 *
 */
import java.util.ArrayList;
import java.util.List;
/**
 * This class creates an elevator with the methods to visit the building floor by floor picking and alighting customers.
 * Constructor defaults NUM_OF_FLOORS = 0, currentFloor = 0;
 * @author Ronu Miah
 * @version 1.0
 */
public class Elevator {
	static int NUM_OF_FLOORS = 0;
	int currentFloor = 0;
	ArrayList<Customer> registerList = new ArrayList<Customer>();
	/**
	 * Constructor 
	 * @param floor creates an elevator with number of floors in the building
	 */
	public Elevator(int floor){
		Elevator.NUM_OF_FLOORS = floor;
	}
	/**
	 * Method operates an elevator visiting each floors in the building by going floor by floor up then down and 
	 * checking the customer list for current floor and destination floor.
	 * @param cList customer list of people in the building
	 */
	public void liftOps (ArrayList<Customer> cList){
		//lift going up floor by floor.
		for (int currentFloor = 1; currentFloor <= NUM_OF_FLOORS ; currentFloor++){
			System.out.println("Lift going <UP>, current floor " + "<<" + currentFloor + ">>");
			//enter lift
			for (Customer value : cList) {
				value.setVisited();
				if(value.getfinished() == false){
					if (value.getcurrentFloor() == currentFloor && value.getdestinationFloor() >= currentFloor){
						customerJoins(value);
					}
				}
			}
			//exit lift
			if (registerList != null && registerList.size() > 0){
				for (Customer cExit : registerList){
					cExit.setVisited();
					if(cExit.getdestinationFloor() == currentFloor && cExit.getfinished() == false){
						customerLeaves(cExit);
					}
				}
			}
		}
		//lift going down.
		for (int currentFloor = NUM_OF_FLOORS; currentFloor > 0; currentFloor--){
			System.out.println("Lift going <DOWN>, current floor " + "<<" + currentFloor + ">>");
			//enters lift
			for (Customer value : cList) {
				value.setVisited();
				if(value.getfinished() == false){
					if (value.getcurrentFloor() == currentFloor && value.getdestinationFloor() <= currentFloor){
						customerJoins(value);
					}
				}
			}
			//exits lift
			if (registerList != null && registerList.size() > 0){
				for (Customer cExit : registerList){
					cExit.setVisited();
					if(cExit.getdestinationFloor() == currentFloor && cExit.getfinished() == false){
						customerLeaves(cExit);
					}
				}
			}
		}
	}
	/**
	 * Method adds a Customer to the elevator register
	 * @param cust Customer that has entered the elevator
	 */
	public void customerJoins(Customer cust){
		System.out.println("Customer " + cust.getcustomerID() + " enters Lift." + " and selects " + cust.getdestinationFloor());
		if(cust.getdestinationFloor() == 13){
			System.out.println(" Sorry your requested floor " + cust.getdestinationFloor() + " does not exist");
			customerLeaves(cust);
		}
		else{
			cust.setInElevator(true);
			registerList.add(cust);
		}
		}
	/**
	 * Method that removes a Customer from the elevator and also changes their status to finished.
	 * @param cust Customer that has exited the elevator
	 */
	public void customerLeaves(Customer cust){
		System.out.println("Customer " + cust.getcustomerID() + " exits Lift.");
		cust.setInElevator(false);
		cust.setfinished(true);
	}
	public int getNumFloors(){
		return NUM_OF_FLOORS;
		
	}
	

}
