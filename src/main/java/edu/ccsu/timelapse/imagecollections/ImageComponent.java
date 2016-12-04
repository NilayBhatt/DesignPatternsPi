package edu.ccsu.timelapse.imagecollections;

import java.util.Iterator;

import edu.ccsu.timelapse.components.DateFormatted;

public abstract class ImageComponent {
	
	public void addComponent(ImageComponent component) {}
	
	public void removeComponent(ImageComponent component) {}
	
	public Iterator<ImageComponent> iterator() {
		return null;
	}
	
	public abstract void processComponent();
	
	public abstract String getPath();
	
	public abstract int getTemperature();
	
	public abstract DateFormatted getTimestamp();
	
	public abstract ImageComponent setPath(String path);
	
	public abstract ImageComponent setTemperature(int temperature);
	
	public abstract ImageComponent setTimestamp(DateFormatted date);
	

}
