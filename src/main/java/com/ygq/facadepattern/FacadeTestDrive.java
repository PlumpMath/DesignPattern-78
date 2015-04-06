package com.ygq.facadepattern;

public class FacadeTestDrive {

	public static void main(String[] args) {
		Amplifier amplifier = new Amplifier();
		Dvdplayer dvdPlayer = new Dvdplayer();
		PopcornPopper popcoenPopper = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		Tuner tuner = new Tuner();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(
				amplifier, dvdPlayer, popcoenPopper, projector, screen, lights, tuner);
		homeTheater.watchMovie("tantinic");
		homeTheater.endMovie("tantinic");
	}
}
