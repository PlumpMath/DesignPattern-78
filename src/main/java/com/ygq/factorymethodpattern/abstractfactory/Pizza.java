package com.ygq.factorymethodpattern.abstractfactory;


/**
 * simple factory
 * @author yao.guoquan
 */
public abstract class Pizza {

	public abstract void prepare();
	
	public void bake() {
		System.out.println("bake...");
	}
	
	public void cut() {
		System.out.println("cut...");
	}
	
	public void box() {
		System.out.println("box...");
	}
	
	public abstract void getDescription();
}
