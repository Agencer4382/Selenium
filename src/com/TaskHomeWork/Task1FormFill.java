package com.TaskHomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Method.CommonMethods;

public class Task1FormFill extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://uitestpractice.com/");
		driver.findElement(By.cssSelector("a[href='/Students/Form']")).click();
		sendText(driver.findElement(By.cssSelector("input[id$=\"firstname\"]")), "Kevin");
		sendText(driver.findElement(By.cssSelector("input[id$=\"lastname\"]")), "Kurt");
		Thread.sleep(1000);
		clickRadiAndChechk(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[2]")));
		Thread.sleep(1000);
		clickRadiAndChechk(driver.findElement(By.cssSelector("input[value=\"dance\"]")));
		Thread.sleep(1000);
		clickRadiAndChechk(driver.findElement(By.cssSelector("input[value^=re]")));
		Thread.sleep(1000);
		selectValueFromDD(driver.findElement(By.cssSelector("select[id=\"sel1\"]")), "Canada");
		Thread.sleep(1000);

		driver.findElement(By.id("datepicker")).click();
		selectValueFromDD(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")), "Nov");
		selectValueFromDD(driver.findElement(By.cssSelector("select[data-handler=\"selectYear\"]")), "1984");
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")).click();

		sendText(driver.findElement(By.id("phonenumber")), "123456789");
		Thread.sleep(1000);
		sendText(driver.findElement(By.id("username")), "kevin1234");
		Thread.sleep(1000);
		sendText(driver.findElement(By.cssSelector("input[placeholder*=\"Email\"]")), "kevin123@gmail.com");
		Thread.sleep(1000);
		sendText(driver.findElement(By.id("comment")), "Syntax Student");
		Thread.sleep(1000);
		sendText(driver.findElement(By.id("pwd")), "truecrypt");
		Thread.sleep(1000);
		clickRadiAndChechk(driver.findElement(By.cssSelector("button[class$=\"default \"]")));

		driver.quit();
		Thread.sleep(5000);

	}

}
