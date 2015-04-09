package com.ygq.statepattern;

public class SoldOutState implements State {

	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("candy is sold out");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("you haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("you turned, you haven't inserted a quarter");
	}

	public void dispense() {
		System.out.println("you need pay first");
	}

}
