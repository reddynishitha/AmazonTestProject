package com.amazon.tests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.FileInputStream;
import java.util.Properties;

import net.sf.cglib.transform.impl.AddPropertyTransformer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.html5.AddBrowserConnection;
import org.openqa.selenium.support.PageFactory;

import com.amazon.testpages.AddingProductsToBasket;
import com.amazon.testpages.AmazonChooseDeliveryOption;
import com.amazon.testpages.AmazonEditBasketPage;
import com.amazon.testpages.AmazonHomePage;
import com.amazon.testpages.AmazonLoginPage;
import com.amazon.testpages.AmazonProceedToCheckOut;
import com.amazon.testpages.AmazonRegistrationPage;
import com.amazon.testpages.AmazonSearchResultsPage;
import com.amazon.testpages.AmazonSelectDeliveryAdressPage;
import com.amazon.testpages.AmazonSelectedItemPageDisplay;

public class AmazonSearchTest {

	private WebDriver driver;
	Properties prop=null;

	@Before
	public void setupSelenium() {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\pptipi\\Nishitha selenium project\\browserversions\\chromedriver.exe");
		driver = new FirefoxDriver();

	}
	
	@After
	public void closeSelenium() {
		//driver.close();
		//driver.quit();
	}
	
	@Test public void
	search_amazon() {
		AmazonHomePage homepage= AmazonHomePage.navigateTo(driver);
		AmazonSearchResultsPage resultsPage = homepage.searchFor("iphone6");
		AmazonSelectedItemPageDisplay SearchResults= resultsPage.ClickOnSearchresult();
		AddingProductsToBasket addbasket = SearchResults.AddtoBasket();
		AmazonEditBasketPage editbasket = addbasket.ClickEdit();
		AmazonProceedToCheckOut checkout = editbasket.editBasket();
		checkout.ProceedToCheckout();
		AmazonLoginPage signinUser=PageFactory.initElements(driver, AmazonLoginPage.class);
		AmazonRegistrationPage registerUser=signinUser.NewCustomerSignIn("amazon5479@gmail.com");
		AmazonSelectDeliveryAdressPage selectAddress=registerUser.registerUser("amazon5479@gmail.com");
		AmazonChooseDeliveryOption selDelivery=selectAddress.selectAddress();
		selDelivery.chosedeliveryoption();
	
	}
	
}
