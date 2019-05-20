package com.Class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class HwTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		selectValueInvoke(day, "13");
		Thread.sleep(2000);
		selectValueInvoke(month, "10");
		Thread.sleep(2000);
		selectValueInvoke(year, "1985");
		
		Select selectDay= new Select(day);
		List<WebElement>listDay=selectDay.getOptions();
		listDay.size();
		int ttlDay=listDay.size()-1;
		System.out.println("Day size is = "+ttlDay);

		Select selectMonth= new Select(month);
		List<WebElement>listElement=selectDay.getOptions();
		listElement.size();
		int ttlMonth=listElement.size()-1;
		System.out.println("Month size is = "+ttlMonth);

		Select selectYear= new Select(year);
		List<WebElement>listYear= selectYear.getOptions();
		int ttlYear=listYear.size()-1;
		System.out.println("Year size is = "+ttlYear);

		Thread.sleep(4000);
		driver.quit();
		

	}

	public static void selectValueInvoke(WebElement element, String value) {
		Select selectedValue= new Select(element);
		selectedValue.selectByValue(value);
	}
	
}
