package com.ygq.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
	List menuItem;

	public PancakeHouseMenu() {
		menuItem = new ArrayList();
		addItem("first", "this first", 10);
		addItem("2", "2", 20);
		addItem("3", "3", 30);
		addItem("4", "4", 40);
	}

	public void addItem(String name, String description, double price) {
		menuItem.add(new MenuItem(name, description, price));
	}

	public Iterator createIterator() {
		return new PancakeHouseIterator(menuItem);
	}
	
}
