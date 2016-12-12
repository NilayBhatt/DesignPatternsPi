/**
 * Test Class for ImageHueDecorator class
 *
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.modifiers;

import org.junit.Test;

import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;
import org.junit.Assert;

public class ImageHueDecoratorTest {
	
	@Test
	public void eequals() {
		ImageComponent decorator = new ImageComposite();
		
		ImageHueDecorator hueDecorator1 = new ImageHueDecorator(decorator);
		ImageHueDecorator hueDecorator2 = new ImageHueDecorator(decorator);
		
		Assert.assertTrue(hueDecorator1.equals(hueDecorator2));
	}
}