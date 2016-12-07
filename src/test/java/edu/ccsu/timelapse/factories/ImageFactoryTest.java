package edu.ccsu.timelapse.factories;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.ccsu.timelapse.components.DateFormatted;
import edu.ccsu.timelapse.imagecollections.ImageComponent;

public class ImageFactoryTest {
	
	@Test
	public void itCreatesAComponent(){
		ImageFactory temp = new ImageFactory();
		String path = "somePAth";
		int temperature = 34;
		DateFormatted date = new DateFormatted();
		
		ImageComponent img = temp.make(path, temperature, date);
		
		assertEquals(img.getImage().getPath(), path);
		assertEquals(img.getImage().getTemperature(), temperature);
		assertEquals(img.getImage().getTimestamp(), date);
	}
}
