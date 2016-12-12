/**
 * A representation of a single image taken by a <code>Camera</code> instance.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Nilay Bhatt, Sabahudin Mujcinovic
 */
package edu.ccsu.timelapse.models;

import java.util.Objects;

import edu.ccsu.timelapse.components.DateFormatted;

/**
 * Image is a model to contain data about images that are taken.
 * 
 */
public class Image{ 
	
	/**
	 * Instance of Properties of the image.
	 */
	private Properties properties;

	/**
	 * Create a new instance of an image.
	 * 
	 */
	public Image() {
		this.properties = new Properties();
	}
	
	/**
	 * Set the path of the image.
	 * 
	 * @param path
	 */
	public void setPath(String path) {
		this.properties.setPath(path);
	}
	
	/**
	 * Get the path of the image
	 * 
	 * @return the path
	 */
	public String getPath() {
		
		return this.properties.getPath();
	}

	/**
	 * Setter for the temperature property.
	 * 
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		this.properties.setTemperature(temperature);
	}
	
	/**
	 * Getter for the temperature property.
	 * 
	 * @return temperature
	 */
	public int getTemperature() {
		
		return this.properties.getTemperature();
	}
	
	/**
	 * Get the timestamp of the image
	 * 
	 * @return DateFormatted timestamp
	 */
	public DateFormatted getTimestamp() {
		
		return this.properties.getTimestamp();
	}

	/**
	 * Set the timestamp of the image.
	 * 
	 * @param date
	 */
	public void setTimestamp(DateFormatted date) {
		this.properties.setTimestamp(date);
	}
	

	/**
	 * Returns a string representation of the class.
	 * 
	 * @return string
	 */
	@Override
	public String toString() {
		
		return "An image with a path of \"" + this.getPath() + "\", temperature of: " + this.getTemperature() +
				"and created at: " + this.getTimestamp();
	}
	
	/**
	 * Returns a hash code of the instance of the class.
	 * 
	 * @return int hashCode
	 */
	@Override
	public int hashCode() {
		
		return Objects.hash(this.getPath(), this.getTimestamp(), this.getTemperature());
	}
	
	/**
	 * Returns true if the Image names match.
	 * 
	 * @param image The image to be compared to this instance of Image.
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object image) {
		
		if(!(image instanceof Image)) {
			
			return false;
		}
		
		Image otherImage = (Image) image;
		
		if(this.hashCode() != otherImage.hashCode()) {
			
			return false;
		}
		
		return true;
	}
	
	/**
	 * Properties class for containing Image properties.
	 *
	 */
	private class Properties {
		
		/**
		 * Path of image.
		 */
		private String path;
		
		/**
		 * Temperature of image taken.
		 */
		private int temperature;
		
		/**
		 * Timestamp of the image.
		 */
		private DateFormatted timestamp;

		/**
		 * Get the path of the image.
		 * 
		 * @return path
		 */
		public String getPath() {
			return this.path;
		}

		/**
		 * Set the path of the image.
		 * 
		 * @param path
		 */
		public void setPath(String path) {
			this.path = path;
		}

		/**
		 * Get the temperature of the image.
		 * 
		 * @return temperature 
		 */
		public int getTemperature() {
			return this.temperature;
		}

		/**
		 * Set the temperature of the image.
		 * 
		 * @param temperature
		 */
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}

		/**
		 * Get the created at timestamp.
		 * 
		 * @return DateFormatted
		 */
		public DateFormatted getTimestamp() {
			return this.timestamp;
		}

		/**
		 * Set the timestamp of the image.
		 * 
		 * @param timestamp
		 */
		public void setTimestamp(DateFormatted timestamp) {
			this.timestamp = timestamp;
		}
	}
}
