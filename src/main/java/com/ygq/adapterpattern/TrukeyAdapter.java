package com.ygq.adapterpattern;

public class TrukeyAdapter implements Duck {

	private Turkey turkey;

	public TrukeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	public void quack() {
		this.turkey.gobble();
	}

	public void fly() {
		//because turkey fly shortly
		for (int i = 0; i < 5; i++) {
			this.turkey.fly();
		}
	}

}
