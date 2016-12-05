package edu.ccsu.timelapse.builders;

import edu.ccsu.timelapse.imagecollections.ImageComposite;

/**
 *
 * GIF Interface that helps create a GIF Image
 */
public interface GIF {

	/**
	 * The from method picks up the directory the
	 * images are for gif creation
	 * @param path path of the directory image resides in.
	 * @return GIFMaker
	 */
	public GIFMaker from(ImageComposite collection);

	/**
	 * The destination directory where the final gif will reside.
	 * @param path Directory path
	 * @return GIFMAKER
	 */
	public GIFMaker to(String path);

	/**
	 * Adds the delay between two images.
	 * @param delay int
	 * @return GIFMAKER
	 */
	public GIFMaker withDelay(int delay);
	
	/**
	 * 
	 * @param repeat
	 * @return
	 */
	public GIFMaker repeat(boolean repeat);
	
	/**
	 * 
	 * @param width
	 * @return
	 */
	public GIFMaker width(int width);
	
	/**
	 * 
	 * @param height
	 * @return
	 */
	public GIFMaker height(int height);

	/**
	 * Makes the final GIF Image for the the application.
	 */
	public void make();
	
}
