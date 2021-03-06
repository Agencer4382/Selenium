package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.lsu.utils.BaseClass;
import com.syntax.lsu.utils.CommonMethods;


public class LoginPage extends BaseClass{
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
public void login(String uname, String pwd) {
	CommonMethods.sendText(username, uname);
	CommonMethods.sendText(password, pwd);
	CommonMethods.click(loginBtn);
}
}
