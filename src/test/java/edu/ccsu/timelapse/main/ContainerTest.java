package edu.ccsu.timelapse.main;

import org.junit.Test;

import edu.ccsu.timelapse.components.PiCamera;
import edu.ccsu.timelapse.core.App;
import edu.ccsu.timelapse.event.EventDispatcher;
import edu.ccsu.timelapse.models.Image;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContainerTest {

	@Test
	public void testRun() {
		
//		if (! System.getProperty("os.name").equals("Linux")) {
//			assertEquals(true, true);
//			return;
//		} 
//		
//		App container = new App(new Camera(), new EventDispatcher());
//		ArrayList<Image> images;
//		try {
//			container.run(1);
//			images = container.getImages();
//			assertTrue(!images.isEmpty());
//		} catch (InterruptedException e) {
//			fail("Did not run.");
//			e.printStackTrace();
//		}
	}

}
