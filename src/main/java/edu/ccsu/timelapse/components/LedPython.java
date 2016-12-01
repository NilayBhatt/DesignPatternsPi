package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.exceptions.WrongOSException;

import java.io.IOException;

/**
 * This class turns on and off the led on pi using the commandlineAdapter
 * This class is also a concrete implementation of LedOnStrategy
 * and uses native python code adapated from Dexter Industries.
 * Created by Nilay on 11/30/2016.
 */
public class LedPython extends CommandLineAdapter implements LedOnStrategy{

    public void  execute() throws WrongOSException {
        if (! System.getProperty("os.name").equals("Linux")) {
            throw new WrongOSException("Not Linux sorry.");
        }
        String exec = buildCommand();
        try {
            execute(exec);
        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    private String buildCommand(){
        String s;
        s = "sudo python /CS417F16FinalProject-group04/src/main/resources/ledBlink.py";

        return s;

    }
}
