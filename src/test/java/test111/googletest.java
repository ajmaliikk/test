package test111;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class googletest {
	private WebDriver driver;

	String appURL = "http://google.com";

	@BeforeClass

	public void testSetUp() {

	String exePath1 = "C:\\Users\\HP\\Desktop\\cts\\geckodriver.exe";

	System.setProperty("webdriver.gecko.driver", exePath1);

	driver = new FirefoxDriver();

	}

	@Test

	public void verifyGooglePageTittle() {

	driver.navigate().to(appURL);

	String getTitle = driver.getTitle();

	Assert.assertEquals(getTitle, "Google");

	}

	@AfterClass

	public void tearDown() {

	driver.quit();

	}

}
