package com.ygq.statepattern;

public class SoldState implements State {

	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("you have already inserted a quarter");
	}

	public void ejectQuarter() {
		System.out.println("candy is dispense");
	}

	public void turnCrank() {
		System.out.println("waiting for sold candy");
	}

	public void dispense() {
		if (gumballMachine.getCount() > 0) {
			System.out.println("dispense candy");
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("candy had been sold out");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
