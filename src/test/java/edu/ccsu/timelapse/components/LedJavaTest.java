package edu.ccsu.timelapse.components;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;


public class LedJavaTest {

    @Test
    public void turnOn() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava(4);
            ledJava.turnOn();

            assertTrue(ledJava.isLedSet());

            ledJava.turnOff();
        }
    }

    @Test
    public void turnOff() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava(4);
            ledJava.turnOff();

            assertTrue(!ledJava.isLedSet());
        }
    }

    @Test
    public void isLedSet() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava(4);
            ledJava.turnOn();

            assertTrue(ledJava.isLedSet());

            ledJava.turnOff();
        }
    }

    @Test
    public void equals() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava(4);
            LedJava ledJava1 = new LedJava(4);

            assertTrue(ledJava.equals(ledJava1));
        }
    }

    @Test
    public void testHashCode() throws Exception {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava(2);
            LedJava ledJava1 = new LedJava(2);

            assertEquals(ledJava.hashCode(), ledJava1.hashCode());
        }
    }

    @Test
    public void toSString() {
        if (!System.getProperty("os.name").equals("Linux")) {
            Assert.assertEquals(true, true);
        } else {
            LedJava ledJava = new LedJava(2);

            assertEquals(ledJava.toString(), "This is the LedJava.");
        }
    }

}