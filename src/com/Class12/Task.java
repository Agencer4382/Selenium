package com.Class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Method.CommonMethods;

public class Task extends CommonMethods {
	Properties prop;
	
	@Test
	public void readFile() {
	
		
		String filePath="src/configs/credential.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		sendText(driver.findElement(By.id("txtUsername")), "Admin");
		sendText(driver.findElement(By.id("txtPassword")), "admin123");
		clickRadiAndChechk(driver.findElement(By.id("btnLogin")));
	
		CommonMethods.driver.quit();
	}

}
