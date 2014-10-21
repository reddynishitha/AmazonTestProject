package com.amazon.testpages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegistrationPage {
	@FindBy(xpath = "//*[@id='ap_customer_name']")
	public WebElement customername;
	@FindBy(xpath= "//*[@id='ap_email']")
	public WebElement emailAdress;
	@FindBy(xpath = "//*[@id='ap_email_check']")
	public WebElement emailCheck;
	@FindBy(xpath="//*[@id='ap_phone_number']")
	public WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id='ap_password']")
	public WebElement regpassword;
	@FindBy(xpath="//*[@id='ap_password_check']")
	public WebElement regPasswordCheck;
	@FindBy(xpath="//*[@id='continue-input']")
	public WebElement inputButton;
	
	private WebDriver driver;
	
	public AmazonRegistrationPage (WebDriver driver){
		this.driver=driver;
	}

	public AmazonSelectDeliveryAdressPage registerUser(String myemailadress){
		customername.sendKeys("test90");
		emailAdress.clear();
		emailAdress.sendKeys(myemailadress);
		emailCheck.sendKeys(myemailadress);
		phoneNumber.sendKeys("12352143555");
		regpassword.sendKeys("deetu12");
		regPasswordCheck.sendKeys("deetu12");
		inputButton.click();
		//Assert.assertEquals(driver.getTitle(), "Enter the delivery address for this order");
		
		return PageFactory.initElements(driver, AmazonSelectDeliveryAdressPage.class);	
		
	}
	
	
}
