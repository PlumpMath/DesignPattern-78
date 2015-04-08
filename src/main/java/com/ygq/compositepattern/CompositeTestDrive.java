package com.ygq.compositepattern;

public class CompositeTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake House", "Breakfase");
		pancakeHouseMenu.add(new MenuItem("1111", "111", 11));
		pancakeHouseMenu.add(new MenuItem("2222", "222", 22));
		MenuComponent dinnerMenu = new Menu("Dinner House", "Dinner");
		dinnerMenu.add(new MenuItem("3333", "333", 33));
		dinnerMenu.add(new MenuItem("4444", "444", 44));

		MenuComponent allMenus = new Menu("All", "all");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
