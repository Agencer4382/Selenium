package com.class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Method.CommonMethods;

public class MouseHover extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.ebay.com/");
		WebElement ele= driver.findElement(By.linkText("Electronics"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement>links=driver.findElements(By.xpath("//li[@data-hover-track='p2481888.m1381.l6435']//a"));
		System.out.println("Link size : "+links.size());
		for(WebElement element: links) {
			String text=element.getAttribute("innerHTML");
			System.out.println("Link name is "+text);
			if(text.equalsIgnoreCase("iPhones")) {
				element.click();
				break;
			}
		}
	   Thread.sleep(3000);
		driver.quit();
		

	}

}
