package org.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer  implements IRetryAnalyzer {
	int min=1;
	int max=3;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		while(min<=max) {
			min++;
			return true;
		}
		
		return false;
	}

}
