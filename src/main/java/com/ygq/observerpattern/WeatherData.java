package com.ygq.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	public List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	private MeasurementData data;

	public void registObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		data = new MeasurementData(temp, humidity, pressure);
		measurementsChanged();
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(data);
		}
	}

}
