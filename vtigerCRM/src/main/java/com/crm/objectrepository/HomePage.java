package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Calendar")
	private WebElement CalenderButton;
	
	@FindBy(linkText = "Leads")
	private WebElement LeadsButton;
	
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationsButton;
	
	@FindBy(linkText = "Contacts")
	private WebElement ContactsButton;
	
	@FindBy(linkText = "Opportunities")
	private WebElement OpportunitiesButton;
	
	@FindBy(linkText = "Products")
	private WebElement ProductsButton;
	
	@FindBy(linkText = "Documents")
	private WebElement DocumentsButton;
	
	@FindBy(linkText = "Email")
	private WebElement EmailButton;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTicketsButton;
	
	@FindBy(linkText = "Dashboard")
	private WebElement DashboardButton;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement profileIcon;
	
		
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCalenderButton() {
		return CalenderButton;
	}

	public WebElement getLeadsButton() {
		return LeadsButton;
	}

	public WebElement getOrganizationsButton() {
		return OrganizationsButton;
	}

	public WebElement getContactsButton() {
		return ContactsButton;
	}

	public WebElement getOpportunitiesButton() {
		return OpportunitiesButton;
	}

	public WebElement getProductsButton() {
		return ProductsButton;
	}

	public WebElement getDocumentsButton() {
		return DocumentsButton;
	}

	public WebElement getEmailButton() {
		return EmailButton;
	}

	public WebElement getTroubleTicketsButton() {
		return TroubleTicketsButton;
	}

	public WebElement getDashboardButton() {
		return DashboardButton;
	}

	public WebElement getSignoutButton() {
		return signoutButton;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}
	
	}
