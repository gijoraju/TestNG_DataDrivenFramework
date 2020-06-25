package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	
	
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
	
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
		String title=homePage.verifyHomePageTitle();
		System.out.println("Title is "+title);
		//this message will be printed only when the test case is failed
		Assert.assertEquals(title, "Cogmento CRM","Home Page title not matched");		
		
	}
	
	@Test(priority=2)
	public void verifyCorrectUserNameLabel() {
		//homePage.verifyCorrectUserName()
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	
	public void verifyContactsLinkTest() {
		contactsPage= homePage.clickOnContacts();
		
	}
	
	
	 
}
