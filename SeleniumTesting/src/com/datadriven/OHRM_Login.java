package com.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OHRM_Login extends OrangeHRMTestBase {
	@Test
	public void logIn() throws IOException {
		FileInputStream file =new FileInputStream("E:\\LIVE TECH\\SeleniumTesting\\src\\excelOperations\\OHRM_Login.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet =workBook.getSheet("Sheet1");
		
		//Identifiying active number of rows
	int	rowCount =sheet.getLastRowNum();
	for(int i=1;i<=rowCount;i++) {
		Row r =sheet.getRow(i);
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		
		driver.findElement(By.id("btnLogin")).click();
		
		try {
			String Expected_text ="Welcome Admin";
			System.out.println("The Expected_text is:"+Expected_text);
			
			String Actual_text=driver.findElement(By.id("welcome")).getText();
			System.out.println("The Actual_text is:"+Actual_text);
			
			if(Actual_text .contains(Expected_text))
			{
				System.out.println("Login is success");
				r.createCell(2).setCellValue("Login is success");
			}
			else {
				System.out.println("Login is Failed");
				r.createCell(2).setCellValue("Login is Failed");
			}
			driver.navigate().back();
		}	
		
		catch(Exception e) {
		
			String Expected_Text ="Csrf token validation failed";
			System.out.println("Invalid cretionals:"+Expected_Text);
			
			String Actual_Text =driver.findElement(By.id("spanMessage")).getText();
			System.out.println("The Actual_Text is:"+Actual_Text);
		if(Actual_Text .contains(Expected_Text))
		{
			System.out.println("Continue Login");
			r.createCell(2).setCellValue("Continue Login");
		}
		else {
			System.out.println("Stop the Login Process");
			r.createCell(2).setCellValue("Stop the Login Process");
			
		}
		
		FileOutputStream file1 =new FileOutputStream("E:\\LIVE TECH\\SeleniumTesting\\src\\com\\ResultFiles\\OHRM_Login.xlsx");
			workBook.write(file1);
			//driver.navigate().back();
			
		}
			
	}
	}
	
}
		
		
	
		
		
		
	


