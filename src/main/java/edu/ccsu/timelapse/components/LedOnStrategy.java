package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * This is an interface that demonstrates Strategy pattern
 * to turn led on or off.
 * Created by Nilay on 11/30/2016.
 */
public interface LedOnStrategy {

    void execute() throws WrongOSException;
}
