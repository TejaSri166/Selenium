package fACEBOOKandGMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.Driver;

public class CheckingTheURLWithLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		String expected_title="facebook";
		String actual_title=driver.getTitle();
		if(actual_title.equals(expected_title)) {
			System.out.println("The title is matched" +driver.getTitle());
		}
		else {
			System.out.println("The title is not matched");
			String expected_URL="http://facebook.com";
			String actual_URL=driver.getCurrentUrl();
			if(actual_URL.contains(expected_URL)) {
				System.out.println("The URL is matched:+driver.getCurrentUrl");
			}
			else {
				System.out.println("The URL is not matched");
				
			}
			
		}
		driver.findElement(By.id("email")).sendKeys("ptejasri94@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("janakimurthy");
		driver.findElement(By.id("u_0_8")).click();
		Thread.sleep(1000);
		
		
		driver.quit();
		
		
		
		

	}
		
	}


