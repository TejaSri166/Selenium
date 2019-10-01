package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCombinations {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//XCel Operations
		FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\OrangeLogin Combinations.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet =workBook.getSheet("sheet1");
		//Identifying the active rows in the sheet
		int rowCount =sheet.getLastRowNum();
		for(int i=0;i<rowCount;i++) {      
			Row r=sheet.getRow(i);
			
			
			//Property of UserName
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(r.getCell(0).getStringCellValue());
			
			//Property of Password
		WebElement passWord=driver.findElement(By.id("txtPassword"));
			passWord.sendKeys(r.getCell(1).getStringCellValue());
			
			//Property of Login
			driver.findElement(By.id("btnLogin")).click();
			
			try {
				String Expected_Text="Welcome Linda";
				System.out.println("Expected_Text is:"+Expected_Text);
				
				String Actual_Text=driver.findElement(By.id("welcome")).getText();
				System.out.println("Actual_Text is:"+Actual_Text);
				
				if(Actual_Text.contains(Expected_Text)){
					System.out.println("User is able tologin-Pass");
					}
				
			}
			catch(Exception e) {
				//Property of invalid Creditions-<span id="spanMessage">Invalid credentials</span> 
				String Expected_AlertText ="Invalid Creditionals";
				System.out.println("The expected_Alert_Text is:"+Expected_AlertText);
				
				String Actual_AlertText =driver.findElement(By.id("spanMessage")).getText();
				System.out.println("The Actual_AlertText is:"+Actual_AlertText);
				if(Actual_AlertText.equals(Expected_AlertText)) {
					System.out.println("The User is unabletologin-Fail");
					
				}
				FileOutputStream file1=new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\OrangeLogin Combinations.xlsx");
				workBook.write(file1);
					
				}
			
			
		
		}
		
		
		
	}	
		
	

	}


