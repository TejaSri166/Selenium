package com.Ramya;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
WebDriver driver=new ChromeDriver();
String url="http://bing.com";
driver.navigate().to(url);
File x=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(x, new File("./Screenshots/bing.png"));


driver.quit();

	}

}
