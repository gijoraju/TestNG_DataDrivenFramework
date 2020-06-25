package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	
	@FindBy(xpath="//th[contains(text(),'Address')]")
	WebElement addressText;
	
	@FindBy(xpath="//th[contains(text(),'Address')]")
	WebElement addressText1;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean verifyContactsLabel() {
		return addressText.isDisplayed();
		
	}
	
	public void selectAddressTab() {
		addressText1.click();
		
	}
	
	
	

	
}



