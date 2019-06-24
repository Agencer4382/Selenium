package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath) {
		
		try {
			File src= new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		}  catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	public String getData(int sheetNum, int row, int col) {
		
		sheet= wb.getSheetAt(sheetNum);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//XSSFWorkbook wb;
//XSSFSheet sheet;
//
//public ExcelDataConfig(String excelPath) {
//	
//	
//	try {
//		File src = new File(excelPath);
//		FileInputStream fis= new FileInputStream(src);
//		
//		wb = new XSSFWorkbook(fis);
//		
//	}  catch (Exception e) {
//		
//		System.out.println(e.getMessage());
//	}
//    
//}
//public String getData(int sheetNum, int row, int col ) {
//	
//	sheet=wb.getSheetAt(sheetNum);
//	
//	String data=sheet.getRow(row).getCell(col).getStringCellValue();
//	return data;
//	
//}