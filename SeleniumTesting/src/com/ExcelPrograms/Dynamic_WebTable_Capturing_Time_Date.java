package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable_Capturing_Time_Date {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Complete webtable-Property-/html/body/div[1]/div[6]/section[1]/div/section/div[1]
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]"));
	
		//Finding how many rows are present in the webtable
		List <WebElement> rows=driver.findElements(By.tagName("tr"));
		
		FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book2.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet =workBook.getSheet("sheet1");
		Row r=sheet.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Teja");
		FileOutputStream file1= new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book2.xlsx");
		workBook.write(file1);
		
		
		
		
		for(int i=0;i<rows.size();i++) {
			//Finding howmany columns are present in the webtable
			List <WebElement> column=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<column.size();j++) {
				String data=column.get(j).getText();
				System.out.print(data+" ");
				
			}
			System.out.println();
		}
		driver.quit();
			
		}
		
		

	}


