package annotations;

import org.testng.annotations.Test;

public class Attributes {

	@Test(priority = -2,description = "Test case for login functionality",expectedExceptions = Exception.class)
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("It is a login functionality");
		System.out.println(10/0);
	}
	
	@Test(priority = -1, dependsOnMethods = "login" , alwaysRun = true)
	private void homepage() {
		// TODO Auto-generated method stub
		System.out.println("It is a homepage functionality");
	}
	
	@Test(priority = 0 , invocationCount = 2 , invocationTimeOut = 2000)
	private void productPage() {
		// TODO Auto-generated method stub
		System.out.println("It is a productpage functionality");
	}
	
	@Test(priority = 1 , timeOut = 2000)
	private void logout() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("It is a logout functionality");
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 2 , enabled = false)
	private void addToCart() {
		// TODO Auto-generated method stub
		System.out.println("It is a addToCart functionality");
	}
}
