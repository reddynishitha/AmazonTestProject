package com.amazon.testpages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonChooseDeliveryOption {

	@FindBy(xpath ="//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]/span/input")
			public WebElement continueBtn;


    @FindBy(xpath="//*[@id='order_0_ShippingSpeed_Std UK Dom']")
			public WebElement standarddeliveryRadiobtn;


	private WebDriver driver;
	
	public AmazonChooseDeliveryOption(WebDriver driver){
		this.driver=driver;
	}
	
    public AmazonChooseDeliveryOption chosedeliveryoption(){
    	continueBtn.click();
    	//Assert.assertEquals(driver.getTitle(), "Select Shipping Options - Amazon.co.uk Checkout");
		return PageFactory.initElements(driver, AmazonChooseDeliveryOption.class);
    	
    }

}
    