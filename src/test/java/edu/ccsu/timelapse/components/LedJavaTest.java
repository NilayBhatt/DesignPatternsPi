package edu.ccsu.timelapse.components;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 12/1/2016.
 */
public class LedJavaTest {
    @Test
    public void execute() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava();
            ledJava.execute();

            assertTrue(ledJava.isLedSet());

            ledJava.unexecute();
        }
    }

    @Test
    public void unexecute() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava();
            ledJava.unexecute();

            assertTrue(!ledJava.isLedSet());
        }
    }

    @Test
    public void isLedSet() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava();
            ledJava.execute();

            assertTrue(ledJava.isLedSet());

            ledJava.unexecute();
        }
    }

    @Test
    public void equals() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava();
            LedJava ledJava1 = new LedJava();

            assertTrue(ledJava.equals(ledJava1));
        }
    }

    @Test
    public void testHashCode() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava();
            LedJava ledJava1 = new LedJava();

            assertEquals(ledJava.hashCode(), ledJava1.hashCode());
        }
    }

}