package fACEBOOKandGMAIL;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingTheURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://gmail.com");
		String expected_title="Gmail";
		String actual_title=driver.getTitle();
		if(expected_title.contains(actual_title)) {
			System.out.println("The title is matched:"+expected_title);
		}
		else {
			System.out.println("The title is not matched:"+expected_title);
		}
		String expected_URL="https://www.gmail.com";
		String actual_URL=driver.getCurrentUrl();
		if(expected_URL.contains(actual_URL)) {
			System.out.println("The URL is matched:"+expected_URL);
		}
		else {
			System.out.println("The URL is not matched:"+expected_URL);
			
			
			
		}
		
		driver.quit();
		
				
		

	}

}
