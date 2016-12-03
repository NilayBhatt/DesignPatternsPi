package edu.ccsu.timelapse.components;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateFormatted {
	
	private static DateFormatted dateFormatted = null;
	
	private DateFormatted() {}
	
	public static DateFormatted getInstance() {
		if(dateFormatted == null) {
			dateFormatted = new DateFormatted();
		}
		
		return dateFormatted;
	}
	
	public String formatDate(Date toBeFormatted) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd,MMM,YYYY EEE hh:mm:ss:SSS aaa");
		return dateFormat.format(toBeFormatted);
	}
}
