package com.ygq.commandpattern;

public class SimpleRemoteController {
	Command slot;


	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonWasPressed() {
		this.slot.execute();
	}
	
	public void undoButtonWasPressed() {
		this.slot.undo();
	}
}
