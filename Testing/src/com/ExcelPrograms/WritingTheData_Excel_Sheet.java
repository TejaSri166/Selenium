package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTheData_Excel_Sheet {

		public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book2.xlsx");
			XSSFWorkbook workBook =new XSSFWorkbook(file);
			XSSFSheet sheet =workBook.getSheet("sheet1");
			Row r=sheet.createRow(2);
			Cell c=r.createCell(3);
			c.setCellValue("Teja");
			FileOutputStream file1= new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book2.xlsx");
			workBook.write(file1);
			

	}

}
