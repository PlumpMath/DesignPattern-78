package com.ygq.strategypattern.behavior;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can not fly");
	}

}