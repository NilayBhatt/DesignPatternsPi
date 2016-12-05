package edu.ccsu.timelapse.builders;

import edu.ccsu.gifmaker.AnimatedGifEncoder;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * GIFMaker implements GIF interface that creates a GIF
 * by using images in a given directory
 */
public class GIFMaker implements GIF {
	
	private String input = null;
	private String output = null;
	private int delay = 0;
	
	public GIFMaker from(String path) {
		this.input = path;
		
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
	
	public void make() {
		this.createGIF();
	}
	
	protected void createGIF(){
		
		AnimatedGifEncoder gif = new AnimatedGifEncoder();
		gif.start(this.output);
		gif.setRepeat(0);
		gif.setDelay(this.delay);
		gif.setSize(1920, 1080);
		
		File dir = new File(this.input);
		
		for (File file : dir.listFiles()) {
            try {
				gif.addFrame(ImageIO.read(new File(this.input + "/" + file.getName())));
			} catch (IOException e) {
				System.err.println("Unable to add image -> " + file.getName());
			}
	    }
		
		gif.finish();
		
	}
	
	
}
