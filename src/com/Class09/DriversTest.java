package com.Class09;

import com.Method.CommonMethods;

public class DriversTest extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "http://google.com");
		driver.quit();

	}

}
