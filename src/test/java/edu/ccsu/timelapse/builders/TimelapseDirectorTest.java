package edu.ccsu.timelapse.builders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.ccsu.timelapse.models.Timelapse;
import edu.ccsu.timelapse.imagecollections.*;

public class TimelapseDirectorTest {

	@Test
	public void itConstructsATimelapse() {
		
		TimelapseBuilderInterface builder = new TimelapseBuilder();
		
		TimelapseDirector director = new TimelapseDirector(builder);
		
		ImageComponent emptyList = new ImageComposite("TestTimelaspeDirectorComposite");
		
		Timelapse a = director.construct(emptyList);
		Timelapse b = this.createTimelapse();
		
		assertEquals(a.toString(), b.toString());
		
	}
	
	public Timelapse createTimelapse() {
		Timelapse timelapse = new Timelapse();
		
		timelapse.setWidth(800);
		timelapse.setHeight(600);
		timelapse.setRepeat(true);
		timelapse.setTimeBetween(100);
		
		return timelapse;
	}
	
}
