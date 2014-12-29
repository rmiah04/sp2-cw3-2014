/**
 * 
 */
package cwThree;
import static org.junit.Assert.*;
import org.junit.Test;

/**
* Unit tests to assess functionality of the elevator system and customer.
* @author Ronu Miah 
*/
public class ElevatorTest {
	/** 
	 * Checks that current and destination floor in Customer works
	 */
	@Test
	public void testCurDestinationFloor(){
		Customer cust = new Customer(4 , 5);
		assertEquals("current floor ", 4, cust.getcurrentFloor());
		assertEquals("destination floor ", 5, cust.getdestinationFloor());
	}
	/**
	 *  Checks that current if current floor is 13 that it is updated to reflect correct current floor
	 */
	@Test
	public void testCurThirteenFloor(){
		Customer cust = new Customer(13 , 5);
		//if current floor is 13 actual floor should be 14 as 13 does not exist
		assertEquals("current floor ", 14, cust.getcurrentFloor());
	}
	/** 
	 * Checks that customer is in an elevator
	 */
	@Test
	public void testInElevator(){
		Customer cust = new Customer(13 , 5);
		assertEquals("in elevator ", false, cust.getInElevator());
		//check that the status can be changed
		cust.setInElevator(true);
		assertEquals("in elevator ", true, cust.getInElevator());
	}
	/** 
	 * Checks that customer is finished at time of creation as they may already be on their desired floor
	 */
	@Test
	public void testIsFinished(){
		Customer cust = new Customer(5 , 5);
		assertEquals("finished ", true, cust.getfinished());
		Customer cust1 = new Customer(5 , 6);
		assertEquals("finished ", false, cust1.getfinished());
		//change the status
		cust1.setfinished(true);
		assertEquals("finished ", true, cust1.getfinished());
	}
	/**
	 * Test elevator floor settings
	 */
	@Test
	public void testElevatorFloor(){
		Elevator lift = new Elevator(12);
		assertEquals("Elevator floor Settings ", 12, lift.getNumFloors() );
	}
	/**
	 * Test to check if customer joins and customer leaves method change the customer status correctly.
	 */
	@Test
	public void testElevatorJoinLeave(){
		Elevator lift2 = new Elevator(12);
		Customer cust1 = new Customer(5 , 6);
		lift2.customerJoins(cust1);
		assertEquals("Customer in elevator ", true, cust1.getInElevator() );
		assertEquals("Customer finished ", false, cust1.getfinished() );
		lift2.customerLeaves(cust1);
		assertEquals("Customer in elevator ", false, cust1.getInElevator() );
		assertEquals("Customer finished ", true, cust1.getfinished() );

	}
	/**
	 * Test to check if customer selects floor 13 appropriate message is given and and when customer leaves status are updated accordingly
	 */
	@Test
	public void testElevatorJoinLeave2(){
		Elevator lift2 = new Elevator(12);
		Customer cust1 = new Customer(5 , 13);
		lift2.customerJoins(cust1);
		assertEquals("Customer in elevator ", false, cust1.getInElevator() );
		assertEquals("Customer finished ", true, cust1.getfinished() );
	}

}
