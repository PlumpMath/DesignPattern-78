package com.ygq.factorymethodpattern;

/**
 * pizza factory customer
 * @author yao.guoquan
 *
 */
public abstract class PizzaStore {

	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);
}
