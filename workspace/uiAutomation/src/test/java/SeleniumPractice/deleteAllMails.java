package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class deleteAllMails {
	@Test
	public void deleteAllMails() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.sharklasers.com/inbox");
		driver.findElement(By.xpath("//span[@id='inbox-id']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='inbox-id']/input")).sendKeys("abc");;
		driver.findElement(By.xpath("//span[@id='inbox-id']/button[1]")).click();
		Thread.sleep(2000);
		int vales = driver.findElements(By.xpath("//form[@class='email_list_form']/table/tbody/tr")).size();
		
		for(int i=1;i<vales;i++)
				{
			//String firstPath = "//form[@class='email_list_form']/table/tbody/tr["+i+"]/td[1]/input";
			driver.findElement(By.xpath("//form[@class='email_list_form']/table/tbody/tr["+i+"]/td[1]/input")).click();
				}
	}
	
	
	

}
