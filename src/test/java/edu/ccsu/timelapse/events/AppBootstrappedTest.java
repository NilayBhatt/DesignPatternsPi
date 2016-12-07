package edu.ccsu.timelapse.events;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppBootstrappedTest {
    @Test
    public void toSString() throws Exception {

        AppBootstrapped appBootstrapped = new AppBootstrapped();

        assertEquals(appBootstrapped.toString(),"An event signaling that the application has been bootstrapped.");
    }

}