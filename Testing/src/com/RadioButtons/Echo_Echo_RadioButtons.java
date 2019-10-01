package com.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Echo_Echo_RadioButtons
{
	WebDriver driver =null;
	String url="http://www.echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void radiobuttonselection() throws InterruptedException
	{
	
		WebElement radioButtonBlock =driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List <WebElement> group1_RadioButtons =radioButtonBlock.findElements(By.name("group1"));
		System.out.println("The no.of radio buttons are:"+group1_RadioButtons.size());
		for(int i=0;i<group1_RadioButtons.size();i++) {
			group1_RadioButtons.get(i).click();
			Thread.sleep(2000);
			for(int j=0;j<group1_RadioButtons.size();j++) {
				System.out.println(group1_RadioButtons.get(j).getAttribute("value") + " "+group1_RadioButtons.get(j).getAttribute("checked"));
			}
		}
		}
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
			
		
		}
	


