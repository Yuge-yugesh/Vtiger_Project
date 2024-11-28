package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createIconLink;
	
	@FindBy(xpath = "//a[contains(text(),'yuge')]")
	private WebElement organization;
	
	public WebElement getOrganization() {
		return organization;
	}

	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateIconLink() {
		return createIconLink;
	}
}
