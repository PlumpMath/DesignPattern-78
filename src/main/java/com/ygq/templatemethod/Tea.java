package com.ygq.templatemethod;

public class Tea extends CaffeineBeverage {

	private boolean isAddingCondiments = true;;
	@Override
	void brew() {
		System.out.println("brewing tea...");
	}

	@Override
	void addCondiments() {
		System.out.println("adding Lemon...");
	}

	@Override
	protected boolean customerWantsCondiments() {
		return isAddingCondiments;
	}

	public void setAddingCondiments(boolean isAddingCondiments) {
		this.isAddingCondiments = isAddingCondiments;
	}

	
}
