package com.ygq.decoratepattern;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescritpion() {
		return beverage.getDescritpion() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
