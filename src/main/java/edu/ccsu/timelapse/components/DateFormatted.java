package edu.ccsu.timelapse.components;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatted {
	
	private Date date;
	
	public DateFormatted() {
		this.date = new Date();
	}
	
	@Override
	public String toString() {
		
		return new SimpleDateFormat("M-d-y-k-m-s-S").format(this.date);
	}

	
}
