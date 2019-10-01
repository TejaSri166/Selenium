package com.Krishna;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void test1() {
		System.out.println("This is my first test case");
		
	}
	
	@Test
	public void test2() {
		System.out.println("This is my second test case");
	}

	@BeforeMethod
	public void method1() {
		System.out.println("This is will execute before method");
	}
	
	@AfterMethod
	public void method2() {
		System.out.println("This is will execute after method");
		
	}
	
	@BeforeClass
	public void class1() {
		System.out.println("This will execute before class");
	}
	
	@AfterClass
	public void class2() {
		System.out.println("This will execute after class");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This will execute before test");
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("This will execute after test");
		
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This will execute before suite");
		
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This will execute after suite");
	}
	

}
