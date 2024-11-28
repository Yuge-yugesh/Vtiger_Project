package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(name = "lastname")
	private WebElement lastNameTextFeild;
		
	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement selectIcon;
	
	@FindBy(name = "button")
	private WebElement saveLink;
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}

	public WebElement getSelectIcon() {
		return selectIcon;
	}

	public WebElement getSaveLink() {
		return saveLink;
	}
}
