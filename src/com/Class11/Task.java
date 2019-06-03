package com.Class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Method.CommonMethods;

public class Task extends CommonMethods {
	static String expected="File uploaded!";

	public static void main(String[] args) throws InterruptedException {
		String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);
		takeScreenshot("TheInternet", "Login");
		String filePath="C:\\Users\\Samsung\\Desktop\\file.txt";
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();
		
		takeScreenshot("TheInternet", "Upload1");
		
		String textActual=getAlertText();
		if (textActual.equals(expected)) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File uploaded successfully");
		}
		acceptAlert();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(pic, new File("screenshots/TheInternet/file.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
