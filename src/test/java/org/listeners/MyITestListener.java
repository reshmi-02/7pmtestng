package org.listeners;

import java.awt.AWTException;
import java.io.IOException;

import org.test.TestCases;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyITestListener implements  ITestListener {

	
	 public void onStart(ITestContext context) {
		    // not implemented
		 System.out.println("on class started");
		  }
	 
	 
	 public void onTestStart(ITestResult result) {
		    // not implemented
		 System.out.println("on test started");
		  }
	 
	 
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 
		 System.out.println("on test success");
		  }
	 
	 
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 System.out.println("on test failure");
		 
		 try {
			TestCases.captureScreenShot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		  }
	 
	 
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		 System.out.println("on test skipped");
		  }
	 
	 
	 public void onFinish(ITestContext context) {
		    // not implemented
		 	System.out.println("on test finished");
		  }
	 
	 
	
	
}
