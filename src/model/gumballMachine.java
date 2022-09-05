package model;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Sep 4, 2022
 */
public class gumballMachine {
	private int gumballs;
	private boolean isQuarterInSlot;
	private double moneyInMachine;
	
	//getters and setters
	public int getGumballs() {
		return gumballs;
		
	}
	
	public void setGumballs(int gumballs) {
		this.gumballs = gumballs;
	}
	
	public boolean getIsQuarterInSlot() {
		return isQuarterInSlot;
	}
	
	public void setIsQuarterInSlot(boolean isQuarterInSlot) {
		this.isQuarterInSlot = isQuarterInSlot;
	}
	
	public double getMoneyInMachine() {
		return moneyInMachine;
	}
	
	public void setMoneyInMachine(double moneyInMachine) {
		this.moneyInMachine = moneyInMachine;
	}
	
	//default constructor
	public gumballMachine() {
		gumballs = 0;
		isQuarterInSlot = false;
		moneyInMachine = 0.0;
	}
	
	//basic constructor with gumball parameter
	public gumballMachine(int gumballs) {
		this.gumballs = gumballs;
		isQuarterInSlot = false;
		moneyInMachine = 0.0;
	}
	
	//basic constructor with all parameters
	public gumballMachine(int gumballs, 
						  boolean isQuarterInSlot,
						  double moneyInMachine) {
		this.gumballs = gumballs;
		this.isQuarterInSlot = isQuarterInSlot;
		this.moneyInMachine = moneyInMachine;
	}
	
	//method for putting quarter in slot
	public void putQuarterInSlot() {
		if(isQuarterInSlot == false) {
			isQuarterInSlot = true;
		} else {
			System.out.println("Quarter already in slot");
		}
	}
	
	//method for buying a gumball
	public int buyGumball() {
		if(isQuarterInSlot == true) {
			gumballs -= 1;
			moneyInMachine += 0.25;
			isQuarterInSlot = false;
			return 1;
		} else {
			System.out.println("No quarter in slot");
			return 0;
		}
	}
}
