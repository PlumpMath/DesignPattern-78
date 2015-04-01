package com.ygq.factorymethodpattern;

public class SimplePizzaFactory {

	//简单工厂方法
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			return new CheesePizza();
		} else if (type.equals("clam")) {
			return new ClamPizza();
		} else if (type.equals("veggie")) {
			return new VeggiePizza();
		}
		return pizza;
	}
}
