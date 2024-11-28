package com.CRM.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass{
	@Test(groups="smoke")
	
	public void clickOnContacts() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getContactsButton().click();
		Assert.assertEquals(driver.getTitle(),eutil.getStringDataFromExcel("contacts", 1, 0));
		test.log(Status.PASS, "Contacts page is displayed");
	}
}
