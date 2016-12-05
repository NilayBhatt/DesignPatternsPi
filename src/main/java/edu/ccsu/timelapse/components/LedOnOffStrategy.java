package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * This is an interface that demonstrates Strategy pattern to turn led on or
 * off.
 * 
 */
public interface LedOnOffStrategy {

	void turnOn() throws WrongOSException;

	void turnOff() throws WrongOSException;
}
