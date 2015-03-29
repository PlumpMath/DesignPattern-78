package com.ygq.strategypattern;

import com.ygq.strategypattern.behavior.FlyRocketPowered;

public class Test {

	public static void main(String[] args) {
		Duck duck = new ModelDuck();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}

}
