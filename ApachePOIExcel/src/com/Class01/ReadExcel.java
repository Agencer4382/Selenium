package com.Class01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\Samsung\\Desktop\\test1.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		String data1 = sheet1.getRow(3).getCell(2).getStringCellValue();
		System.out.println(data1);
		
		wb.close();

	}

}
