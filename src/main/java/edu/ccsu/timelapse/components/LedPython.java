package edu.ccsu.timelapse.components;

import java.util.Objects;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * This method is a concrete strategy that turns led on using Python code.
 * This code wraps the python code existing on the RaspberryPi.
 */
public class LedPython extends CommandLineAdapter implements LedOnOffStrategy {

	/**
	 * Public constructor, inputs a led port.
	 * @param ledPort
	 */
	public LedPython(int ledPort) {
		this.ledPort = ledPort;
	}
    /**
     * Port number where the led is attached.
     * Defaulted to 4
     */
    private int ledPort = 4;

    /**
     * Switch to turn led on or off
     * Defaulted to 1 to turn on.s
     */
    private String flip = "1";

    /**
     * Sets the portNumber where the led is attached.
     * @param portNum
     */
    public void setLedPort(int portNum) {
        this.ledPort = portNum;
    }

    /**
     * Gets the led port number.
     * @return led port number
     */
    public int getLedPort() {
        return this.ledPort;
    }

    /**
     * Creates the python command to execute.
     * @return command to be executed in terminal
     */
    @Override
    public String command() {
        return "python ./scripts/ledblink.py " + this.getLedPort() + " " + this.flip;
    }

    /**
     * Turns On the led
     * @throws WrongOSException
     */
    public void turnOn() throws WrongOSException {
        this.flip = "1";

        this.execute();

    }

    /**
     * Turns off the led
     * @throws WrongOSException
     */
    public void turnOff() throws WrongOSException {
        this.flip = "0";

        this.execute();
    }
    
    /**
     * String representation of this object.
     * 
     * @return String
     */
    @Override
	public String toString() {
		return "This is the LedPython.";
	}
	
    /**
     * Hash code of this object.
     * 
     * @return int hashCode
     */
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}
	
	/**
	 * Checks if the two objects are equal.
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof LedPython) && (this.hashCode() != ((LedPython)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
}
