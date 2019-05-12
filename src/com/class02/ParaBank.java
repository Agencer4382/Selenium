package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
		driver.findElement(By.id("customer.firstName")).sendKeys("Kevin");
		driver.findElement(By.name("customer.lastName")).sendKeys("Cool");
		driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
		driver.findElement(By.id("customer.address.city")).sendKeys("EngleWood");
		driver.findElement(By.id("customer.address.state")).sendKeys("NJ");
		driver.findElement(By.id("customer.username")).sendKeys("Kevin123");
		driver.findElement(By.id("customer.password")).sendKeys("kevin14533");
	}   
	
	

}
