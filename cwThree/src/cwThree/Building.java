/**
 * 
 */
package cwThree;
import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;
/**
 * @author HP
 *
 */
public class Building {
	
	@Test
	public void test() throws IllegalArgumentException, IllegalAccessException{
	
	
	Customer c = new Customer(3);
	
	for (Field field : c.getClass().getDeclaredFields()) {
	    field.setAccessible(true);
	    String name = field.getName();
	    Object value = field.get(c);
	    System.out.printf("%s: %s%n", name, value);
	}
Customer f = new Customer(3);
	
	for (Field field : f.getClass().getDeclaredFields()) {
	    field.setAccessible(true);
	    String name = field.getName();
	    Object value = field.get(f);
	    System.out.printf("%s: %s%n", name, value);
	}
Customer e = new Customer(3);
	
	for (Field field : e.getClass().getDeclaredFields()) {
	    field.setAccessible(true);
	    String name = field.getName();
	    Object value = field.get(e);
	    System.out.printf("%s: %s%n", name, value);
	}
	}
}
