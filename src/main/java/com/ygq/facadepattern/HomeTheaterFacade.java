package com.ygq.facadepattern;

public class HomeTheaterFacade {
	private Amplifier amplifier;
	private Dvdplayer dvd;
	private PopcornPopper popcoenPopper;
	private Projector projector;
	private Screen screen;
	private TheaterLights lights;
	private Tuner tuner;

	public HomeTheaterFacade(Amplifier amplifier, Dvdplayer dvdPlayer,
			PopcornPopper popcoenPopper, Projector projector, Screen screen,
			TheaterLights lights, Tuner tuner) {
		super();
		this.amplifier = amplifier;
		this.dvd = dvdPlayer;
		this.popcoenPopper = popcoenPopper;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.tuner = tuner;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popcoenPopper.on();
		popcoenPopper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvd);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}

	public void endMovie(String movie) {
		System.out.println("shutting movie theater down...");
		popcoenPopper.off();
		lights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	
}
