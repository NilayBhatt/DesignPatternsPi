package edu.ccsu.timelapse.builders;

public interface GIF {

	public GIFMaker from(String path);
	
	public GIFMaker to(String path);
	
	public GIFMaker withDelay(int delay);
	
	public void make();
	
}
