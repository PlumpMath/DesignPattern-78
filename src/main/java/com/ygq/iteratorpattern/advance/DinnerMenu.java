package com.ygq.iteratorpattern.advance;

import java.util.Iterator;

import com.ygq.iteratorpattern.MenuItem;


public class DinnerMenu implements Menu {

	private static final int MAX_SIZE = 6;
	int numberOfItems = 0;
	MenuItem[] items;

	public DinnerMenu() {
		items = new MenuItem[MAX_SIZE];
		addItem(new MenuItem("first", "this first", 10));
		addItem(new MenuItem("2", "2", 20));
		addItem(new MenuItem("3", "3", 30));
		addItem(new MenuItem("4", "4", 40));
		
	}

	public void addItem(String name, String description, double price) {
		
	}

	public Iterator<MenuItem> createIterator() {
		return new DinnerMenuIterator();
	}

	public void addItem(MenuItem item) {
		if (numberOfItems < MAX_SIZE) {
			items[numberOfItems++] = item;
		} else {
			System.out.println("Error: menu is full");
		}
	}

	class DinnerMenuIterator implements Iterator<MenuItem> {

		public boolean hasNext() {
			return numberOfItems < items.length && null != items[numberOfItems];
		}

		public MenuItem next() {
			return items[numberOfItems];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
}
