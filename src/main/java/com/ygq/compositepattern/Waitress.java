package com.ygq.compositepattern;

public class Waitress {

	private MenuComponent components;

	public Waitress(MenuComponent components) {
		this.components = components;
	}

	public void printMenu() {
		components.print();
	}
}
