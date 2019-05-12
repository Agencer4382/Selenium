package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("amazon.com")) {
			System.out.println("this is the right title.");
		}else {
			System.out.println("sorry this not right title.");
		}
		
	}

}
