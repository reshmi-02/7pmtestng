package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver ;
	
	
//	@Test(dataProvider ="data" , priority = 1 )  //{"url"}
//	public void fburl(String url) {
//		driver = new ChromeDriver();
//		driver.get(url);
//	}
	
	@BeforeMethod
	public void fburl() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test(dataProvider ="datas",priority = 2)  //{ {"oranium@123","342341"}  , {"priya@123","8796898"} }
	public void login(String username , String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider
	public Object[] data() {
		
		Object arr []= {"https://www.facebook.com/"};
		
		return arr;
	}
	
	
	@DataProvider
	public Object[][] datas() {
		Object arr [] [] =  { {"oranium@123","342341"}  , {"priya@123","8796898"} , {"swetha@214","6745"}  };
		
		return arr;
	
	}
	
	
}
