package com.ygq.iteratorpattern.advance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ygq.iteratorpattern.MenuItem;

public class PancakeHouseMenu implements Menu {
	List<MenuItem> menuItem;

	public PancakeHouseMenu() {
		menuItem = new ArrayList<MenuItem>();
		addItem(new MenuItem("first", "this first", 10));
		addItem(new MenuItem("2", "2", 20));
		addItem(new MenuItem("3", "3", 30));
		addItem(new MenuItem("4", "4", 40));
	}

	public Iterator<MenuItem> createIterator() {
		return menuItem.iterator();
	}

	public void addItem(MenuItem item) {
		menuItem.add(item);
	}
	
}
