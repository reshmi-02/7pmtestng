package org.report;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GoogleExtendReport {

	ExtentReports extent ;
	WebDriver driver ;
	
	@BeforeTest
	public void extendReportSetup() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+
				"\\report\\extendReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
	}
	
	
	@BeforeMethod
	public void browserSetup() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
	}
	
	
	@Test
	public void checkTitle() {
		
		 ExtentTest test = extent.createTest("Checking the google title");
		 
		@Nullable
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
		  
		   test.pass("title matched successfully");
		   
		}
		else {
			test.fail("Title didn't get matche");
		}
		
	}
	
	
	@Test
	public void checkAboutLink() throws AWTException, IOException {
		
		 ExtentTest test = extent.createTest("Testing the about link");
		
		try {
			driver.findElement(By.linkText("Gma")).click();
			
		}
		catch(Exception e) {
			
			test.fail(e.getMessage());
			
			test.addScreenCaptureFromPath(GoogleExtendReport.captureScreenShot());
			
		}
		
	}
	
	
	public  static String captureScreenShot() throws AWTException, IOException {
		Robot r = new Robot();
				
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
				
				Rectangle rect = new Rectangle(dimension);
				
				BufferedImage screenCapture = r.createScreenCapture(rect);
				
				File dest = new File("./screenShot/facebook"+System.currentTimeMillis()+".png");
				
				ImageIO.write(screenCapture, "png", dest);
				
				
				String absolutePath = dest.getAbsolutePath();
				
				return absolutePath;
			}
	
	
	@AfterTest
	public void tear() {
		extent.flush();
	}
	
	
}
