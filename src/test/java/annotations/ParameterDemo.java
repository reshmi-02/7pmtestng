package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterDemo {
	WebDriver driver ;
	
	@BeforeMethod
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Parameters({"user","passwrd"})
	@Test
	public void fblogin(String username , String pass) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
