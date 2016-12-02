package edu.ccsu.timelapse.components;

import edu.ccsu.timelapse.exceptions.WrongOSException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 12/1/2016.
 */
public class LedPythonTest {
    @Test
    public void execute() throws Exception {
        LedPython ledPython = new LedPython();
        try{
            ledPython.execute();
        } catch (WrongOSException e) {
            if(System.getProperty("os.name").equals("Linux"))
                assertEquals(false,true);
        }
        assertTrue(true);

    }

}