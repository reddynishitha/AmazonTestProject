package com.amazon.testpages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonEditBasketPage {
	@FindBy(xpath ="//*[@id='a-autoid-2-announce']")
	public WebElement Quantitysel;
	@FindBy(xpath="//*[@id='dropdown1_2']")
	public WebElement itemSelect;
	
	private WebDriver driver;
	
	public AmazonEditBasketPage(WebDriver driver){
		this.driver= driver;
		
	}
	
	public AmazonProceedToCheckOut editBasket(){
		Quantitysel.click();
		itemSelect.click();
		
		return PageFactory.initElements(driver, AmazonProceedToCheckOut.class);
		
	}

}
