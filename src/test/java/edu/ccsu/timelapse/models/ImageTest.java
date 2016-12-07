package edu.ccsu.timelapse.models;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ImageTest {

	@Test
	public void testHasUniqueHash() {
		Image image1 = (Image) new Image();
		image1.setPath("a");
		Image image2 = (Image) new Image();
		image2.setPath("a");
		
		assertTrue(image1.hashCode() == image2.hashCode());
	}
	
	@Test
	public void testImageEqualsTrue() {
		Image image1 = (Image) new Image();
		image1.setPath("a");
		Image image2 = (Image) new Image();
		image2.setPath("a");
		
		assertTrue(image1.equals(image2));
	}
	
	@Test
	public void testImageEqualsFalse() {
		Image image1 = (Image) new Image();
		image1.setPath("a");
		Image image2 = (Image) new Image();
		image2.setPath("b");
		
		assertFalse(image1.equals(image2));
	}

}