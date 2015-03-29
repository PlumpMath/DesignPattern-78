package com.ygq.strategypattern;

public class ReadheadDuck extends Duck {

	public void display() {
		System.out.println("this is readhead");
	}

	public static void main(String[] args) {
		Duck duck = new ReadheadDuck();
		duck.performFly();
		duck.performQuack();
	}

}
