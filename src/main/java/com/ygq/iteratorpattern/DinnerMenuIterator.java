package com.ygq.iteratorpattern;

public class DinnerMenuIterator implements Iterator {

	int position;
	MenuItem[] items;

	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		return position < items.length && null != items[position];
	}

	public Object next() {
		return items[position++];
	}
}
