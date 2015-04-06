package com.ygq.templatemethod;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		//hook
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	protected boolean customerWantsCondiments() {
		return true;
	}

	private void boilWater() {
		System.out.println("boiling water...");
	}

	abstract void brew();

	private void pourInCup() {
		System.out.println("pour in cup...");
	}

	abstract void addCondiments();
}
