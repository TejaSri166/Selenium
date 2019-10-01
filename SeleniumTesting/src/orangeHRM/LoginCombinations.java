
package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCombinations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String username="Admin";
		String password="admin123";
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
			
			if(username=="Admin" && password=="admin123") {
				System.out.println("Navigating to Home Page");
			}
			 
			
	String actual_text= driver.findElement(By.linkText("Welcome Admin")).getText();
	String expected_text="Welcome Admin";
	if(actual_text. contains (expected_text)){
		System.out.println("Login successful");
	}
	else {
		try {
			String username1="admin";
			String password1="admin123";
			driver.findElement(By.id("txtUsername")).sendKeys(username1);
			driver.findElement(By.id("txtPassword")).sendKeys(password1);
			driver.findElement(By.id("spanMessage")).getText();
		}
		catch(Exception e) {
			System.out.println("Login failed");
		}

		}
	
	}
	}


	

			
		
	
		
		
	
			
	
				
	
		
	
		
		
		
		
	

		
	

