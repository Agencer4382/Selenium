package com.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Method.CommonMethods;

public class DoubleClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","https://www.saucedemo.com" );
	
		driver.findElement(By.id("password")).sendKeys("123ag");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("password"))).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
