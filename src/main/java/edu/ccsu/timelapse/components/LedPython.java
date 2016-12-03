package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * This method is a concrete strategy that turns led on using Python code.
 * This code wraps the python code existing on the RaspberryPi.
 */
public class LedPython extends CommandLineAdapter implements LedOnOffStrategy {

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

    private int getLedPort() {
        return this.ledPort;
    }

    /**
     * Creates the python command to execute.
     * @return command to be executed in terminal
     */
    @Override
    protected String command(){
        return "python ./scripts/ledblink.py " + buildOnOffCommand(" " + this.flip);
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
     * Method that creates the command to turn on the led
     * on a specified port and switch.
     * @param s String switch
     * @return String parameters
     */
    private String buildOnOffCommand(String s) {
        String command = new String();
        command += getLedPort();

        command += s;

        return command;
    }
}
