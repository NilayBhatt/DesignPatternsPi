package edu.ccsu.timelapse.components;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * A custom Date wrapper which allows us to display the date across the application in a similar way.
 * 
 * @author Deepankar Malhan, Edmir Alagic, Lukasz Brodowski, Sabahudin Mujcinovic, Nilay Bhatt
 */
public class DateFormatted {
	
	/**
	 * Date that will be initialized (thus creating a timestamp)
	 */
	private Date date;
	
	/**
	 * Initialize a Date to store a timestamp
	 */
	public DateFormatted() {
		this.date = new Date();
	}
	
	/**
	 * String representation of the date stored as the instance variable in a specific format.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		
		return new SimpleDateFormat("M-d-y-k-m-s-S").format(this.date);
	}

	/**
	 * Hash code of this object.
	 * 
	 * @return hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(this.date);
	}
	
	/**
	 * Checks if the two dates are equal or not.
	 * 
	 * @return true if dates are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof DateFormatted)) {
			return false;
		}
		
		DateFormatted otherDate = (DateFormatted) obj;
		
		if(this.hashCode() != otherDate.hashCode()) {
			return false;
		}
		
		return true;
	}
}
