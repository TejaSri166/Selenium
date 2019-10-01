package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_CheckingTitleAndURL {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	//finding the property of signin
	//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
	driver.findElement(By.id("identifierId")).sendKeys("ptejasri94");
	
	//<span class="RveJvd snByac">Next</span>
	driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
	
	//Property of password
	//<input type="password" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="current-password" spellcheck="false" tabindex="0" aria-label="Enter your password" name="password" autocapitalize="off" autocorrect="off" dir="ltr" data-initial-dir="ltr" data-initial-value="">
	driver.findElement(By.name("password" )).sendKeys("janakimurthy");
	
	//property of next
	driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
	
	//property for before logout
	driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div")).click();
	
	Thread.sleep(5000);
	
	//Property of logout
	//<a class="gb_0 gb_Cf gb_Kf gb_ke gb_jb" id="gb_71" href="https://accounts.google.com/Logout?hl=en-GB&amp;continue=https://mail.google.com/mail&amp;service=mail&amp;timeStmp=1558790085&amp;secTok=.AG5fkS895JWEtArlg6XQcXoJuIpQYlh0Gg" target="_top">Sign out</a>
	driver.findElement(By.linkText("Sign out")).click();
	
	
	

	}

}
