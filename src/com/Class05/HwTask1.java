package com.Class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwTask1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Kevin");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Space");
		Thread.sleep(2000);
		List<WebElement> sexRadio = driver.findElements(By.name("sex"));
		String valueSelected = "Male";
		for (WebElement element : sexRadio) {
			if (element.isEnabled()) {
				System.out.println(element.getAttribute("value") + " is clickable.");
			} else {
				System.out.println(element.getAttribute("value") + " is NOT clickable.");

			}
			String value = element.getAttribute("value");
			// System.out.println(value);
			if (value.equals(valueSelected)) {
				element.click();
		}
		}
		System.out.println("\n----------Years Of Experience----------");
		Thread.sleep(2000);
		List<WebElement> yearsOfEx = driver.findElements(By.name("exp"));
		for (WebElement element1 : yearsOfEx) {
			if (element1.isEnabled()) {
				System.out.println(element1.getAttribute("value") + " is clickable.");

			} else {
				System.out.println(element1.getAttribute("value") + " is NOT clickable.");

			}

		}
		// Select both checkboxes for profession
		Thread.sleep(2000);
		List<WebElement> profession = driver.findElements(By.name("profession"));
		for (WebElement element2 : profession) {
			if (element2.isEnabled()) {
				element2.click();
			}
		}
		System.out.println("\n-----------Check all Automation Tools--------");
		Thread.sleep(2000);
		List<WebElement> automationTool = driver.findElements(By.name("tool"));
		String valueSelected1 = "Selenium Webdriver";
		for (WebElement element3 : automationTool) {
			if (element3.isEnabled()) {
				System.out.println(element3.getAttribute("value") + " is clickable. ");
			} else {
				System.out.println(element3.getAttribute("value") + " is NOT clickable. ");
			}
			String value1 = element3.getAttribute("value");
			if (value1.equals(valueSelected1)) {
				element3.click();
			}

		}
		Thread.sleep(4000);

		driver.quit();

	}

}
