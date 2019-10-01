package com.BrowserAutomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_TSRTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://tsrtconline.in/oprs-web/");
		
	    WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		List <WebElement> headerBlock_links=driver.findElements(By.tagName("a"));
		System.out.println("The header block links are:"+headerBlock_links.size());
	
		for(int i=0;i<headerBlock_links.size();i++) {
		String headerBlock_linkName=headerBlock_links.get(i).getText();
		System.out.println(headerBlock_linkName);
		headerBlock_links.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		Thread.sleep(3000);
		headerBlock=driver.findElement(By.className("menu-wrap"));
		headerBlock_links=driver.findElements(By.tagName("a"));
		
	}
	
	
	
	
		
		
		
		
	

	}

}
