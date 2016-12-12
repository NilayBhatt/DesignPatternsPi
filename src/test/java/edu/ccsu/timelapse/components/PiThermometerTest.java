package edu.ccsu.timelapse.components;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PiThermometerTest {
    @Test
    public void command() throws Exception {

        PiThermometer piThermometer = new PiThermometer();

        assertEquals(piThermometer.command(), "python ./scripts/temperature.py");

    }

    @Test
    public void temperature() throws Exception {
        if(!System.getProperty("os.name").equals("Linux")) {
            assertEquals(true, true);
        } else {
            PiThermometer piThermometer = new PiThermometer();
            int temp = piThermometer.temperature();

            assertTrue(temp>0);
        }
    }

}