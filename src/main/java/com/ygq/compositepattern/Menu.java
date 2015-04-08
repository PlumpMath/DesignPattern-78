package com.ygq.compositepattern;

import java.util.ArrayList;
import java.util.List;


public class Menu extends MenuComponent {
	List<MenuComponent> components;
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		components = new ArrayList<MenuComponent>();
	}

	@Override
	public void add(MenuComponent component) {
		components.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		components.remove(component);
	}

	@Override
	public MenuComponent getChild(int i) {
		return components.get(i);
	}

	@Override
	public void print() {
		System.out.println(getName());
		System.out.println(getDescription());
		System.out.println("-----------");
		for (MenuComponent component : components) {
			component.print();
		}
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
}
