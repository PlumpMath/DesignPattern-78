package com.ygq.iteratorpattern;


public class DinnerMenu {

	private static final int MAX_SIZE = 6;
	int numberOfItems = 0;
	MenuItem[] items;

	public DinnerMenu() {
		items = new MenuItem[MAX_SIZE];
		addItem("first", "this first", 10);
		addItem("2", "2", 20);
		addItem("3", "3", 30);
		addItem("4", "4", 40);
		
	}

	public void addItem(String name, String description, double price) {
		if (numberOfItems < MAX_SIZE) {
			items[numberOfItems++] = new MenuItem(name, description, price);
		} else {
			System.out.println("Error: menu is full");
		}
	}

	public Iterator createIterator() {
		return new DinnerMenuIterator(items);
	}


	
}
