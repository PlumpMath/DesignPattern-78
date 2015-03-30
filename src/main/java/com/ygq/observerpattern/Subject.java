package com.ygq.observerpattern;

public interface Subject {

	void registObserver(Observer o);

	void removeObserver(Observer o);
	
	void notifyObservers();
}
