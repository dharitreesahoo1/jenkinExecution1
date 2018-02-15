/**
 * 
 */
package com.Test.Automation.uiAutomation.uiAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author home
 *
 */
public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	@FindBy(xpath="//input[@id='email']")
	WebElement userName;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwrd;
	@FindBy(xpath="//button[@name='SubmitLogin']")
	WebElement submitBtn;
	@FindBy(id="email_create")
	WebElement emailAddress;
	
	@FindBy(id="SubmitCreate")
	WebElement btnCreateAnAccount;
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(xpath="//li[text()='Authentication failed.']")
	WebElement authenticationFailed;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApp(String user,String password)
	{
		try {
			signIn.click();
			userName.sendKeys(user);
			passwrd.sendKeys(password);
			submitBtn.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getLoginInvalidText()
	{
		return authenticationFailed.getText();
		
	}
	public void createAccount(String email,String firstname,String lastname)
	{
		emailAddress.sendKeys(email);
		btnCreateAnAccount.click();
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
	}
	

}
