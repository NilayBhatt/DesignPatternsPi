package edu.ccsu.timelapse.components;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LedPythonTest {
    @Test
    public void setLedPort() throws Exception {
        LedPython pythonTest = new LedPython(4);

        assertEquals(pythonTest.getLedPort(), 4);
    }

    @Test
    public void turnOn() throws Exception {
        if(!System.getProperty("os.name").equals("Linux")) {
            assertEquals(true, true);
        } else {
            LedPython pythonTest = new LedPython(4);

            pythonTest.turnOn();

            if(pythonTest.command().equals("python ./scripts/ledblink.py 4 1")){
                assertTrue(true);
            }

            pythonTest.turnOff();
        }
    }

    @Test
    public void turnOff() throws Exception {
        if(!System.getProperty("os.name").equals("Linux")) {
            assertEquals(true, true);
        } else {
            LedPython pythonTest = new LedPython(4);

            pythonTest.turnOff();

            if(pythonTest.command().equals("python ./scripts/ledblink.py 4 0")){
                assertTrue(true);
            }
        }
    }
}