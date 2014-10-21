package com.amazon.testpages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSelectDeliveryAdressPage {
	
	@FindBy(xpath = "//*[@id='enterAddressFullName']")
	public WebElement FullName;
	@FindBy(xpath= "//*[@id='enterAddressAddressLine1']")
	public WebElement addressLine1;
	@FindBy(xpath="//*[@id='enterAddressAddressLine2']")
	public WebElement addressLine2;
	@FindBy(xpath = "//*[@id='enterAddressCity']")
	public WebElement enterAddressCity;
	@FindBy(xpath="//*[@id='enterAddressStateOrRegion']")
	public WebElement county;
	
	@FindBy(xpath="//*[@id='enterAddressPostalCode']")
	public WebElement postcode;
	@FindBy(xpath="//*[@id='enterAddressCountryCode']")
	public WebElement country;
	@FindBy(xpath="//*[@id='enterAddressPhoneNumber']")
	public WebElement phoneNumber;
	@FindBy(name ="shipToThisAddress")
	public WebElement continuebutton;
	
	//xpath of delivery address - //*[@id="AVS"]/div[2]/form/div/div[2]/div/div/div/span/input
	@FindBy(name="useSelectedAddress")
	public WebElement deiveryAddress;
	@FindBy(xpath="//*[@id='addr_0']")
	public WebElement OriginaladdrsRdBtn;
	
	private WebDriver driver;
	
	public AmazonSelectDeliveryAdressPage (WebDriver driver){
		this.driver=driver;
	}

	public AmazonChooseDeliveryOption selectAddress(){
		System.out.println("select address");
		FullName.sendKeys("Reddy9");
		addressLine1.sendKeys("Flat8");
		addressLine2.sendKeys("scammell way");
		enterAddressCity.sendKeys("watford");
		county.sendKeys("hertfordshire");
		postcode.sendKeys("wd18 6GE");
	    //dropdown
		//country.sendKeys("united kingdom");
		phoneNumber.sendKeys("07756986734");
		continuebutton.click();
		deiveryAddress.click();
	
	return PageFactory.initElements(driver, AmazonChooseDeliveryOption.class);
}
	
}
