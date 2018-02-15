package actiTime2018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Initialization;

public class LoginTest {

	LoginPage loginPage;
	WebDriver driver;

	@BeforeTest
	public void setUP() throws InterruptedException
	{
		Initialization obj =  new Initialization();
		obj.init();
	}
	@Test
	public void login()
	{	
		loginPage = new LoginPage(driver);
		loginPage.loginToApp();
		
	}
}
		