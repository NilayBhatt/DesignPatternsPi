package edu.ccsu.timelapse.components;

import java.util.Objects;

import edu.ccsu.timelapse.adapters.CommandLineAdapter;
import edu.ccsu.timelapse.components.contracts.Camera;
import edu.ccsu.timelapse.exceptions.WrongOSException;

/**
 * Camera that takes pictures.
 * 
 */
public class PiCamera extends CommandLineAdapter implements Camera {
	
	/**
	 * Cached string used for taking picture.
	 */
	public DateFormatted timestamp;

	@Override
	public String command() {

		return "python ./scripts/camera.py ./images/" + this.fileName();
	}

	public String snap() {

		if (! System.getProperty("os.name").equals("Linux")) {
			try {
				throw new WrongOSException("Not Linux sorry.");
			} catch (WrongOSException e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}
		
		this.timestamp = new DateFormatted();
		
		this.execute();
		
		return "./images/" + this.fileName();
	}
	
	/**
	 * Build unique path for file name for adaptor.
	 * 
	 * @return the name 
	 */
	private String fileName() {
		return this.timestamp.toString() + ".jpeg";
	}

	public DateFormatted getTimestamp() {
		return this.timestamp;
	}
	
	/**
	 * String representation of Camera.
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "A camera component.";
	}
	
	/**
	 * Hash code of this object.
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
		if(!(obj instanceof PiCamera) && (this.hashCode() != ((PiCamera)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
}
