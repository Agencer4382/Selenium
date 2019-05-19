package com.Class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String valueToSelect = "Selenium Webdriver";
		List<WebElement> yearsOfEx= driver.findElements(By.name("tool"));
		System.out.println("Size of Automation tool is "+yearsOfEx.size());
		for (WebElement element : yearsOfEx) {
			String value=element.getAttribute("value");
			if(value.equals(valueToSelect)) {
				element.click();
			
				
		}
	}
		Thread.sleep(2000);

		//driver.quit();
	}

}
