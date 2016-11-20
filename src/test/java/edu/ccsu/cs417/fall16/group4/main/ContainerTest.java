package edu.ccsu.cs417.fall16.group4.main;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContainerTest {

	@Test
	public void testRun() {
		
		if (! System.getProperty("os.name").equals("Linux")) {
			assertEquals(true, true);
			return;
		} 
		
		Container container = new Container();
		ArrayList<Image> images;
		try {
			container.run(1);
			images = container.getImages();
			assertTrue(!images.isEmpty());
		} catch (InterruptedException e) {
			fail("Did not run.");
			e.printStackTrace();
		}
	}

}
