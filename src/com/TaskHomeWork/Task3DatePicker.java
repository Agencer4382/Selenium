package com.TaskHomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Method.CommonMethods;

public class Task3DatePicker extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://jqueryui.com/";
		setUpDriver("chrome", url);
		clickRadiAndChechk(driver.findElement(By.xpath("//a[text()='Datepicker']")));
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		switchToFrame(frame);
		Thread.sleep(2000);
		clickRadiAndChechk(driver.findElement(By.xpath("//*[@id=\"datepicker\"]")));

		String expectedDate = "August 2019";
		
		for (int i = 1; i <= 12; i++) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			Thread.sleep(2000);
			String currentDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if (expectedDate.equalsIgnoreCase(currentDate)) {
				System.out.println("Mounth selected : " + currentDate);
				break;
			}
		}

		String expectedDay = "10";
		List<WebElement> cells = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a"));
				for (WebElement cell : cells) {
					String cellText = cell.getText();
			if (cellText.equals(expectedDay)) {
				cell.click();
				System.out.println("Expected is selected : " + cellText);
			}
		}
		Thread.sleep(4000);
		driver.quit();

	}

}
