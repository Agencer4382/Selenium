package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	 WebDriver driver;

	public static void main(String[] args) {
		AbsoluteXpath obj=new AbsoluteXpath();
		obj.invokeBrowser();
		
		
		
		
	}
public void invokeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	 getXpath();
	 
}
public void getXpath() {
	 driver.get("https://www.saucedemo.com/");
		// driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name='firstname']")).sendKeys("name");
		 driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
}


}
