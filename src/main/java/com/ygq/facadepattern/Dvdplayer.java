package com.ygq.facadepattern;

public class Dvdplayer {

	public void on() {
		System.out.println("div is working...");
	}

	public void play(String movie) {
		System.out.println(movie + "is starting...");
	}

	public void stop() {
		System.out.println("dvd is stoping...");
	}

	public void eject() {
		System.out.println("dvd is ejecting...");
	}

	public void off() {
		System.out.println("dvd is off...");
	}

}
