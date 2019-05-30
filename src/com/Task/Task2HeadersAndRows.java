package com.Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Method.CommonMethods;

public class Task2HeadersAndRows extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();	
	    clickRadiAndChechk(driver.findElement(By.xpath("//a[text()='Order']")));
	    selectValueFromDD(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]")), "MyMoney");
		sendText(driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")), "5");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")), "Kevin KURT");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")), "21 Loop Avenue");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")), "Java");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")), "07015");
		clickRadiAndChechk(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]")));
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")), "123456789");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")), "10/20");
		clickRadiAndChechk(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")));
		clickRadiAndChechk(driver.findElement(By.xpath("//a[text()='View all orders']")));
		
		WebElement isDisplay=driver.findElement(By.xpath("//td[text()='Kevin KURT']"));
		String textDis=isDisplay.getText();
		System.out.println("New order is display the screen : "+textDis);
		Thread.sleep(3000);
		WebElement orderDetails1=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[13]/input"));
		orderDetails1.click();
		System.out.println("Order details edit.");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")), "21 Loop Avenue");
		Thread.sleep(2000);
		clickRadiAndChechk(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")));
		System.out.println("Street adress is updated.");
		Thread.sleep(2000);
		clickRadiAndChechk(driver.findElement(By.xpath("//a[text()='View all orders']")));
		
		
		List<WebElement>row=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("Row size is : "+row.size());
		
		List<WebElement>col=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr/th"));
		System.out.println("Column size is : "+col.size());
		
		String expectedValue="21 Loop Avenue";
		for(int i=1; i<=row.size(); i++) {
			String rowText=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr["+i+"]")).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr["+i+"]/td[6]")).getText();
				System.out.println("New Order details : "+rowText);
			}
		}
		driver.quit();
		Thread.sleep(5000);
		
		
	}

}
