package newTours;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_ScreenShot {

	public static void main(String[] args)throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	List <WebElement> links=driver.findElements(By.tagName("a"));
	int linkCount=links.size();
	System.out.println("The total no of links present in the newtour app is:"+linkCount);
	for(int i=0;i<linkCount;i++) {
		String linkNames=links.get(i).getText();
		System.out.println("The total no of linknames present in newtour app is:"+linkNames);
		links.get(i).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("**********************************");
		File newTour_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(newTour_ScreenShot, newFile("./ScreenShots/facebook.jpg"));
		FileUtils.copyFile(newTour_ScreenShot, new File("./ScreenShot/"+linkNames+".jpg"));	
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		//driver.quit();
		
	}
	
	}

	
}
