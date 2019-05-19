package com.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.cssSelector("input[type='text']"));
		username.sendKeys(userName);
		WebElement pass=driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys(password);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		WebElement pic=driver.findElement(By.cssSelector("div[class='peek']"));
		WebElement pro=driver.findElement(By.cssSelector("div[class='product_label']"));
		
		
		System.out.println("Icon is displayed--> "+pic.isDisplayed());
		System.out.println("Prtoduct is displayed--> "+pro.isDisplayed());
		System.out.println("Prtoduct is displayed--> "+pro.getText());
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
