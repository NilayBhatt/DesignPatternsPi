package edu.ccsu.timelapse.factories;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;
import edu.ccsu.timelapse.imagecollections.ImageCollection;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

public class ImageFactoryTest {
	
	@Test
	public void itCollectsNoImages() {
		
		ImageCollection test = ImageCollectionFactory.construct(0.0, 10);
		ArrayList<ImageComposite> temp = test.getElements();
		assertEquals(temp.size(), 0);
		
	}
	
	@Test
	public void itCollectsOneImage() {
		
		ImageCollection test = ImageCollectionFactory.construct(0.00138889, 5);
		ArrayList<ImageComposite> temp = test.getElements();
		assertEquals(temp.size(), 1);
		
	}
	
	@Test
	public void itCollectsManyImages() {
		
		ImageCollection test = ImageCollectionFactory.construct(0.00138889, 1);
		ArrayList<ImageComposite> temp = test.getElements();
		assertEquals(temp.size(), 5);
		
	}
}
