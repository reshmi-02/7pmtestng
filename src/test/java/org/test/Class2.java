package org.test;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups = {"regression"})
	public void class2Method1() {
		System.out.println(System.currentTimeMillis());
		System.out.println("Class2Method1");
	}
	
	
	@Test(groups= {"sanity"})
	public void class2Method2() {
		System.out.println(System.currentTimeMillis());
		System.out.println("Class2Method2");
	}

}
