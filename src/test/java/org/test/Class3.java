package org.test;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test(groups= {"regression","smoke"})
	public void class3Method1() {
		System.out.println(System.currentTimeMillis());
		System.out.println("Class3Method1");
	}

}
