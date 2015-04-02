package com.ygq.factorymethodpattern.abstractfactory;


public class NYPizzaStore extends PizzaStore {
	private PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

	//抽象工厂方法
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			return new CheesePizza(pizzaIngredientFactory);
		}
		return pizza;
	}
}
