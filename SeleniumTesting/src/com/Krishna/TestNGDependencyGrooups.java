package com.Krishna;

import org.testng.annotations.Test;

public class TestNGDependencyGrooups {
	
	@Test(groups= {"pim"})
	public void addEmployee() {
		System.out.println("Adding Employee");
	}
	@Test(groups= {"pim"})
	public void searchEmployee() {
		System.out.println("Search Employee");
	}
	@Test(groups= {"admin"},dependsOnGroups= {"pim"})
	public void addAdmin() {
		System.out.println("adding Employee");
	}
	@Test(groups= {"admin"})
	public void addJobTitle() {
		System.out.println("Adding JobTitle");
	}

}
