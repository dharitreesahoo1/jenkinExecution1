	/**
 * 
 */
package com.Test.Automation.uiAutomation.homePage;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Test.Automation.uiAutomation.testBase.TestBase;
import com.Test.Automation.uiAutomation.uiAccess.HomePage;

/**
 * @author home
 *
 */
public class TC001_verifyLoginWithInvalidCredential extends TestBase{
	HomePage homePage;
	public static final Logger log =Logger.getLogger(TC001_verifyLoginWithInvalidCredential.class.getName());
	
	@BeforeTest
	public void setUp()
	{
		init();
	}
	@Test
	public void verifyLoginWithInvalidCredential() throws InterruptedException
	{
		homePage =  new HomePage(driver);
		homePage.loginToApp("abc@gamil.com", "password");
		String authenticationFailedMsg = "Authentication failed.";
		//Assert.assertEquals(homePage.getLoginInvalidText(), authenticationFailedMsg);
		homePage.createAccount("email", "firstname", "lastname");
	
	}
	
	@AfterTest
	public void endTest()
	{
		driver.quit();
	}
}


