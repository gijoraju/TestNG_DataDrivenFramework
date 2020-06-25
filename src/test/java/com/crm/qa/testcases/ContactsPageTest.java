package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
	
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		contactsPage=homePage.clickOnContacts();
		Thread.sleep(5000);
	}
	

	@Test(priority=1)
	public void verifyContactsLabelTest() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contacts Label missing");
		
	}
	
	@Test(priority=2)
	public void selectAddressTabTest() {
		contactsPage.selectAddressTab();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
}
