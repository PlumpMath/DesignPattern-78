package com.ygq.observerpattern;

public class ObserverTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(50, 20, 30);
		weatherData.setMeasurements(200, 10, 10);
	}
}
