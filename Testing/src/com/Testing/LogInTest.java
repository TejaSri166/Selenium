package com.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest {
	
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
	
	@BeforeTest
	public void setUp()
	{
		//System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		//driver =new FirefoxDriver();
		driver =new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void logIn()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
