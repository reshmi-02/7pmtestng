package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	private void beforeSuite() {
		// TODO Auto-generated method stub
		System.out.println("beforeSuite");
	}
	
	
	@BeforeTest
	private void beforeTest() {
		// TODO Auto-generated method stub
		System.out.println("beforeTest");
	}
	
	
	@BeforeClass
	private void beforeclass() {
		// TODO Auto-generated method stub
		System.out.println("beforeclass");
	}
	
	
	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub
		System.out.println("beforeMethod");
	}
	
	@Test
	private void test02() {
		// TODO Auto-generated method stub
		System.out.println("test02");
		System.out.println(10/0);
	}
	
	
	@Test
	private void test01() {
		// TODO Auto-generated method stub
		System.out.println("test01");
	}
	
	@AfterSuite
	private void afterSuite() {
		// TODO Auto-generated method stub
		System.out.println("afterSuite");
	}
	
	@AfterTest
	private void afterTest() {
		// TODO Auto-generated method stub
		System.out.println("afterTest");
	}
	
	@AfterClass
	private void afterclass() {
		// TODO Auto-generated method stub
		System.out.println("afterclass");
	}
	
	
	@AfterMethod
	private void afterMethod() {
		// TODO Auto-generated method stub
		System.out.println("afterMethod");
	}
	
	
}
