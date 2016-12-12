package edu.ccsu.timelapse.factories;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

public class ImageCollectionFactoryTest {

	@Test
	public void itCreatesACollection(){
		ImageCollectionFactory temp = new ImageCollectionFactory();
		
		ImageComposite comp = temp.make(1, 1);
		
		assertEquals(comp.getElements().size(), 1);
	}
}
