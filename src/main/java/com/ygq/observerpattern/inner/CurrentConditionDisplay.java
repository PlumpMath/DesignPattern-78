package com.ygq.observerpattern.inner;

import java.util.Observable;
import java.util.Observer;

import com.ygq.observerpattern.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private Observable observable;
	private float temperate;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperate + "F degerees and"
				+ humidity + "% humidity");
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.temperate = data.getData().getTemperature();
			this.humidity = data.getData().getHumidity();
		}
		display();
	}

}
