package robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

public class RobotSample {

@Test	
	public void rMethod() throws Exception {
		
		String command="notepad.exe";
		Runtime run = Runtime.getRuntime();
		run.exec(command);
		Thread.sleep(3000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_Y);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);

		
		
	}
	
	
	
	
	
}
