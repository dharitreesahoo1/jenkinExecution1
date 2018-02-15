package TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
//@Listeners(TestNGListener.TestNGListenerClass.class)
public class MyFirstTC {
	
	@Test
	public void GoogleTitleVerify(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
	@Test
	public void TitleMatch(){
	Assert.assertTrue(false);
		
		
	}

}
