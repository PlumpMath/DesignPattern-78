package com.ygq.strategypattern;

import com.ygq.strategypattern.behavior.FlyWithWings;
import com.ygq.strategypattern.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	public void display() {
			System.out.println("this is mallard duck");
	}
	
}
