package com.multiplewindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_MultipleWindowsHandling {
	
	public static void main(String[] args) {
		WebDriver driver =null;
		String url="https://accounts.google.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("The first window title is"+driver.getTitle());
		
		
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		
		//Automating help
		driver.findElement(By.linkText("Help")).click();
		System.out.println("close");
		
		
		
		
		
		
	
		
		
	

	}

}
