package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization {
	static String strDriver= "Chrome";
	static WebDriver driver;
	public static void init()
	{
		getDriver(strDriver);
		getURL();
	}

	private static void getURL() {
		driver.get("http://facebook.com");
			}

	private static void getDriver(String strDriver) {
		
		if(strDriver.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver.exe");
			driver = new ChromeDriver();
		}
				
	}
	

}
