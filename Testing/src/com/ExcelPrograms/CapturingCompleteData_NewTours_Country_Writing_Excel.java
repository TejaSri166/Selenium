package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingCompleteData_NewTours_Country_Writing_Excel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Inspect the property of register link-<a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
		
		//Inspect the property of country-
		WebElement country=driver.findElement(By.name("country"));
		
		List <WebElement> countryNames=country.findElements(By.tagName("option"));
		System.out.println("The number of countries present in the dropdown list are:"+countryNames.size());
		
			
			
			//Excel Operations
			FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book1.xlsx");
			XSSFWorkbook workBook =new XSSFWorkbook(file);
			XSSFSheet sheet =workBook.getSheet("sheet1");
			for(int i=0;i<countryNames.size();i++) {
				String countryNames_list=countryNames.get(i).getText();
				System.out.println("The country names are:"+countryNames_list);
				Row r=sheet.createRow(i);
				Cell c=r.createCell(0);
				c.setCellValue(countryNames_list);
				FileOutputStream file1=new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book1.xlsx");
				workBook.write(file1);
				
				
			
		
			
				
		
		}		
		

	}

	}
