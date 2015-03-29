package com.ygq.strategypattern;

import com.ygq.strategypattern.behavior.FlyBehavior;
import com.ygq.strategypattern.behavior.FlyWithWings;
import com.ygq.strategypattern.behavior.Quack;
import com.ygq.strategypattern.behavior.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public Duck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("all duck can swim");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
