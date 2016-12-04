package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * This is an interface that demonstrates Strategy pattern to turn led on or
 * off.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt,
 *         Sabahudin Mujcinovic
 */
public interface LedOnOffStrategy {

	void turnOn() throws WrongOSException;

	void turnOff() throws WrongOSException;
}
