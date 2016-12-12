package edu.ccsu.timelapse.events;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nilay on 12/7/2016.
 */
public class AppHasStartedTest {
    @Test
    public void toSString() throws Exception {
        AppHasStarted appHasStarted = new AppHasStarted();

        assertEquals(appHasStarted.toString(),"App has started!");
    }

}