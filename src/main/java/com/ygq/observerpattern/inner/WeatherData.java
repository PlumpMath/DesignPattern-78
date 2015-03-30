package com.ygq.observerpattern.inner;

import java.util.Observable;

import com.ygq.observerpattern.MeasurementData;

public class WeatherData extends Observable {

	private MeasurementData data;
	
	public WeatherData() {
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		data = new MeasurementData(temp, humidity, pressure);
		measurementsChanged();
	}

	public MeasurementData getData() {
		return data;
	}

	public void setData(MeasurementData data) {
		this.data = data;
	}
}
