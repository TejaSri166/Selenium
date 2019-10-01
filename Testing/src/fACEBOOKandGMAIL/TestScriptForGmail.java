package fACEBOOKandGMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptForGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
	
		//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
		driver.findElement(By.id("identifierId")).sendKeys("ptejasri94");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
 
        //<input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="current-password" spellcheck="false" tabindex="0" aria-label="Enter your password" name="password" autocapitalize="off" autocorrect="off" dir="ltr" data-initial-dir="ltr" data-initial-value="">
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("janakimurthy");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
       driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
        driver.quit();
        
		



	}

}
