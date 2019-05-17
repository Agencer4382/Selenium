package com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[contains(@type,'pas')]")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("kevin@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("123456");
	}

}
