package edu.ccsu.timelapse.modifiers;

import org.junit.Assert;
import org.junit.Test;

import edu.ccsu.timelapse.imagecollections.ConcreteImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;
import edu.ccsu.timelapse.models.Image;

public class ImageDecoratorTest {

	
	@Test
	public void getImage() {
		Image testImage = new Image();
		ImageComponent toBeDecorated = new ConcreteImageComponent();
		ImageDecorator imageDecorator = new ImageTimeDecorator(toBeDecorated);
		
		Assert.assertEquals(testImage, imageDecorator.getImage());
	}
	
	@Test
	public void toSString() throws Exception {
		ImageComponent toBeDecorated = new ImageComposite();
		ImageDecorator imageDecorator = new ImageTimeDecorator(toBeDecorated);
		
		Assert.assertEquals(imageDecorator.toString(), "");
	}
	
	@Test
	public void hashCCode() {
		ImageDecorator imageDecorator1 = new ImageTimeDecorator(new ConcreteImageComponent());
		ImageDecorator imageDecorator2 = new ImageTimeDecorator(new ConcreteImageComponent());
		
		
		Assert.assertEquals(imageDecorator1.hashCode(), imageDecorator2.hashCode());
	}
	
	@Test
	public void eequals() {
		ImageDecorator imageDecorator1 = new ImageTimeDecorator(new ConcreteImageComponent());
		ImageDecorator imageDecorator2 = new ImageTimeDecorator(new ConcreteImageComponent());
		
		
		Assert.assertTrue(imageDecorator1.equals(imageDecorator2));
	}
}
