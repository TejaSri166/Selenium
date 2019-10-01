package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadingTheData_Excel {

	public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\Book2.xlsx");
	XSSFWorkbook workBook =new XSSFWorkbook(file);
	XSSFSheet sheet =workBook.getSheet("sheet1");
	Row r=sheet.getRow(1);
	Cell c =r.getCell(2);
	String data =c.getStringCellValue();
	System.out.println(data);
	
	
	}

}
