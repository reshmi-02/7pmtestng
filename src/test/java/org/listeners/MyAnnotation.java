package org.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyAnnotation implements IAnnotationTransformer{

	  public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		    // not implemented
		  
		  	annotation.setRetryAnalyzer(MyRetryAnalyzer.class);
		  
		  }
	
}
