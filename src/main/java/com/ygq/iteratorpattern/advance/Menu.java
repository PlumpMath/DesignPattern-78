package com.ygq.iteratorpattern.advance;

import java.util.Iterator;

import com.ygq.iteratorpattern.MenuItem;

public interface Menu {
	Iterator<MenuItem> createIterator();
	void addItem(MenuItem item);
}
