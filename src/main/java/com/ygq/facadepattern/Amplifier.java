package com.ygq.facadepattern;


/**
 * 音响
 * @author yao.guoquan
 *
 */
public class Amplifier {

	public void on() {
		System.out.println("amp is working...");
	}

	public void setDvd(Dvdplayer dvd) {
		System.out.println("amp is set a dvd...");
	}

	public void setSurroundSound() {
		System.out.println("amp is set surround sound..");
	}

	public void setVolume(int i) {
		System.out.println("amp's volume is set to " + i);
	}

	public void off() {
		System.out.println("amp is off...");
	}

}
