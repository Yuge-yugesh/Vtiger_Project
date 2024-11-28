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
public class TC_VT_003_Test extends BaseClass{
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getOrganizationsButton().click();
		
		OrganizationPage orgpage=new OrganizationPage(driver);
		orgpage.getCreateIconLink().click();
		
		CreateOrganizationPage createOrgPage=new CreateOrganizationPage(driver);
		Assert.assertTrue(createOrgPage.getOrganizationNameTextFeild().isDisplayed(),"Create Organization Page is Not Displayed");
		test.log(Status.PASS, "Create Organization Page is Displayed");
		
		String organizationName = eutil.getStringDataFromExcel("Organizations", 1, 0)+jutil.getRandomNumber();
		createOrgPage.getOrganizationNameTextFeild().sendKeys(organizationName);
		createOrgPage.getSaveButton().click();
		
		String headertext = createOrgPage.getOrganizationInformationpage().getText();
		System.out.println(headertext);
		
		Assert.assertTrue(headertext.contains(organizationName),"Organization is not Created");
		test.log(Status.PASS, "Organization is created");
	}
}
