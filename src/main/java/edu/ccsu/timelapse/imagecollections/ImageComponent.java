package edu.ccsu.timelapse.imagecollections;

import java.util.Iterator;

public abstract class ImageComponent {
	
	public void addComponent(ImageComponent component) {}
	
	public void removeComponent(ImageComponent component) {}
	
	public Iterator<ImageComponent> iterator() {
		return null;
	}
	
	public abstract void processComponent();
}
