package com.CRM.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectrepository.ContactsPage;
import com.crm.objectrepository.CreateContactPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationPage;

@Listeners(ListenerUtility.class)
public class TC_VT_004_Test extends BaseClass{
	@Test
	public void createContactWithOrganization() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getContactsButton().click();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.getContactIconLink().click();
		
		CreateContactPage createconpage=new CreateContactPage(driver);
		String cc = eutil.getStringDataFromExcel("createContact", 1, 0);
		createconpage.getLastNameTextFeild().sendKeys(cc);
		
		createconpage.getSelectIcon().click();
		wutil.switchToWindow(driver, "Accounts&action");
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.getOrganization().click();
		
		wutil.switchToWindow(driver, "Contacts&action");
		
		
		createconpage.getSaveLink().click();
		
	}
}
