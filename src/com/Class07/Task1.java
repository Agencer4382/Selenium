package com.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Method.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		boolean inter=driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(inter) {
			
			driver.switchTo().defaultContent();
			driver.close();
			
		}
		

		
	}

}
