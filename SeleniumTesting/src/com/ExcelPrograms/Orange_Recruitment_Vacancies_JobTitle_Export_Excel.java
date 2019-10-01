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
import org.openqa.selenium.interactions.Actions;

public class Orange_Recruitment_Vacancies_JobTitle_Export_Excel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Property of UserName
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Property of Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Property of Login
		driver.findElement(By.id("btnLogin")).click();
		
		//MouseHower actions-//*[@id="menu_recruitment_viewRecruitmentModule"]/b
		/*WebElement Recruitment=driver.findElement(By.xpath("//*[@id=\'menu_recruitment_viewRecruitmentModule\']/b"));
		Actions act=new Actions(driver);
		act.moveToElement(Recruitment).perform();*/
		driver.findElement(By.xpath("//*[@id=\'menu_recruitment_viewRecruitmentModule\']/b")).click();
		
		//Property of vacancies-<a href="/index.php/recruitment/viewJobVacancy" id="menu_recruitment_viewJobVacancy">Vacancies</a>
		
		WebElement vacancies=driver.findElement(By.linkText("Vacancies"));
		Actions act1=new Actions(driver);
		act1.moveToElement(vacancies).perform();
		
		//Property of jobtitle-<select name="candidateSearch[jobTitle]" id="candidateSearch_jobTitle">
		 WebElement jobTitle=driver.findElement(By.id("candidateSearch_jobTitle"));
		 List <WebElement> jobTitleNames =jobTitle.findElements(By.tagName("option"));
		 System.out.println("The list is:"+ jobTitleNames.size());
		 
		// Export to Excel Sheet
		 FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Orange_Recrutment_vacancies.xlsx");
		 XSSFWorkbook workBook =new XSSFWorkbook(file);
		 XSSFSheet sheet =workBook.getSheet("sheet1");
		 for(int i=0;i<jobTitleNames.size();i++) {
			 String jobTitle_list=jobTitleNames.get(i).getText();
			 System.out.println(jobTitle_list);
			 Row r=sheet.createRow(i);
			 Cell c=r.createCell(2);
			 c.setCellValue(jobTitle_list);
			 FileOutputStream file1=new  FileOutputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Orange_Recrutment_vacancies.xlsx");
			 workBook.write(file1);
			 
		 }
		 
		 
		
	}

}
