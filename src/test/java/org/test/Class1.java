package org.test;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups = {"smoke","sanity"})
	public void class1Method1() {
		System.out.println(System.currentTimeMillis());
		System.out.println("Class1Method1");
	}

}
