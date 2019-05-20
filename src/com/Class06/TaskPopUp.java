package com.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Samsung\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
	    Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		String text= alert.getText();
		if(text.equalsIgnoreCase("I am an alert box!")) {
			System.out.println(text);
			alert.accept();
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
		Alert alert1=driver.switchTo().alert();
		String text1=alert1.getText();
		if(text1.equalsIgnoreCase("Press a button!")) {
			System.out.println(text1);
			Thread.sleep(2000);
			alert1.accept();
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick*='P']")).click();
		Alert alert2= driver.switchTo().alert();
		String text2=alert2.getText();
		if(text2!=null) {
			alert2.sendKeys("Kevin");
			System.out.println(text2);
			Thread.sleep(2000);
			alert2.accept();
		
		}
			 
		
		Thread.sleep(3000);
		driver.quit();
	}

}
