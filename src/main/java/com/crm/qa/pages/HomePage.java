package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath=" //span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;

	//initialise the pagefactory, all the above elements will be initialised with this driver
	//login page constructor

public HomePage() {
	PageFactory.initElements(driver, this);
	
}

public String verifyHomePageTitle() {
	
	return driver.getTitle();
	
}

public boolean verifyCorrectUserName() {
	
	return userNameLabel.isDisplayed();
}


public ContactsPage clickOnContacts() {
	contactsLink.click();
	//this method should return new Conatcts page object
	return  new ContactsPage();
}


public DealsPage clickOnDeals() {
	
	dealsLink.click();
	return new DealsPage();
	
}


public TasksPage clickOntasks() {
	tasksLink.click();
	return new TasksPage();
	
}


}











