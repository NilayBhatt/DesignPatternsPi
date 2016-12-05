package edu.ccsu.timelapse.builders;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import edu.ccsu.gifmaker.AnimatedGifEncoder;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

public class GIFMaker implements GIF {
	
	private ImageComposite collection = null;
	private String output = null;
	private int delay = 0;
	private int height = 1080;
	private int width = 1920;
	private boolean repeat = false;
	
	
	public GIFMaker from(ImageComposite collection) {
		this.collection = collection;
		
		return this;
	}
	
	public GIFMaker to(String path) {
		this.output = path;
		
		return this;
	}
	
	public GIFMaker withDelay(int delay) {
		this.delay = delay;
		
		return this;
	}
	
	public GIFMaker repeat(boolean repeat){
		this.repeat = repeat;
		
		return this;
	}
	
	public GIFMaker width(int width){
		this.width = width;
		
		return this;
	}
	
	public GIFMaker height(int height){
		this.height = height;
		
		return this;
	}
	
	public void make() {
		this.createGIF();
	}
	
	protected void createGIF(){
		
		AnimatedGifEncoder gif = new AnimatedGifEncoder();
		gif.start(this.output);
		
		if(this.repeat){
			gif.setRepeat(0);
		} else {
			gif.setRepeat(1);
		}
		gif.setDelay(this.delay);
		gif.setSize(this.width, this.height);
		
		for (ImageComponent image : collection.getElements()) {
            try {
				gif.addFrame(ImageIO.read(new File(image.getImage().getPath())));
			} catch (IOException e) {
				System.err.println("Unable to add image -> " + image.toString());
			}
	    }
		
		gif.finish();
		
	}
	
}
