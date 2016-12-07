package edu.ccsu.timelapse.listeners;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 12/7/2016.
 */
public class NotifyItStartedTest {
    @Test
    public void toSString() throws Exception {
        NotifyItStarted notifyItStarted = new NotifyItStarted();

        assertEquals(notifyItStarted.toString(),"This is NotifyItStarted.");
    }

    @Test
    public void hashCCode() throws Exception {
        NotifyItStarted notifyItStarted = new NotifyItStarted();
        NotifyItStarted notifyItStarted2 = new NotifyItStarted();

        assertEquals(notifyItStarted.hashCode(),notifyItStarted2.hashCode());
    }

    @Test
    public void equals() throws Exception {
        NotifyItStarted notifyItStarted = new NotifyItStarted();
        NotifyItStarted notifyItStarted2 = new NotifyItStarted();

        assertTrue(notifyItStarted.equals(notifyItStarted2));
    }

}