package com.stctv.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stctv.qa.base.TestBase;
import com.stctv.qa.config.stctvConstants;
import com.stctv.qa.pages.LoginPage;
import com.stctv.qa.pages.SignUpPage;
import com.stctv.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	Logger log = Logger.getLogger(LoginPageTest.class);
	String message = "";

	public LoginPageTest() {
		super();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/resources/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();

	}

	// validate the title of the application in login page
	@Test

	public void loginPageTitleTest() {
		try {
			String loginPageTitle = loginpage.validateLoginPageTitle();
			log.info("login page title is ---------->" + loginPageTitle);
			Assert.assertEquals(loginPageTitle, TestUtil.LOGINPAGETITLE);
		} catch (Exception exception) {
			log.error("Exception occurred during execution!!! Reason -----> " + exception.getMessage());
			message = exception.getMessage();
			log.info("Test Case failed due to " + message);
		}
	}

	// Validate whether we can select country Bahrain
	@Test
	public void validateCountryBahrain() throws InterruptedException {
		try {
			String actualcountry = loginpage.selectBahrain().toLowerCase();
			log.info("Actual Country is ----->" + actualcountry);
			// String expectedcountryBH = "bahrain";
			log.info("Expected Country is ----->" + prop.getProperty("expectedcountryBH"));
			if (prop.getProperty("expectedcountryBH") == null) {
				throw new NullPointerException("test");
			}
			Assert.assertEquals(actualcountry, prop.getProperty("expectedcountryBH"));

		} catch (AssertionError e) {
			log.info("Test case execution failed");
			throw e;
		}
		log.info("Test case execution passed");
	}

	// Validate whether we can select country ksa
	@Test
	public void validateCountryKSA() throws InterruptedException {
		try {
		String actualcountry = loginpage.selectKSA().toLowerCase();
		log.info("Actual Country is ----->" + actualcountry);
		String expectedcountry = "ksa";
		log.info("Expected Country is ----->" + prop.getProperty("expectedcountryKSA"));
		if (prop.getProperty("expectedcountryKSA") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(actualcountry, prop.getProperty("expectedcountryKSA"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether we can select country kuwait
	@Test
	public void validateCountryKuwait() throws InterruptedException {
		try {
		String actualcountry = loginpage.selectKuwait().toLowerCase();
		log.info("Actual Country is ----->" + actualcountry);
		log.info("Expected Country is ----->" + prop.getProperty("expectedcountryKSA"));
		if (prop.getProperty("expectedcountryKW") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(actualcountry, prop.getProperty("expectedcountryKW"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");


	}

	// Validate whether the SAR Price displayed for lite package is correct
	@Test
	public void validateLitePackagePriceForSAR() throws InterruptedException {
		try {
		String price = loginpage.litePackagePriceinSAR();
		log.info("Actual Lite Package price is: " + price + "SAR");
		log.info("Expected price is ----->" + prop.getProperty("litePackageExpectedPriceKSA"));
		if (prop.getProperty("litePackageExpectedPriceKSA") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("litePackageExpectedPriceKSA"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether the SAR Price displayed for classic package is correct
	@Test
	public void validateClassicPackagePriceForSAR() throws InterruptedException {
		try {
		String price = loginpage.classicPackagePriceinSAR();
		log.info("CLassic Package price is: " + price + "SAR");
		log.info("Expected price is ----->" + prop.getProperty("classicPackageExpectedPriceKSA"));
		if (prop.getProperty("classicPackageExpectedPriceKSA") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("classicPackageExpectedPriceKSA"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether the SAR Price displayed for premium package is correct
	@Test
	public void validatepremiumPackagePriceForSAR() throws InterruptedException {
		try {
		String price = loginpage.premiumPackagePriceinSAR();
		log.info("Premium Package price is: " + price + "SAR");
		log.info("Expected price is ----->" + prop.getProperty("premiumPackageExpectedPriceKSA"));
		if (prop.getProperty("premiumPackageExpectedPriceKSA") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("premiumPackageExpectedPriceKSA"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether the KWD Price displayed for lite package is correct
	@Test
	public void validateLitePackagePriceForKWD() throws InterruptedException {
		try {
		String price = loginpage.litePackagePriceinKWD();
		log.info("Actual Lite Package price is: " + price + "KWD");
		log.info("Expected price is ----->" + prop.getProperty("litePackageExpectedPriceKW"));
		if (prop.getProperty("litePackageExpectedPriceKW") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("litePackageExpectedPriceKW"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether the KWD Price displayed for classic package is correct
	@Test
	public void validateClassicPackagePriceForKWD() throws InterruptedException {
		try {
		String price = loginpage.classicPackagePriceinKWD();
		log.info("Actual Classic Package price is: " + price + "KWD");
		log.info("Expected Price is ----->" + prop.getProperty("classicPackageExpectedPriceKW"));
		if (prop.getProperty("classicPackageExpectedPriceKW") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("classicPackageExpectedPriceKW"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}


	// Validate whether the KWD Price displayed for premium package is correct
	@Test
	public void validatepremiumPackagePriceForKWD() throws InterruptedException {
		try {
		String price = loginpage.premiumPackagePriceinKWD();
		log.info("Actual Premium Package price is: " + price + "KWD");
		log.info("Expected Price is ----->" + prop.getProperty("premiumPackageExpectedPriceKW"));
		if (prop.getProperty("premiumPackageExpectedPriceKW") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("premiumPackageExpectedPriceKW"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether the BHD Price displayed for lite package is correct
	@Test
	public void validateLitePackagePriceForBHD() throws InterruptedException {
		try {
		String price = loginpage.litePackagePriceinBHD();
		log.info("Actual Lite Package price is: " + price + "BHD");
		log.info("Expected Price is ----->" + prop.getProperty("litePackageExpectedPriceBHD"));
		if (prop.getProperty("litePackageExpectedPriceBHD") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("litePackageExpectedPriceBHD"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate whether the BHD Price displayed for classic package is correct
	@Test
	public void validateClassicPackagePriceForBHD() throws InterruptedException {
		try {
		String price = loginpage.classicPackagePriceinBHD();
		log.info("Actual CLassic Package price is: " + price + "BHD");
		log.info("Expected Price is ----->" + prop.getProperty("classicPackageExpectedPriceBHD"));
		if (prop.getProperty("classicPackageExpectedPriceBHD") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("classicPackageExpectedPriceBHD"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");
	}

	// Validate whether the BHD Price displayed for premium package is correct
	@Test
	public void validatepremiumPackagePriceForBHD() throws InterruptedException {
		try {
		String price = loginpage.premiumPackagePriceinBHD();
		log.info("Actual Premium Package price is: " + price + "BHD");
		log.info("Expected Price is ----->" + prop.getProperty("premiumPackageExpectedPriceBHD"));
		if (prop.getProperty("premiumPackageExpectedPriceBHD") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(price, prop.getProperty("premiumPackageExpectedPriceBHD"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");
	}

	// Validate the subscription type is lite
	@Test
	public void subscriptionTypeLite() {
		try {
		//String expectedResponse = "lite";
		String actualResponse = loginpage.subscriptionTypeLite().toLowerCase();
		log.info("Actual Subscription Type is :" + actualResponse);
		log.info("Expected Subscription Type is ----->" + prop.getProperty("subscriptionTypeLite"));
		if (prop.getProperty("subscriptionTypeLite") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(actualResponse, prop.getProperty("subscriptionTypeLite"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");
	}

	// Validate the subscription type is Classic
	@Test
	public void subscriptionTypeClassic() {
		try {
		//String expectedResponse = "classic";
		String actualResponse = loginpage.subscriptionTypeClassic().toLowerCase();
		log.info("Actual Subscription Type is :" + actualResponse);
		// subscriptionTypeLite
		log.info("Expected Subscription Type is ----->" + prop.getProperty("subscriptionTypeClassic"));
		if (prop.getProperty("subscriptionTypeClassic") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(actualResponse, prop.getProperty("subscriptionTypeClassic"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	// Validate the subscription type is Premium
	@Test
	public void subscriptionTypePremium() {
		try {
		//String expectedResponse = "premium";
		String actualResponse = loginpage.subscriptionTypePremium().toLowerCase();
		log.info("Subscription Type is :" + actualResponse);
		log.info("Expected Subscription Type is ----->" + prop.getProperty("subscriptionTypePremium"));
		if (prop.getProperty("subscriptionTypePremium") == null) {
			throw new NullPointerException("test");
		}
		Assert.assertEquals(actualResponse, prop.getProperty("subscriptionTypePremium"));

	} catch (AssertionError e) {
		log.info("Test case execution failed");
		throw e;
	}
	log.info("Test case execution passed");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
