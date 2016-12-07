package edu.ccsu.timelapse.listeners;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nilay on 12/7/2016.
 */
public class NotifyPictureTakenTest {
    @Test
    public void toSString() throws Exception {
        NotifyPictureTaken notifyPictureTaken = new NotifyPictureTaken();

        assertEquals(notifyPictureTaken.toString(),"This is NotifyPictureTaken.");
    }

    @Test
    public void hashCCode() throws Exception {
        NotifyPictureTaken notifyPictureTaken = new NotifyPictureTaken();
        NotifyPictureTaken notifyPictureTaken1 = new NotifyPictureTaken();

        assertEquals(notifyPictureTaken.hashCode(), notifyPictureTaken.hashCode());
    }

    @Test
    public void equals() throws Exception {
        NotifyPictureTaken notifyPictureTaken = new NotifyPictureTaken();
        NotifyPictureTaken notifyPictureTaken1 = new NotifyPictureTaken();

        assertTrue(notifyPictureTaken.equals(notifyPictureTaken1));
    }

}