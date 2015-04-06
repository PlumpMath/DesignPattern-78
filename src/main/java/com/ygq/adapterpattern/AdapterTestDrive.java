package com.ygq.adapterpattern;

public class AdapterTestDrive {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duck duck = new TrukeyAdapter(turkey );
		duck.fly();
		duck.quack();
	}
}
