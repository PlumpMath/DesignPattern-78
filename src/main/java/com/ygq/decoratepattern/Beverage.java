package com.ygq.decoratepattern;

public abstract class Beverage {

	String description = "Unkonwn Beverage";
	
	public String getDescritpion() {
		return description;
	}
	
	public abstract double cost();
}
