package com.Krishna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;

public class MultipleScreenShots {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		library.Utility.captureScreenshot(driver,"browser");
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		library.Utility.captureScreenshot(driver,"facebook browser");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jagan@gmail.com");
		Thread.sleep(3000);
		library.Utility.captureScreenshot(driver,"Username");
		
		driver.quit();
		
		
	}

}
