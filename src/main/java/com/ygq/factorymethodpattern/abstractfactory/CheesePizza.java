package com.ygq.factorymethodpattern.abstractfactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	@Override
	public void getDescription() {
		System.out.println("cheese pizza");
	}

	@Override
	public void prepare() {
		System.out.println("prepare...");
		pizzaIngredientFactory.createDough();
	}

}
