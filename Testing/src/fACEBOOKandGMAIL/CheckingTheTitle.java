package fACEBOOKandGMAIL;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingTheTitle {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String expected_title="Facebook-login-signin";
		System.out.println("The expected Title is:"+ expected_title);
		String actual_title=driver.getTitle();
		System.out.println("The actual Title is:"+ actual_title);
	
		if(actual_title.equals(expected_title)) {
			System.out.println("The title is matched");
		}
			else {
				System.out.println("The title is not matched");
			}
			
			driver.quit();
		}
				
		
	
		
		
		
		
		
		

	}

