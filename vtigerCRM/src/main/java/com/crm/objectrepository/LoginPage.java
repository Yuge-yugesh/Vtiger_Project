package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath = "//input [@type='text']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input [@type='password']")
	private WebElement passwordTextFeild;
	
	@FindBy(id = "submitButton")
	private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}


	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}
}
