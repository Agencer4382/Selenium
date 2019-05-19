package com.Class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=0;
		System.out.println("Total number of links = "+links.size());
		Iterator<WebElement>it=links.iterator();
		
		while(it.hasNext()) {
		
			String linkText=it.next().getText();
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
		}
	}
		System.out.println("Total number of links with text = "+count);
		driver.quit();
	}

}
