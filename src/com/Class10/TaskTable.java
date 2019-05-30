package com.Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Method.CommonMethods;

public class TaskTable extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/tables");
		List <WebElement> row=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println("Number of rows ="+row.size());
		
		
		for (WebElement ele: row) {
			String text=ele.getText();
			System.out.println(text);
		}
		List <WebElement> col=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		System.out.println("Number of colums ="+col.size());
		
		
		for (WebElement ele1: col) {
			String text1=ele1.getText();
			System.out.println(text1);
		}
		

		Thread.sleep(3000);
		driver.quit();
		
	}

}
