package actiTime2018;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupHandling {
	@Test
	public void popup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		String homePage =  driver.getWindowHandle();
		System.out.println("Main window is " +homePage);
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(homePage))
			{
			System.out.println(handle);
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("ICON Clinical Research")).click();
			}
		}
		
		
	}
	

}
