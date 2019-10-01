package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void captureScreenshot(WebDriver driver,String screenshotname) {
		TakesScreenshot sc =(TakesScreenshot)driver;
		File source =sc.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source,new File("./Screenshots"+screenshotname+".png"));
		}
		catch(IOException e){
			
			System.out.println("Exception while taking the screnshot" +e.getMessage());
		}
		
		
		

	}

}
