package com.amazon.testpages;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	@FindBy(xpath = "//*[@id='ap_email']")
	public WebElement emailAdress;
	@FindBy(xpath= "//*[@id='ap_signin_create_radio']")
	public WebElement NewCustmrRadioBtn;
	@FindBy(xpath = "//*[@id='signInSubmit-input']")
	public WebElement SigninButton;
	@FindBy(xpath="//*[@id='ap_password']")
	public WebElement returningCustmrPwd;
			
	private WebDriver driver;
	
	public AmazonLoginPage (WebDriver driver){
		this.driver=driver;
	}

	public AmazonRegistrationPage NewCustomerSignIn(String myemailAdress){
		System.out.println(driver.getTitle());
		emailAdress.sendKeys(myemailAdress);
		NewCustmrRadioBtn.click();
		SigninButton.click();
		return PageFactory.initElements(driver, AmazonRegistrationPage.class);
		
	}
	public AmazonLoginPage  Existingcustomer(String myemailAddress, String myPassword) {
		emailAdress.sendKeys(myemailAddress);
		returningCustmrPwd.sendKeys(myPassword);
		SigninButton.click();
		
		return PageFactory.initElements(driver, AmazonLoginPage.class);	
	}
	
	
}
