package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookFriendCount {
	@Test
	public void countLinks() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		WebDriver fd = new ChromeDriver();
		fd.get("http://facbook.com");
	

	        List<WebElement> links=fd.findElements(By.tagName("a"));
	        System.out.println("no of links:" +links.size());

	        for(int i=0;i<links.size();i++)
	        {
	            if(!(links.get(i).getText().isEmpty()))
	            {
	            links.get(i).click();
	            Thread.sleep(2000);
	            fd.navigate().back();
	            links=fd.findElements(By.tagName("a"));
	            }       
	        }
		
		
		

	}
}
