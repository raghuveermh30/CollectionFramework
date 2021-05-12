package com.testng;

import org.testng.annotations.Test;

public class PriorityCases {
	
	
	@Test(priority = 0)
	public void po() {
		System.out.println("Priority 0");
	}

	
	@Test(priority = 1)
	public void p1() {
		System.out.println("Priority 1");
	}

	
	@Test(priority = 2)
	public void p2() {
		System.out.println("Priority 2");
	}
	
	@Test(priority = -1)
	public void p4() {
		System.out.println("Priority -1");
	}
	
	@Test
	public void m1() {
		System.out.println("Test Method M1");
	}
	
	@Test
	public void m2() {
		System.out.println("Test Method M2");
	}
	
	

}
