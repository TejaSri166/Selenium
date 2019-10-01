package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CaptureCompleteDataFronExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\CapturingData-Excel.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("sheet1");
		int rowCount=sheet.getLastRowNum();
		//System.out.println(rowCount);//6
		
		for(int i=0;i<rowCount;i++) {
			Row r=sheet.getRow(i);
			int cellCount =r.getLastCellNum();
			//System.out.println(cellCount);//3
			for(int j=0;j<cellCount;j++) {
				String data =r.getCell(j).getStringCellValue();
				System.out.print(data+ "        ");
			}
			System.out.println();
				
			}
			
		}
		
		

	}


