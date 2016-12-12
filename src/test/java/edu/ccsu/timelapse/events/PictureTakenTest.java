package edu.ccsu.timelapse.events;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nilay on 12/7/2016.
 */
public class PictureTakenTest {
    @Test
    public void toSString() throws Exception {
        PictureTaken pictureTaken = new PictureTaken();

        assertEquals(pictureTaken.toString(),"This is PictureTaken.");
    }

}