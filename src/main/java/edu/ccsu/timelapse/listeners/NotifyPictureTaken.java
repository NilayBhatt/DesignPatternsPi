package edu.ccsu.timelapse.listeners;

import static edu.ccsu.timelapse.core.Helper.app;

import java.io.IOException;

import com.dexterind.grovepi.sensors.Led;

import edu.ccsu.timelapse.components.Logger;
import edu.ccsu.timelapse.listeners.contracts.GenericListener;

public class NotifyPictureTaken implements GenericListener {

	/**
	 * Instance of the logger.
	 */
	private Logger logger;
	
	private Led led;
	
	/**
	 * Create a new instance of the listener.
	 */
	public NotifyPictureTaken() {
		this.logger = app("logger");
		this.led = app("led");
	}
	
	/**
	 * Handle the event.
	 */
	public void handle() {
		this.logger.success("A picture was taken. SAY CHEESE!");
		
		try {
			this.led.turnOn();
			Thread.sleep(500);
			this.led.turnOff();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
