package com.Class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		WebElement elementDD=driver.findElement(By.id("gh-cat"));
		Select select=new Select(elementDD);
		select.selectByVisibleText("Clothing, Shoes & Accessories");
		Thread.sleep(2000);
		select.selectByVisibleText("Business & Industrial");
		List<WebElement>list=select.getOptions();
		System.out.println("Ebay department size = "+list.size());
		for(WebElement element:list) {
			System.out.println("Ebay department name list = "+element.getText());
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
