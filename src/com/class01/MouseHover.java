package com.class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		WebElement ele= driver.findElement(By.linkText("Electronics"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement>list=driver.findElements(By.xpath("//li[@data-hover-track='p2481888.m1381.l6435']//a"));
		System.out.println("List size is = "+list.size());
		for(WebElement element: list) {
			String text=element.getAttribute("innerHTML");
			System.out.println("Link name is "+text);
			if(text.equalsIgnoreCase("iPhones")) {
				Thread.sleep(3000);
				element.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
