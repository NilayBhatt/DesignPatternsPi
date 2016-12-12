package edu.ccsu.timelapse.components;

import org.junit.Assert;
import org.junit.Test;

public class DateFormattedTest {

	@Test
	public void toSString() throws Exception {
		DateFormatted dateFormatted = new DateFormatted();
		dateFormatted.setDate("12-7-2016-20-45-55-550");
		Assert.assertEquals(dateFormatted.toString(), "12-7-2016-20-45-55-550");
	}
	
	@Test
	public void hashCCode() {
		DateFormatted dateFormatted = new DateFormatted();
		dateFormatted.setDate("12-7-2016-20-45-55-550");
		
		DateFormatted dateFormatted2 = new DateFormatted();
		dateFormatted2.setDate("12-7-2016-20-45-55-550");
		
		Assert.assertEquals(dateFormatted.hashCode(), dateFormatted2.hashCode());
	}
	
	@Test
	public void eequals() {
		DateFormatted dateFormatted = new DateFormatted();
		dateFormatted.setDate("12-7-2016-20-45-55-550");
		
		DateFormatted dateFormatted2 = new DateFormatted();
		dateFormatted2.setDate("12-7-2016-20-45-55-550");
		
		Assert.assertTrue(dateFormatted.equals(dateFormatted2));
	}
}
