package com.ygq.statepattern;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int count) {
		this.count = count;
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}
	public State getSoldState() {
		return soldState;
	}
	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
	}
	public void dispense() {
		state.dispense();
	}
}
