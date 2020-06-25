package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//pagefactory/object repository  of the login page has to be defined
	
	
	@FindBy(xpath="//input[@placeholder='E-mail address']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	
	@FindBy(xpath=" //div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signupBtn;
	

	//initialise the pagefactory, all the above elements will be initialised with this driver
	//login page constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		return title;
		
		
	}
	
	public String validateCRMImage() {
		System.out.println("We do not have the web image object");
		String img="TESTNG";
		
		return img;
		
		
	}
	
	public HomePage login(String em, String ps) {
		
		email.sendKeys(em);
		password.sendKeys(ps);
		loginBtn.click();
		
		return new HomePage();
		
	}
	
	
}
