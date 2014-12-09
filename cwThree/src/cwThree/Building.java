/**
 * 
 */
package cwThree;
import static org.junit.Assert.*;
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
	    System.out.println("building has customers " + numOfFloors);

	
//	for (Field field : e.getClass().getDeclaredFields()) {
//	    field.setAccessible(true);
//	    String name = field.getName();
//	    Object value = field.get(e);
//	    System.out.printf("%s: %s%n", name, value);
//	}
	}
}
