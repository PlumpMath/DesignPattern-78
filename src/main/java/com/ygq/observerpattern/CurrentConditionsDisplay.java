package com.ygq.observerpattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private float temperate;
	private float humidity;
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registObserver(this);
	}
	public void display() {
		System.out.println("Current conditions: " + temperate + "F degerees and"
				+ humidity + "% humidity");
	}

	public void update(MeasurementData data) {
		this.temperate = data.getTemperature();
		this.humidity = data.getHumidity();
		display();
	}


}
