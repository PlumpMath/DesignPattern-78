package com.ygq.factorymethodpattern.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new Dough();
	}

}
