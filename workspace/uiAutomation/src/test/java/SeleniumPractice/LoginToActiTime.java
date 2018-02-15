package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToActiTime {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://facebook.com");
		//Thread.sleep(7000);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dharitreesahoo1@gmail.com");
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		driver.quit();

		
	}

}
