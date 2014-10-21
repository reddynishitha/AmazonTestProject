package com.amazon.testpages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSelectedItemPageDisplay {
	@FindBy(xpath="//*[@id='bb_atc_button']")
	public WebElement addtoBasketbtn;
	
	
	private WebDriver driver;
	public AmazonSelectedItemPageDisplay(WebDriver driver){
		this.driver=driver;
	}

	public AddingProductsToBasket AddtoBasket(){
		
		addtoBasketbtn.click();
		
		return PageFactory.initElements(driver, AddingProductsToBasket.class);
		
	}
	
    public AddingProductsToBasket SelectItemPreferences(){
		
		//addtoBasketbtn.click();
		
		return PageFactory.initElements(driver, AddingProductsToBasket.class);
    }
	
	
}
