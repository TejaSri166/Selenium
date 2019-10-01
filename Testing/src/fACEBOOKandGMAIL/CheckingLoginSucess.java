package fACEBOOKandGMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingLoginSucess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//<input type="email" class="inputtext" name="email" id="email" value="ponnurutejasri@gmail.com" data-testid="royal_email">
		driver.findElement(By.id("email")).sendKeys("ponnurutejasri@gmail.com");
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		driver.findElement(By.id("pass")).sendKeys("janakimurthy");
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_8">
		driver.findElement(By.id("u_0_8")).click();
		//<a data-gt="{&quot;chrome_nav_item&quot;:&quot;home_chrome&quot;}" href="https://www.facebook.com/?ref=tn_tnmn" class="_2s25" accesskey="1">Home</a>
		String actual_result=driver.findElement(By.linkText("Home")).getText();
		System.out.println("The actual_result is:"+actual_result);
		String expected_result="Home";
		System.out.println("The expected_result is:"+expected_result);
		if(actual_result.contains(expected_result)) {
		System.out.println("login -successufully");
		}
		else {
			System.out.println("login-Fail");
		}
		
		driver.close();
		
		
		

	}

}
