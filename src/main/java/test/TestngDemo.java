package test;


import org.testng.annotations.Test;

public class TestngDemo {
	
	@Test(priority=-1)
	public void m1() {
	System.out.println("m1 method");	
	}

	@Test (priority = 0)
	public void m2() {
		System.out.println("m2 Method");
	}
	

	@Test(priority = -9) 
	public void m4() {
		System.out.println("m4 Method");
	}
	
	@Test (priority = 2)
	 public void m3() {
		System.out.println("m3 Method");
	}
}
