package edu.ccsu.cs417.fall16.group4.main;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Test;

public class ImageTest {

	@Test
	public void testCreatesImageObject() {
		assertTrue(new Image("test.jpg").getName().equals("test.jpg"));
	}
	
	@Test
	public void testHasUniqueHash() {
		Image image1 = new Image("test.jpg");
		Image image2 = new Image("test2.jpg");
		
		assertFalse(image1.hashCode() == image2.hashCode());
	}
	
	@Test
	public void testImageEqualsTrue() {
		Image image1 = new Image("test2.jpg");
		Image image2 = new Image("test2.jpg");
		
		assertTrue(image1.equals(image2));
	}
	
	@Test
	public void testImageEqualsFalse() {
		Image image1 = new Image("test.jpg");
		Image image2 = new Image("test2.jpg");
		
		assertFalse(image1.equals(image2));
	}

}