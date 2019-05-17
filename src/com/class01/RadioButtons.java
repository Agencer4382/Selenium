package com.class01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	WebDriver driver;

	public static void main(String[] args) {
		RadioButtons obj= new RadioButtons();
		obj.invokeBrowser();
		

	}
	public void getRadioAndCheckbox() {
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kevin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cool");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.xpath("//input[@name='exp' and @type='radio' and @value=1]")).click();
		driver.findElement(By.id("exp-3")).click();
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-0")).click();
		driver.findElement(By.id("tool-1")).click();
		
		
	}
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		getRadioAndCheckbox();
		
		
	}
	

}
