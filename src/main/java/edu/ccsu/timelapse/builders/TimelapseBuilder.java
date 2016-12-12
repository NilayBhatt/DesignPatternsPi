package edu.ccsu.timelapse.builders;

import edu.ccsu.timelapse.models.Timelapse;

import java.util.Objects;

import edu.ccsu.timelapse.imagecollections.ImageComponent;

/**
 * Implementation of a concrete Timelapse builder.
 *
 */
public class TimelapseBuilder implements TimelapseBuilderInterface {
	
	/**
	 * The timelapse being built.
	 */
	private Timelapse timelapse;
	
	/**
	 * Create a new instance of a timelapse builder.
	 */
	public TimelapseBuilder() {
		this.timelapse = new Timelapse();
	}

	public TimelapseBuilderInterface addFrame(ImageComponent image) {
		this.timelapse.addFrame(image);
		
		return this;
	}


	public TimelapseBuilderInterface setTimeBetween(int time) {
		this.timelapse.setTimeBetween(time);
		
		return this;
	}

	public TimelapseBuilderInterface setRepeat(boolean repeat) {
		this.timelapse.setRepeat(repeat);
		
		return this;
	}

	public TimelapseBuilderInterface setWidth(int width) {
		this.timelapse.setWidth(width);
		
		return this;
	}

	public TimelapseBuilderInterface setHeight(int height) {
		this.timelapse.setHeight(height);
		
		return this;
	}

	public Timelapse getResult() {

		return this.timelapse;
	}
	
	/**
	 * String representation of this object.
	 * 
	 * @return string
	 */
	@Override
	public String toString() {
		return "This is the TimelapseBuilder.";
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
	 * Checks if the two objects are equal.
	 * 
	 * @return true if equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TimelapseBuilder) && (this.hashCode() != ((TimelapseBuilder)obj).hashCode())) {
			return false;
		}
		
		return true;
	}
	
}
