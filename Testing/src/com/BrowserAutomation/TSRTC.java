package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tsrtconline.in/oprs-web/");
	WebElement	header_block=driver.findElement(By.className("menu-wrap"));
	List <WebElement>header_links=header_block.findElements(By.tagName("a"));
		System.out.println("The links present in the header block is:"+header_links.size());
		Thread.sleep(5000);
		for(int i=0;i<header_links.size();i++) {
			String linkName=header_links.get(i).getText();
			System.out.println(linkName);
			
			Thread.sleep(2000);
			header_links.get(i).click();
			/*Thread.sleep(3000);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("..........");*/
			driver.navigate().back();
			Thread.sleep(3000);
			header_block=driver.findElement(By.className("menu"));
			header_links=driver.findElements(By.tagName("a"));
			
		}
		
		driver.quit();
		
		
		

	}

	}

