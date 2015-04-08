package com.ygq.iteratorpattern.advance;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import com.ygq.iteratorpattern.MenuItem;

public class CafeMenu implements Menu {

	private Map<String, MenuItem> items;
	
	public CafeMenu() {
		items = new Hashtable<String, MenuItem>();
		addItem(new MenuItem("first", "this first", 10));
		addItem(new MenuItem("2", "2", 20));
		addItem(new MenuItem("3", "3", 30));
		addItem(new MenuItem("4", "4", 40));
	}
	public Iterator<MenuItem> createIterator() {
		return items.values().iterator();
	}

	public void addItem(MenuItem item) {
		items.put(item.getName(), item);
	}

}
