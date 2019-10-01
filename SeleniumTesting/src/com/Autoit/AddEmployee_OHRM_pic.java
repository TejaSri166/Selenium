package com.Autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddEmployee_OHRM_pic {
	WebDriver driver =null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest
		public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@Test(priority=0)
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
@Test(priority=1)
public void pim() throws IOException, InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	
	
	driver.findElement(By.id("firstName")).sendKeys("Jagan");
	driver.findElement(By.id("lastName")).sendKeys("murthy");
	driver.findElement(By.id("photofile")).click();
	
	Thread.sleep(4000);
	java.lang.Runtime.getRuntime().exec("./AutoITTestScripts/Auti.exe");
	
	Thread.sleep(3000);
	driver.findElement(By.id("btnSave")).click();
	
	
}

@AfterTest
public void tearDown() {
	driver.quit();
	
}

	}


