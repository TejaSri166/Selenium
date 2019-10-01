package com.stepdefintion;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleLogIn {
	WebDriver driver =null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@Given("^Open firefox browser and navigate to OrangeHrm application$")
	public void Open_firefox_browser_and_navigate_to_OrangeHrm_application(){
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Cucumber\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and  click on SignIn button$")
	public void User_enters_valid_and_and_click_on_SignIn_button(String UserName, String Password){

		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		
		}

	@Then("^User should be able to successfully login to OrangeHrm application and close the application$")
	public void User_should_be_able_to_successfully_login_to_OrangeHrm_application_and_close_the_application() throws Throwable {
		 try {
				
				String Actual_Text =driver.findElement(By.id("welcome")).getText();                                                                                                                                                                
				System.out.println("The Actual_Text is:"+Actual_Text);
				String Expected_Text ="Welcome Admin";
				System.out.println("The Expected_Text is:"+Expected_Text);
				
				if(Actual_Text.contains(Expected_Text))
				{
					System.out.println("User is Successfully loggedIn");
				}
			   }  
			   
			   catch(Exception e) {
				   
				   String Expected_Text="Invalid credentials";
				   System.out.println("The Expected_Text is:"+Expected_Text);
				   String Actual_Text =driver.findElement(By.id("spanMessage")).getText();
				   System.out.println("The Actual_Text is:"+Actual_Text);
				   
				   if(Actual_Text.contains(Expected_Text)) {
				
					   File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenShot,new File("./ScreenShot/img.png"));
				System.out.println("Login Fail");
				
				driver.quit();
				
				   }
				   
			   }
	}
  
	}




