package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver ;
	
	@Parameters({"browsername","url"})
	@BeforeTest
	public void setup(String browser,String url) {
		
		switch(browser) {
		
		case "chrome" :
			driver = new ChromeDriver();
			driver.get(url);
			break;
		
		case "firefox" :
			driver = new FirefoxDriver();
			driver.get(url);
			break;
			
		case "edge" :
			driver = new EdgeDriver();
			driver.get(url);
			break;
			
		default:
			System.out.println("Enter the valid browser name");
		
		}
		
		
		
		
	}
	
	
	@Test
	public void  verifyPageTitle() {
		
		Assert.assertEquals(driver.getTitle(), "Google");
		
		
	}
	
	
}
