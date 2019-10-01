package com.Krishna;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGGroups {
	
	@BeforeTest
	public void test() {
		System.out.println("This is before test");
		
	}
	
	
	@Test(groups= {"smoke"})
	public void addAdmin() {
		System.out.println("Add Admin");
	}
	
	@Test(groups = {"smoke"})
	public void addJobTitle() {
		System.out.println("Add Job Title");
	}
	
	@Test(groups = {"smoke","regression"})
	public void addPayGrades() {
		System.out.println("Add PAy Grades");
	}
	@Test(groups = {"smoke"})
	public void editEmployee() {
		System.out.println("Edit Employee");
	}
	@Test
	public void deleteEmployee() {
		System.out.println("delete Employee");
	}
	
	@AfterTest                                                                                            
	public void aftertest() {
		System.out.println("This is after test");
		
	}
	

}
