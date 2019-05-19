package com.class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> listElement=driver.findElements(By.name("sex"));
		String valueOfElement="2";
		for(WebElement element: listElement) {
			if(element.isEnabled()) {
				System.out.println(element.getAttribute("value")+" is clickable");
				
			}else {
				System.out.println(element.getAttribute("value")+" is NOT clickable");
			}
			String value=element.getAttribute("value");
			if(value.equals(valueOfElement)) {
				element.click();
			}
		}
				
	}

}
