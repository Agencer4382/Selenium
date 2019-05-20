package com.Class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Method.CommonMethods;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();
		//working with Single DD
		WebElement countriesDD=driver.findElement(By.id("countriesSingle"));

		CommonMethods.selectValueFromDD(countriesDD, "United states of America");

		//working with muplitple DD
		WebElement elementDD= driver.findElement(By.id("countriesMultiple"));
		Select select= new Select(elementDD);
		List<WebElement> list=select.getOptions();
		int listSize=list.size();
		System.out.println("Multiple select size = "+listSize);
		for(WebElement element:list) {
			element.click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
