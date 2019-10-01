package fACEBOOKandGMAIL;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://gmail.com");
	driver.close();
	
	

	}

}
