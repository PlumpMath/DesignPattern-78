package com.ygq.compositepattern;

public class MenuItem extends MenuComponent {

	private String name;
	private String description;
	private double price;

	public MenuItem(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println(getName());
		System.out.println(getDescription());
		System.out.println(getPrice());
	}
}
