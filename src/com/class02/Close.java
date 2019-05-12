package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:cnn.com");
		//driver.close();// close one tab
		driver.quit();//close entire browser
		
	}

}
