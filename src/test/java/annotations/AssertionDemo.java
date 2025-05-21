package annotations;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	WebDriver driver ;
	
	
	@BeforeMethod
	public void browserSetup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void verifyPageTitle() {
		
		@Nullable
		String title = driver.getTitle();
		
//		Assert.assertEquals(title, "Facebook – log in or sign up") hard asser
		
		//soft assert 
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(title, "Facebook – log in or sign up", "page title verification failed");
		
		System.out.println("--verification completed--");
		
		
		s.assertAll();
		
	}
	
	
	@Test
	public void loginVerify() {
		WebElement login = driver.findElement(By.name("login"));
		
//		Assert.assertFalse(login.isDisplayed()); hard assert
		
		//soft assert 
		SoftAssert s = new SoftAssert();
		s.assertFalse(login.isDisplayed());
		System.out.println("login verification completed");
		
		s.assertAll();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
