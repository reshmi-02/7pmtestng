package org.test;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.listeners.MyRetryAnalyzer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void fbtitleVerification() {
		Assert.assertEquals(driver.getTitle(), "facebook");
	}
	
	@Test
	public void loginButtonDisplay() {
		boolean displayed = driver.findElement(By.name("login")).isDisplayed();
		Assert.assertEquals(displayed, true);
	}
	
	
	
	public  static void captureScreenShot() throws AWTException, IOException {
Robot r = new Robot();
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(dimension);
		
		BufferedImage screenCapture = r.createScreenCapture(rect);
		
		File dest = new File("./screenShot/facebook"+System.currentTimeMillis()+".png");
		
		ImageIO.write(screenCapture, "png", dest);
	}
	
//	@Test(priority = 1)
//	public void tc01() {
//		Assert.assertEquals(false, false);
//	}
//	
//	@Test(priority = 2)
//	public void tc02() {
//		Assert.assertTrue(false);
//	}
//	
//	
//	@Test(priority = 3,dependsOnMethods = "tc02")
//	public void tc03() {
//		Assert.assertEquals(false, false);
//	}

}

