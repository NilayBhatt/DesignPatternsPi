package edu.ccsu.timelapse.listeners;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 12/7/2016.
 */
public class NotifyItBootstrappedTest {
    @Test
    public void toSString() throws Exception {
        NotifyItBootstrapped notifyItBootstrapped = new NotifyItBootstrapped();

        assertEquals(notifyItBootstrapped.toString(), "This is NotifyItBootstrapped.");
    }

    @Test
    public void hashCCode() throws Exception {
        NotifyItBootstrapped notifyItBootstrapped = new NotifyItBootstrapped();
        NotifyItBootstrapped notifyItBootstrapped2 = new NotifyItBootstrapped();

        assertEquals(notifyItBootstrapped.hashCode(),notifyItBootstrapped.hashCode());
    }

    @Test
    public void equals() throws Exception {
        NotifyItBootstrapped notifyItBootstrapped = new NotifyItBootstrapped();
        NotifyItBootstrapped notifyItBootstrapped2 = new NotifyItBootstrapped();

        assertTrue(notifyItBootstrapped.equals(notifyItBootstrapped2));
    }

}