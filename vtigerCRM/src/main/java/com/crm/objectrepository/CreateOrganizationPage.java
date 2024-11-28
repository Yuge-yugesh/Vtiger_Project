package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	@FindBy(className = "detailedViewTextBox")
	private WebElement organizationNameTextFeild;
	
	@FindBy(className = "dvHeaderText")
	private WebElement organizationInformationpage;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(name = "industry")
	private WebElement industryDropDownButton;
	
	@FindBy(id = "dtlview_Industry")
	private WebElement industryFeild;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationNameTextFeild() {
		return organizationNameTextFeild;
	}

	public WebElement getOrganizationInformationpage() {
		return organizationInformationpage;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getIndustryDropDownButton() {
		return industryDropDownButton;
	}

	public WebElement getIndustryFeild() {
		return industryFeild;
	}
}
