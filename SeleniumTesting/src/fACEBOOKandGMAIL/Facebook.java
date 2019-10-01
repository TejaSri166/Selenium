package fACEBOOKandGMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
		
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		driver.findElement(By.id("email")).sendKeys("ponnurutejasri@gmail.com");
		
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		driver.findElement(By.id("pass")).sendKeys("janakimurthy");
		try {
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_3">
		driver.findElement(By.xpath("//*[@id=\"u_0_3\"]")).click();
		}
		
			
			catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		driver.findElement(By.xpath("//*[@id=\'userNavigationLabel\']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\'js_h4\']/div/div/ul/li[8]/a/span/span")).click();
		


	}

}
