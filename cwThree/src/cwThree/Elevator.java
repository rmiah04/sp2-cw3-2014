/**
 * 
 */
package cwThree;

/**
 * @author HP
 *
 */
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
public class Elevator {
	static int NUM_OF_FLOORS = 0;
	int currentFloor = 0;
	ArrayList<Customer> registerList = new ArrayList<Customer>();
	
	public Elevator(int floor){
		Elevator.NUM_OF_FLOORS = floor;
	}
	//moves the lift 
	public void liftOps (ArrayList<Customer> cList){
		ListIterator<Customer> iterator = registerList.listIterator();
		//lift going up floor by floor.
		for (int currentFloor = 1; currentFloor <= NUM_OF_FLOORS ; currentFloor++){
			System.out.println("Lift going <UP>, current floor " + "<<" + currentFloor + ">>");
			for (Customer value : cList) {
				if(value.getfinished() == false){
					if (value.getcurrentFloor() == currentFloor && value.getdestinationFloor() >= currentFloor){
						if(value.getdestinationFloor() == 13){
							System.out.println(" Sorry your requasted floor " + value.getdestinationFloor() + " does not exist");
							customerLeaves(value);
						}
						else{
						customerJoins(value);
						}
					}
				}
			}
			if (registerList != null && registerList.size() > 0){
				for (Customer cExit : registerList){
					if(cExit.getdestinationFloor() == currentFloor && cExit.getfinished() == false){
						customerLeaves(cExit);
					}
				}
			}
		}
		//lift going down.
		for (int currentFloor = NUM_OF_FLOORS; currentFloor > 0; currentFloor--){
			System.out.println("Lift going <DOWN>, current floor " + "<<" + currentFloor + ">>");
			for (Customer value : cList) {
				if(value.getfinished() == false){
					if (value.getcurrentFloor() == currentFloor && value.getdestinationFloor() <= currentFloor){
						customerJoins(value);
					}
				}
			}
			if (registerList != null && registerList.size() > 0){
				for (Customer cExit : registerList){
					if(cExit.getdestinationFloor() == currentFloor && cExit.getfinished() == false){
						customerLeaves(cExit);
					}
				}
			}
		}
	}
	public void customerJoins(Customer cust){
		System.out.println("Customer " + cust.getcustomerID() + " enters Lift." + " and selects " + cust.getdestinationFloor());
		cust.setInElevator(true);
		registerList.add(cust);
		}
	public void customerLeaves(Customer cust){
		System.out.println("Customer " + cust.getcustomerID() + " exits Lift.");
		cust.setInElevator(false);
		cust.setfinished(true);
	}

}
