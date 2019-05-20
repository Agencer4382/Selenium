package com.Class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		WebElement departmentDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(departmentDD);
		List<WebElement> list=select.getOptions();
		System.out.println("Departmens = "+list.size());
		
		List<WebElement>listDD=select.getOptions();
		System.out.println(listDD.size());
		for(WebElement element:listDD) {
		
			System.out.println(element.getText());
			
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();
	}

}
