package com.CRM.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationPage;

@Listeners(ListenerUtility.class)
public class TC_VC_005_Test extends BaseClass{
	@Test
	public void createOrganizationWithIndustryDropDown() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getOrganizationsButton().click();
		
		OrganizationPage orgpage=new OrganizationPage(driver);
		orgpage.getCreateIconLink().click();
		
		CreateOrganizationPage createorgpage=new CreateOrganizationPage(driver);
		String orgname = eutil.getStringDataFromExcel("Organizations", 1, 0)+jutil.getRandomNumber();
		createorgpage.getOrganizationNameTextFeild().sendKeys(orgname);
		
		wutil.selectByVisibleText(createorgpage.getIndustryDropDownButton(), eutil.getStringDataFromExcel("Organizations", 2, 1));
		createorgpage.getSaveButton().click();
		
		Assert.assertEquals(createorgpage.getIndustryFeild().getText(), eutil.getStringDataFromExcel("Organizations", 2, 1));
		test.log(Status.PASS, "Organization is created with Industry name===>"+createorgpage.getIndustryFeild().getText());
	}
}
