package com.hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OHRM_AddEmployee extends OrangeHRMTestBase{
	@Test
	public void addEmployee() throws IOException {
		
		FileInputStream file =new FileInputStream("E:\\LIVE TECH\\SeleniumTesting\\src\\excelOperations\\hybrid_OHRM_AddEmployee.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet =workBook.getSheet("Sheet1");
		
		int rowCount =sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			
			Row r=sheet.getRow(i);

			FileInputStream file2=new FileInputStream("./OHRM_AddEmployee.properties");
			Properties pr =new Properties();
			pr.load(file2);
			
			
			driver.findElement(By.id(pr.getProperty("UserName"))).sendKeys(r.getCell(0).getStringCellValue());
		//	driver.findElement(By.id("UserName")).clear();
			
			driver.findElement(By.id(pr.getProperty("PassWord"))).sendKeys(r.getCell(1).getStringCellValue());
			//driver.findElement(By.id("PassWord")).clear();
			
			driver.findElement(By.id(pr.getProperty("LoginButton"))).click();
			
			driver.findElement(By.xpath(pr.getProperty("Pim"))).click();
			
			driver.findElement(By.id(pr.getProperty("AddEmployee"))).click();
			
			
			driver.findElement(By.id(pr.getProperty("FirstName"))).sendKeys(r.getCell(2).getStringCellValue());
			//driver.findElement(By.id(pr.getProperty("FirstName"))).clear();

			
			driver.findElement(By.id(pr.getProperty("MiddleName"))).sendKeys(r.getCell(3).getStringCellValue());
			//driver.findElement(By.id(pr.getProperty("MiddleName"))).clear();

			
			driver.findElement(By.id(pr.getProperty("LastName"))).sendKeys(r.getCell(4).getStringCellValue());
			//driver.findElement(By.id(pr.getProperty("LastName"))).clear();
			
			String Actual_Result  =driver.findElement(By.xpath("//*[@id='employeeId']")).getAttribute("value");
			System.out.println("The actual result is:"+Actual_Result);
			
			driver.findElement(By.id(pr.getProperty("Save"))).click();
			
			String  Expected_Result = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
			System.out.println("The expected resultis:"+Expected_Result);
			
			if(Actual_Result .contains(Expected_Result)) {
				System.out.println("Pass");
				r.createCell(5).setCellValue("Pass");
			}
			else {
				System.out.println("Fail");
				r.createCell(5).setCellValue("fail");
			}
			FileOutputStream file1=new FileOutputStream("E:\\LIVE TECH\\SeleniumTesting\\src\\com\\ResultFiles\\OrangeHrmAddEmployee.xlsx");
			workBook.write(file1);
			
			
			
			driver.navigate().refresh();
driver.findElement(By.id(pr.getProperty("Welcome"))).click();
			
			
			driver.findElement(By.linkText(pr.getProperty("Logout"))).click();
			//driver.navigate().back();
			
				
			}
				
		
		
		}
		
	
		
		
		
		
		
		
		
	
		
	}

			