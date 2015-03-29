package com.ygq.strategypattern;

import com.ygq.strategypattern.behavior.FlyNoWay;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am a model duck");
	}
}
