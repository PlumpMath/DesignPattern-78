package com.ygq.iteratorpattern;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
	int position;
	List menuItems;

	public PancakeHouseIterator(List menuItems) {
		this.menuItems = menuItems;
	}
	
	public boolean hasNext() {
		return position < menuItems.size();
	}

	public Object next() {
		return menuItems.get(position++);
	}

}
