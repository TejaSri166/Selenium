package com.Krishna;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This will execute before test");
	}
	@Test(priority =1)
	public void addEmployee() {
		System.out.println("Add Employee");
	}
	
	@Test(priority =2)
	public void editEmployee() {
		System.out.println("Edit Employee");
	}
	
	@Test
	public void deleteEmployee() {
		System.out.println("delete employee");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("this will execute after test");
	}

}
