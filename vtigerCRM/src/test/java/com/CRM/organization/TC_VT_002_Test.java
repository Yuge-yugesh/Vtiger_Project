package com.CRM.organization;

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
public class TC_VT_002_Test extends BaseClass{
	@Test(groups = "smoke")
	public void clickOnOrganization() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getOrganizationsButton().click();
		Assert.assertEquals(driver.getTitle(),eutil.getStringDataFromExcel("Organizations", 1, 0));
		test.log(Status.PASS, "Organizations page is displayed");
	}
}
