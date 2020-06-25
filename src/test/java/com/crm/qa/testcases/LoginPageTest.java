package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
	
		initialization();
		loginPage = new LoginPage();	
		
	}
	
	@Test(priority=1)
	
	public void loginTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	
	public void crmImageLogoTest() {
		String image= loginPage.validateCRMImage();
		Assert.assertEquals(image, "TESTNG");
		
	}
	
	
	@Test(priority=3)
	
	public void loginTest() {
		
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
