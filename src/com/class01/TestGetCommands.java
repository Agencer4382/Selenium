package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			getCommands();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void getCommands() {
		try {
			driver.get("http://www.amazon.com");
			driver.findElement(By.linkText("Your Amazon.com")).click();
			driver.findElement(By.id("ap_email")).sendKeys("Asimgencer4382@gmail.com");
			driver.findElement(By.id("ap_password")).sendKeys("musa4382he.");
			driver.navigate().back();
//			String title=driver.getTitle();
//			System.out.println("Title of the page is "+title);
//			driver.findElement(By.linkText("Today's Deals")).click();
//			String url=driver.getCurrentUrl();
//			System.out.println("The current url is "+url);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mac Book");
			driver.findElement(By.className("nav-input")).click();
			driver.navigate().back();
			driver.findElement(By.className("nav-a")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestGetCommands obj = new TestGetCommands();
		obj.invokeBrowser();
		
	}

}
