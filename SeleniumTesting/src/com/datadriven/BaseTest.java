package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver =null;
	String url = "http://demo.guru99.com/selenium/newtours/";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}

		
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}
