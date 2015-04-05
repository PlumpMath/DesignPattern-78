package com.ygq.commandpattern.test;

import com.ygq.commandpattern.Command;
import com.ygq.commandpattern.Light;
import com.ygq.commandpattern.LightOnCommand;
import com.ygq.commandpattern.SimpleRemoteController;

public class CommandPatternTestDrive {

	public static void main(String[] args) {
		SimpleRemoteController controller = new SimpleRemoteController();
		Light light = new Light();
		Command command = new LightOnCommand(light );
		controller.setCommand(command );
		controller.buttonWasPressed();
		controller.undoButtonWasPressed();
	}
}
