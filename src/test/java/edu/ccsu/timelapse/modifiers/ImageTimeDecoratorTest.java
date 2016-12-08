/**
 * Test Class for ImageTimeDecorator class
 *
 * @author Edmir Alagic, Nilay Bhatt, Lukasz Brodowski, Deepankar Malhan, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.modifiers;

import org.junit.Assert;
import org.junit.Test;

import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

public class ImageTimeDecoratorTest {
	
	@Test
	public void eequals() {
		ImageComponent decorator = new ImageComposite();
		
		ImageTimeDecorator timeDecorator1 = new ImageTimeDecorator(decorator);
		ImageTimeDecorator timeDecorator2 = new ImageTimeDecorator(decorator);
		
		Assert.assertTrue(timeDecorator1.equals(timeDecorator2));
	}
}
