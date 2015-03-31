package com.ygq.decoratepattern;

public class DecorateTest {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescritpion()+" " + beverage.cost());
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescritpion()+" " + beverage.cost());
	}
}
