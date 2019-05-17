package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samsung\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kevin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cool");
		
		WebElement sexBtn=driver.findElement(By.id("sex-0"));
		sexBtn.click();
		//WebElement experinceBtn=driver.findElement(By.xpath("//input[@name='exp' and @type='radio' and @value=3]"));
		//experinceBtn.click();
		Thread.sleep(2000);
		WebElement experinceBtn=driver.findElement(By.id("exp-3"));
		experinceBtn.click();
		Thread.sleep(2000);
		WebElement professionBtn=driver.findElement(By.id("profession-1"));
		professionBtn.click();
		Thread.sleep(2000);
		WebElement automationdBtn=driver.findElement(By.id("tool-0"));
		automationdBtn.click();
		//driver.findElement(By.id("tool-1"));
		
		System.out.println("Sex box is selected? "+sexBtn.isSelected());
		System.out.println("Year of experince box is selected? "+experinceBtn.isSelected());
		System.out.println("Prefession box is selected? "+professionBtn.isSelected());
		System.out.println("Automation tool box is selected? "+automationdBtn.isSelected());
		
	}

}
