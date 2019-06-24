package com.Class01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFor {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("C:\\Users\\Samsung\\Desktop\\test1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int colNum=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total col is: "+colNum);
		
		System.out.println("Total row is : "+rowCount);
		
		for(int i=0; i<rowCount; i++) {
			
			for(int x=0; x<colNum; x++) {
			String data=sheet.getRow(i).getCell(x).getStringCellValue();
			
			System.out.println(data);
		}
		}
		
		wb.close();
		
	}

}
