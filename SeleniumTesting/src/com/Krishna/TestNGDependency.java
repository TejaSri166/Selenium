package com.Krishna;

import org.testng.annotations.Test;

public class TestNGDependency {
	
	@Test
	public void addEmployee() {
		System.out.println("Add Employee");
	}
	@Test(dependsOnMethods= {"addEmployee"})
	public void editEmployee() {
		System.out.println("Edit Employee after adding employee");
	}
	@Test
	public void deleteEmployee() {
		System.out.println("Delete Employee after edit employee");
	}

}
