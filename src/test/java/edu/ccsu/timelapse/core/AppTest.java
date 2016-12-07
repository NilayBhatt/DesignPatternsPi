package edu.ccsu.timelapse.core;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Since app is the entry point of the application, hard to test.
 * 
 * Assuming that everything else is tested, App should work since it deligates to our components.
 *
 */
public class AppTest {

	@Test
	public void it_is_a_app() {
		
		App app = new App(null);
		
		assertEquals(app.toString(), "This is the App.");
		
	}
	
}
