package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.gumballMachine;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Sep 4, 2022
 */
public class TestNotNull {
	gumballMachine gumballMachine = new gumballMachine(100);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testGumballsNotNull() {
		assertNotNull(gumballMachine.getGumballs());
	}

	@Test
	public void testIsQuarterInSlotNotNull() {
		assertNotNull(gumballMachine.getIsQuarterInSlot());
	}
	
	@Test
	public void testMoneyInMachineNotNull() {
		assertNotNull(gumballMachine.getMoneyInMachine());
	}
	
	@Test
	public void testBuyGumballNotNull() {
		assertNotNull(gumballMachine.buyGumball());
	}

}
