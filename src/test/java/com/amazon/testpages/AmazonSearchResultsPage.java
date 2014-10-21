package com.amazon.testpages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchResultsPage {

	private WebDriver driver;
	
	@FindBy(css="#result_2 .title a")
	private WebElement ResultTitle;
	@FindBy(xpath="//*[@id='atfResults']")
	private WebElement ResultItemList;
	
	public AmazonSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/*public String getTopResultTitle() {
		List<WebElement> list =ResultItemList.findElements(By.tagName("li"));
		System.out.println(list.get(2).getText());
		Assert.assertEquals(list.get(2).getText(), drivr.getTitle());
		return list.get(2).getText();
	}*/
	
	public AmazonSelectedItemPageDisplay ClickOnSearchresult(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	  List<WebElement> list =ResultItemList.findElements(By.tagName("li"));
  	  for(int i=0; i<=list.size();i++){
  		if(i==2){
  	  String link=list.get(0).findElement(By.tagName("a")).getAttribute("href");
  	   driver.navigate().to(link);

  		         }
  	           }
		return PageFactory.initElements(driver, AmazonSelectedItemPageDisplay.class);
		
	}

}
