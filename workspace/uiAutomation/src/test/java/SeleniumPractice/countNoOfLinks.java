package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class countNoOfLinks {

@Test
public void countLinks()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://makemytrip.com");
	List<WebElement> links = driver.findElements(By.xpath("a"));
	System.out.println(links.size());
	driver.quit();
	
	/*for(int i=0;i<links.size();i++)
	{
		links.get(i).click();
		driver.navigate().back();
		links = driver.findElements(By.xpath("//a"));
	}
	*/
	
}

}
