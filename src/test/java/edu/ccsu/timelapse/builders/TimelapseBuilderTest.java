package edu.ccsu.timelapse.builders;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ccsu.timelapse.models.Timelapse;

public class TimelapseBuilderTest {

	@Test
	public void itHasAWidth() {
		TimelapseBuilder builder = new TimelapseBuilder();
		
		builder.setWidth(800);
		
		Timelapse timelapse = builder.getResult();
		
		assertEquals(timelapse.getWidth(), 800);
		
	}
	
	@Test
	public void itHasAHeight() {
		TimelapseBuilder builder = new TimelapseBuilder();
		
		builder.setHeight(600);
		
		Timelapse timelapse = builder.getResult();
		
		assertEquals(timelapse.getHeight(), 600);
		
	}
	
	@Test
	public void itHasARepeat() {
		TimelapseBuilder builder = new TimelapseBuilder();
		
		builder.setRepeat(true);
		
		Timelapse timelapse = builder.getResult();
		
		assertEquals(timelapse.getRepeat(), true);
		
	}
	
	@Test
	public void itHasATimeBetween() {
		TimelapseBuilder builder = new TimelapseBuilder();
		
		builder.setTimeBetween(100);
		
		Timelapse timelapse = builder.getResult();
		
		assertEquals(timelapse.getTimeBetween(), 100);
		
	}
	
//	@Test
//	public void itHasAFrame() {
//		TimelapseBuilder builder = new TimelapseBuilder();
//		
//		Image image = new Image("test");
//		
//		builder.addFrame(image);
//		
//		Timelapse timelapse = builder.getResult();
//		
//		assertEquals(timelapse.getFrames().size(), 1);
//		
//	}
	
	
}
