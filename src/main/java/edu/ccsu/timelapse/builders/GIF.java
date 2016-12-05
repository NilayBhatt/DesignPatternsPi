package edu.ccsu.timelapse.builders;

import edu.ccsu.timelapse.imagecollections.ImageComposite;

public interface GIF {

	public GIFMaker from(ImageComposite collection);
	
	public GIFMaker to(String path);
	
	public GIFMaker repeat(boolean repeat);
	
	public GIFMaker height(int height);
	
	public GIFMaker width(int width);
	
	public GIFMaker withDelay(int delay);
	
	public void make();
	
}
