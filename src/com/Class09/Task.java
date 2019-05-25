package com.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Method.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele=	driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		
		if(ele.isDisplayed()) {
			String text =ele.getText();
			System.out.println("Element is : "+text);
		}else {
			System.out.println("Element is not displayed");
		}
		driver.quit();

	}

}
