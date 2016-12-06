package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * This is an interface that demonstrates Strategy pattern to turn led on or
 * off.
 * 
 */
public interface LedOnOffStrategy {

	/**
	 * Turns on the LED on a specified port.
	 * @throws WrongOSException
	 */
	void turnOn() throws WrongOSException;

	/**
	 * Turns off the LED on a specified port.
	 * @throws WrongOSException
	 */
	void turnOff() throws WrongOSException;
}
