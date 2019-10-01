package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LavaKumar {
	WebDriver driver =null;
	String url="https://www.amazon.in/";
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void test() {
		driver.findElement(By.id("nav-your-amazon")).click();
		
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	


}
