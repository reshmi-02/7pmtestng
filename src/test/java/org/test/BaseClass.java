package org.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver ;

	@BeforeMethod
	public void browserSetup() throws IOException {
		
		File  f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
		
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			driver.get(prop.getProperty("testurl"));
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		}
		
		else {
			System.out.println("Pass the valid browser name");
		}
		
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
