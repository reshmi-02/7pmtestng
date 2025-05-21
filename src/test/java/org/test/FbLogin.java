package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FbLogin extends BaseClass{
	
	@Test(dataProviderClass = ExcelReader.class,dataProvider = "getData" , groups= {"sanity"} )  //{{user,pass},{},{}}
	public void login(String name , String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
	}
	
}
