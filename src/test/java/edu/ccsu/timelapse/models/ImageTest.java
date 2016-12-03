package edu.ccsu.timelapse.models;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ccsu.timelapse.models.Image;

public class ImageTest {

	@Test
	public void testHasUniqueHash() {
		Image image1 = (Image) new Image().setPath("a");
		Image image2 = (Image) new Image().setPath("a");
		
		assertFalse(image1.hashCode() == image2.hashCode());
	}
	
	@Test
	public void testImageEqualsTrue() {
		Image image1 = (Image) new Image().setPath("a");
		Image image2 = (Image) new Image().setPath("a");
		
		assertTrue(image1.equals(image2));
	}
	
	@Test
	public void testImageEqualsFalse() {
		Image image1 = (Image) new Image().setPath("a");
		Image image2 = (Image) new Image().setPath("a");
		
		assertFalse(image1.equals(image2));
	}

}