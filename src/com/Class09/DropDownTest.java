package com.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Method.CommonMethods;

public class DropDownTest extends CommonMethods{

	public static void main(String[] args) {
		String url="https://www.toolsqa.com/automation-practice-form/";
		setUpDriver("chrome", url);
		WebElement countriesDD=driver.findElement(By.xpath("//*[@id=\"continents\"]/option[4]"));
		selectValueFromDD(countriesDD, "Australia");
	
	}

}
