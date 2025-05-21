package org.report;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {
	
	ExtentReports extent ;
	
	@BeforeTest
	public void setup() {
		// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+
				"\\report\\extendReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);

	}
	
	
	@Test
	public void signup() {
		ExtentTest test = extent.createTest("signup page test");
		test.pass("Sign up page got pass");
	}
	
	@Test
	public void homepage() {
		
		ExtentTest test = extent.createTest("Homepage test").assignCategory("smoke").assignDevice("chrome").assignAuthor("oranium");
		test.log(Status.PASS, "user is on the home page");
	}
	
	
	
	@Test
	public void productpage() {

		ExtentTest test = extent.createTest("product test").assignCategory("sanity").assignDevice("firefox").assignAuthor("oranium");
		test.fail("product page test got failed");
	}
	
	
	@AfterTest
	public void tear() {
		extent.flush();
	}
	

}
