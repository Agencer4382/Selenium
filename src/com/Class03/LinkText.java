package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	WebDriver driver;

	public static void main(String[] args) {
		LinkText obj= new LinkText();
		obj.getInvokeBrowser();
		
	}
	public void getInvokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		getMercury();
	}
	public void getCommands() {
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("firstname")).sendKeys("kevin");
//		driver.findElement(By.name("lastname")).sendKeys("Kurt");
//		driver.findElement(By.id("u_0_o")).sendKeys("201750457");
//		driver.findElement(By.id("u_0_v")).sendKeys("kurt12345");
//		driver.findElement(By.id("day")).sendKeys("13");
//		driver.findElement(By.id("month")).sendKeys("05");
//		driver.findElement(By.id("year")).sendKeys("1985");
//		driver.findElement(By.id("u_0_a")).click();
//		driver.findElement(By.id("u_0_11")).click();
		
	}
	public void getMercury() {
		try {
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys("Kevin");
			driver.findElement(By.name("lastName")).sendKeys("Kurt");
			driver.findElement(By.name("phone")).sendKeys("123456789");
			driver.findElement(By.id("userName")).sendKeys("kevin123@gmail.com");
			driver.findElement(By.name("address1")).sendKeys("10 hov st");
			driver.findElement(By.name("city")).sendKeys("clifton");
			driver.findElement(By.name("postalCode")).sendKeys("10003");
			driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}
	

}
