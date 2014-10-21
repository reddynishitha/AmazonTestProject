package com.amazon.testpages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	private WebDriver driver;
	
	@FindBy(name="field-keywords")
	private WebElement keywordsField;
	
	@FindBy(xpath="//[@class='nav-submit-input']")
	private WebElement goButton;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public AmazonSearchResultsPage searchFor(String searchTerm) {
		keywordsField.sendKeys(searchTerm);
		keywordsField.sendKeys(Keys.ENTER);
		//goButton.click();
		
		return PageFactory.initElements(driver, AmazonSearchResultsPage.class);
	}
	

	public static AmazonHomePage navigateTo(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.co.uk/");
		Assert.assertEquals(driver.getTitle(), "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more");
		driver.manage().window().maximize();
		return PageFactory.initElements(driver, AmazonHomePage.class);
	}
}
