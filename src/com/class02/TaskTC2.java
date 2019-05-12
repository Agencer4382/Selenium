package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTC2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com");
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if(title.contains("Syntax")) {
			
			System.out.println("Title does contain.");
		}else {
			System.out.println("Title does not contain.");
		}
		driver.close();
		
		
	}

}
