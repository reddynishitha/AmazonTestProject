package com.amazon.testpages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingProductsToBasket {
private WebDriver driver;
	
	/*@FindBy(css="#result_0 .title a")
	private WebElement topResultTitle;*/
    @FindBy(xpath = "//*[@id='hlb-view-cart']")
	private WebElement basketlink;
    @FindBy(xpath = "//*[@id='a-autoid-0-announce']")
	private WebElement basketBtn;
	public AddingProductsToBasket(WebDriver driver) {
		this.driver = driver;
	}

	public AmazonEditBasketPage ClickEdit() {
		// TODO Auto-generated method stub
		
		try {
           if(basketlink.isEnabled()){
        	   basketlink.click();
           }
           
		} catch (Exception name) {
			if(basketBtn.isEnabled()){
				basketBtn.click();
	           }
		}
		
		return PageFactory.initElements(driver, AmazonEditBasketPage.class);
	}

}
