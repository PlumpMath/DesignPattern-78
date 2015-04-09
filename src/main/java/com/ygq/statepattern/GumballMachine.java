package com.ygq.statepattern;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State state;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		if (count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public State getSoldState() {
		return soldState;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCount() {
		return count;
	}
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
}
