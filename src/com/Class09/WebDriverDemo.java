package com.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Method.CommonMethods;

public class WebDriverDemo extends CommonMethods{

	public static void main(String[] args) {
		String url="http://uitestparctise.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("AjaxCall")).click();
		driver.findElement(By.linkText("This is a Ajax link")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.ContactUs")));
	
	WebElement ele=	driver.findElement(By.cssSelector("div.ContactUs"));
	if(ele.isDisplayed()) {
		String text =ele.getText();
		System.out.println(text);
	}else {
		System.out.println("Element is not displayed");
	}
	driver.quit();
	}

}
