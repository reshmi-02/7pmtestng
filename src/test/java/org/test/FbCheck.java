package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FbCheck extends BaseClass {

	
	
	@Test
	public void fbtitle() {
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
	}
	
}
