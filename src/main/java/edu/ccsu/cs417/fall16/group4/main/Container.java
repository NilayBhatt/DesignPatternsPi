/**
 * Container class contains a Camera instance and multiple images inside the container.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.cs417.fall16.group4.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Container {
	
	private ArrayList<Image> images;
	
	private Camera camera;
	
	/**
	 * Instantiates a new camera when a new container is constructed. Images list is empty initially for this container.
	 */
	public Container() {
		this.camera = new Camera();
	}
	
	/**
	 * This method takes the pictures <code>times</code> many times.
	 * 
	 * @param times Number of pictures to be taken
	 * @throws InterruptedException Any exception thrown during taking <code>times</code> many pictures.
	 */
	public void run(int times) throws InterruptedException {
		for (int i = 0; i < times; i++) {
			this.takePicture();
			Thread.sleep(1000);
		}
	}
	
	/**
	 * Helper method for <code>run()</code> to take one picture and name the picture the timestamp of when the image is created.
	 */
	private void takePicture() {
		Date date = new Date();
		
		try {
			Image picture = this.camera.takePicture(date.toString());
			images.add(picture);
		} catch (CannotTakePictureException e) {
			e.printStackTrace();
		} catch (WrongOSException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Get the ArrayList of Images in this container.
	 * 
	 * @return images
	 */
	public ArrayList<Image> getImages() {
		
		return this.images;
	}
	
	/**
	 * String representation of the container.
	 */
	@Override
	public String toString() {
		String output = "";
		for (Image image : images) {
			output += image.getName() + " ";
		}
		
		return output;
	}
	
	/**
	 * Hash of this container is the hash of the images ArrayList
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.images);
	}
	/**
	 * Returns true if the obj being compared containes images, i.e., both have same states.
	 */
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Container)) {
			
			return false;
		}
		
		Container a = (Container) obj;
		
		for (Image image : this.images) {
			if (! a.getImages().contains(image)) {
				return false;
			}
		}
		
		return true;
	}


}
