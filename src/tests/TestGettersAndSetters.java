package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.*;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Sep 4, 2022
 */
public class TestGettersAndSetters {
	gumballMachine gumballMachine = new gumballMachine(100);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetAndGetGumballs() {
		gumballMachine.setGumballs(50);
		assertEquals(50, gumballMachine.getGumballs());
	}
	
	@Test 
	public void testSetAndGetIsQuarterInSlot() {
		gumballMachine.setIsQuarterInSlot(true);
		assertEquals(true, gumballMachine.getIsQuarterInSlot());
	}
	
	@Test 
	public void testSetAndGetMoneyInMachine() {
		gumballMachine.setMoneyInMachine(25.0);
		assertEquals(25.0, gumballMachine.getMoneyInMachine(), 0.0);
	}

}
