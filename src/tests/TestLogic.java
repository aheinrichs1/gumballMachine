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
public class TestLogic {
	gumballMachine gumballMachine = new gumballMachine(100);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testPutQuarterInSlot() {
		gumballMachine.putQuarterInSlot();
		assertEquals(true, gumballMachine.getIsQuarterInSlot());
	}

	@Test
	public void testBuyGumball() {
		int myGumballs = 0;
		gumballMachine.setIsQuarterInSlot(true);
		myGumballs += gumballMachine.buyGumball();
		assertEquals(1, myGumballs);
	}
	
	@Test
	public void testBuyGumballFail() {
		int myGumballs = 0;
		myGumballs += gumballMachine.buyGumball();
		assertEquals(0, myGumballs);
	}
	
	@Test
	public void testGumballsInMachineAfterBuyGumballs() {
		gumballMachine.setIsQuarterInSlot(true);
		gumballMachine.buyGumball();
		assertEquals(99, gumballMachine.getGumballs());
	}
	
	@Test
	public void testGumballsInMachineAfterBuyGumballsFail() {
		gumballMachine.buyGumball();
		assertEquals(100, gumballMachine.getGumballs());
	}	
	
}
