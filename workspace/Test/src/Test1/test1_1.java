package Test1;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1_1 {
	WebDriver driver;
@BeforeMethod
public void login()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	driver.findElement(By.name("identifier")).sendKeys("dharitreesahoo1");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.name("password")).sendKeys("myfather1978");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	System.out.println("Login Successful");	
}
@Test
public void ClickUser()
{
	
	System.out.println("clickUser");
}
@AfterMethod()
public void logout()
{
	System.out.println("After method executed");
	driver.close();
}
{
	
}

}
