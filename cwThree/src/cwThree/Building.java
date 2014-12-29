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
 * This class asks the user for input to create a customer list and a building with a set number of floors.
 * The building then operates an elevator which then serves the customers floor to floor.
 * @author Ronu Miah
 *
 */
public class Building {
	/**
	 * main method asks the user for input to create a customer list and a building with a set number of floors.
	 * The building then operates an elevator which then takes customers from their current floor to destination floor.
	 * 
	 */
	public static void main( String[]args) {
		Scanner liftController = new Scanner(System.in);
	    int numOfFloors;
	    int numOfCust;
	    //Requests the user to enter the number of floors building.
	    do {
	        System.out.println("Please enter the number of floors in the building : ");
	        while (!liftController.hasNextInt()) {
	            System.out.println("Please enter a valid positive number ");
	            liftController.next();
	        }
	        numOfFloors = liftController.nextInt();
	        if(numOfFloors == 13 ){
	        	System.out.println("Sorry " + numOfFloors + " floor building length is invalid, please enter atleast 14 or higher as  the 13th floor will be omitted due to Triskaidekaphobia and Superstitions");
	        	numOfFloors = -1;
	        }
	    } while ( numOfFloors < 0);
	    System.out.println("building has " + numOfFloors + " floors");
	    //Asks for number of customers in the building
	    do {
	        System.out.println("Please enter a the number of customers in the building : ");
	        while (!liftController.hasNextInt()) {
	            System.out.println("Please enter a valid positive number ");
	            liftController.next();
	        }
	        numOfCust = liftController.nextInt();
	    } while (numOfCust < 0);
	    System.out.println("building has " + numOfCust + " customers");
	    //creates a customer list from number of floors in the building and the number of customers
	    ArrayList<Customer> customerList = custList(numOfCust, numOfFloors);
	    Elevator lift = new Elevator(numOfFloors);
	    lift.liftOps(customerList);

	}
	/**
	 * This method creates a list of customers from number of customers in the building the floors available
	 * @param numOfCust number of customers present in the building
	 * @param floors number of floors in the building
	 * @return returns an object array list 
	 */
	public static ArrayList<Customer> custList(int numOfCust, int floors ){
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
