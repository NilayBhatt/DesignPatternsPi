package edu.ccsu.timelapse.builders;

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
	public GIFMaker from(String path);

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
	 * Makes the final GIF Image for the the application.
	 */
	public void make();
	
}
