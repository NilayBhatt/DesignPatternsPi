package edu.ccsu.timelapse.builders;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

public class GIFMakerTest {

	@Test
	public void itSetsProperties() {
		GIFMaker temp = new GIFMaker();
		ImageComposite comp = new ImageComposite();
		String to = "./images/test.gif";
		
		temp.from(comp).to(to).height(10).width(10).repeat(true);
		
		assertTrue(temp.getFrom().equals(comp));
		assertEquals(temp.getTo(), to);
		assertEquals(temp.getHeight(), 10);
		assertEquals(temp.getWidth(), 10);
		assertTrue(temp.isRepeat());
	}
}
