/**
 * 
 */
package cwThree;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.Field;
import org.junit.Test;
/**
 * @author HP
 *
 */
public class Building {
	
	@Test
	public void test() {
		Scanner liftController = new Scanner(System.in);
	    int numOfFloors;
	    int numOfCust;
	    //Requests the user to enter the number of floors and customers in the building.
	    do {
	        System.out.println("Please enter a the number of floors in the building : ");
	        while (!liftController.hasNextInt()) {
	            System.out.println("Please enter a valid positive number ");
	            liftController.next();
	        }
	        numOfFloors = liftController.nextInt();
	    } while (numOfFloors < 0);
	    System.out.println("building has floors " + numOfFloors);
	    do {
	        System.out.println("Please enter a the number of customers in the building : ");
	        while (!liftController.hasNextInt()) {
	            System.out.println("Please enter a valid positive number ");
	            liftController.next();
	        }
	        numOfCust = liftController.nextInt();
	    } while (numOfCust < 0);
	    System.out.println("building has customers " + numOfCust);
	    ArrayList<Customer> customerList = custList(numOfCust, numOfFloors);
	    Elevator lift = new Elevator(numOfFloors);
	    lift.liftOps(customerList);

	}
	//Create a list of customers from number of customers in the building
	public ArrayList<Customer> custList (int numOfCust, int floors ){
		final int FLOOR = floors;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		if (numOfCust > 0){
			for (int i = 1; i <= numOfCust ; i++){
				customerList.add(new Customer(FLOOR));
			}
		}
		return customerList;
	}
}
