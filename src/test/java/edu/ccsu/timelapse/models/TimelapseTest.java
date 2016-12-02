package edu.ccsu.timelapse.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TimelapseTest {
	private Timelapse timelapse = new Timelapse();
	@Test
	public void testSetRepeat(){
		timelapse.setRepeat(true);

		assertEquals(timelapse.getRepeat(), true);
	}

	@Test
	public void testGetRepeat(){
		timelapse.setRepeat(false);

		assertEquals(timelapse.getRepeat(), false);
	}

	@Test
	public void testGetFrames(){
		Image image = new Image("testImage.png");

		timelapse.addFrame(image);

		assertTrue(timelapse.getFrames().size()>0);
	}

	@Test
	public void testGetSetHeight(){
		timelapse.setHeight(10);

		assertEquals(timelapse.getHeight(), 10);
	}

	@Test
	public void testGetSetWidth(){
		timelapse.setWidth(10);

		assertEquals(timelapse.getWidth(),10);
	}

	@Test
	public void testHashEquals(){
		Timelapse timelapse2 = timelapse;

		assertEquals(timelapse2.hashCode(),timelapse.hashCode());
	}

	@Test
	public void testHashDifferent(){
		Timelapse timelapse1 = new Timelapse();
		timelapse.setWidth(10);


		assertNotEquals(timelapse1.hashCode(),timelapse.hashCode());
	}

	@Test
	public void testGetSetTimeBetween(){
		timelapse.setTimeBetween(10);

		assertEquals(timelapse.getTimeBetween(),10);
	}
}
