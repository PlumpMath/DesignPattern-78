package com.ygq.observerpattern.inner;

import java.util.Observer;

public class ObservableInnerTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(10, 50, 80);
	}
}
