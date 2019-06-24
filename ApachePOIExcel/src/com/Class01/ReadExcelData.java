package com.Class01;

import library.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfig obj= new ExcelDataConfig("C:\\Users\\Samsung\\Desktop\\test2.xlsx");
		
		System.out.println(obj.getData(2, 0, 3));

	}

}
