package com.KeywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_UserRegistration extends TestBase {
	
	@Test(priority=1)
	public void register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test(priority =2)
	public void userRegistration() throws IOException, InterruptedException
	{
		
		FileInputStream file =new FileInputStream("E:\\LIVE TECH\\Testing\\NewTours_UserRegistration.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		
		driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys("Venkat");
		driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys("Ponnuru");
		//Thread.sleep(5000);
		driver.findElement(By.name(pr.getProperty("phone"))).sendKeys("9090909090");
		driver.findElement(By.name(pr.getProperty("email"))).sendKeys("venkat@gmail.com");
		//Thread.sleep(5000);
		driver.findElement(By.name(pr.getProperty("Address"))).sendKeys("KajiPet");
		//Thread.sleep(5000);
		driver.findElement(By.name(pr.getProperty("city"))).sendKeys("Hyderabad");
		driver.findElement(By.name(pr.getProperty("State"))).sendKeys("Telangana");
		driver.findElement(By.name(pr.getProperty("PostalCoode"))).sendKeys("500897");
		Thread.sleep(3000);
		driver.findElement(By.name(pr.getProperty("Country"))).sendKeys("India");
		
		
		driver.findElement(By.id(pr.getProperty("UserName"))).sendKeys("venkata");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("Venkata@123");
		
		driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys("Venkata@123");
		Thread.sleep(5000);
		driver.findElement(By.name(pr.getProperty("Submit"))).click();
		
		
		
		
		
	}
	
	

}
