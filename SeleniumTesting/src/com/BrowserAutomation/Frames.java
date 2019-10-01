package com.BrowserAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver=null;
	String url="https://jqueryui.com/droppable/";
	
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
		@Test
		public void functionality() {
			//driver.findElement(By.)
		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
			
		}
	}


		
	

