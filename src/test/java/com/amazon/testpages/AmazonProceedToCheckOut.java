package com.amazon.testpages;


import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProceedToCheckOut {
private WebDriver driver;
	
	@FindBy(name="proceedToCheckout")
	private WebElement chekout;;
	
	public AmazonProceedToCheckOut(WebDriver driver) {
		this.driver = driver;
	}

	public AmazonProceedToCheckOut ProceedToCheckout() {
		// TODO Auto-generated method stub
		System.out.println("proceed to checkout");
		chekout.click();
		 //Assert.assertEquals(driver.getTitle(), "Amazon.co.uk Shopping Basket");
		return PageFactory.initElements(driver, AmazonProceedToCheckOut.class);
	}

}
