package com.ygq.iteratorpattern;

public class IteratorTestDrive {

	public static void main(String[] args) {
		DinnerMenu dinner = new DinnerMenu();
		Iterator dinnerIterator = dinner.createIterator();
		output(dinnerIterator);
		PancakeHouseMenu pancake = new PancakeHouseMenu();
		output(pancake.createIterator());
	}

	private static void output(Iterator dinnerIterator) {
		while (dinnerIterator.hasNext()) {
			MenuItem next = (MenuItem) dinnerIterator.next();
			System.out.println(next.getName() + "," + next.getDescription() + ", " + next.getPrice());
		}
	}
}
