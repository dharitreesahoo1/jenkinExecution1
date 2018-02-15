package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {
	WebDriver driver;
	@Test
	public void countLinks()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("http://jquery.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,900)");
		
	
	
		
	}

}
