package edu.ccsu.timelapse.builders;

import edu.ccsu.gifmaker.AnimatedGifEncoder;
import edu.ccsu.timelapse.imagecollections.ImageComponent;
import edu.ccsu.timelapse.imagecollections.ImageComposite;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * GIFMaker implements GIF interface that creates a GIF
 * by using images in a given directory
 */
public class GIFMaker implements GIF {
	
	private ImageComposite input = null;
	private String output = null;
	private int delay = 0;
	private int height = 0;
	private int width = 0;
	private boolean repeat = false;
	
	/**
	* String representation of this object
	*
	* @return String
	*/
	@Override
	public String toString() {
		return "This is the GIFMaker.";
	}
	
	/**
	 * Hash code of this object
	 * 
	 * @return int hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}
	
	/**
	 * Checks if the two objects are equal
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof GIFMaker) && (this.hashCode() != ((GIFMaker)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
	
	public GIFMaker from(ImageComposite input) {
		this.input = input;
		
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
	
	/**
	 * 
	 * @param repeat
	 * @return
	 */
	public GIFMaker repeat(boolean repeat){
		this.repeat = repeat;
		
		return this;
	}
	
	/**
	 * 
	 * @param width
	 * @return
	 */
	public GIFMaker width(int width){
		this.width = width;
		
		return this;
	}
	
	/**
	 * 
	 * @param height
	 * @return
	 */
	public GIFMaker height(int height){
		this.height = height;
		
		return this;
	}
	
	/**
	 * Returns wether the gif will repeat or not.
	 * @return
	 */
	public boolean isRepeat(){
		
		return this.repeat;
	}
	
	/**
	 * Returns the width of the intended gif.
	 * @return
	 */
	public int getWidth(){
		
		return this.width;
	}
	
	/**
	 * Returns the height of the intended gif.
	 * @return
	 */
	public int getHeight(){
		
		return this.height;
	}
	
	/**
	 * Returns the image composite used to create the gif
	 * @return
	 */
	public ImageComposite getFrom(){
		
		return this.input;
	}
	
	/**
	 * Returns the output path
	 * 
	 * @return output
	 */
	public String getTo(){
		
		return this.output;
	}
	
	
	/**
	 * Simple method to start the creation of a gif.
	 */
	public void make() {
		this.createGIF();
	}
	
	/**
	 * Helper method for <code>make()</code>
	 */
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
		
		for (ImageComponent image : this.input.getElements()) {
            try {
				gif.addFrame(ImageIO.read(new File(image.getImage().getPath())));
			} catch (IOException e) {
				System.err.println("Unable to add image -> " + image.getImage().getPath());
			}
	    }
		
		gif.finish();
		
	}
	
}
