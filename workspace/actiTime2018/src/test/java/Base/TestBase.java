package Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	//////////////////// Load properties file/////////////////////////////
	static Properties properties;
	static WebDriver driver;

	public static void loadData() throws IOException {
		properties = new Properties();
		File f = new File("C:/Users/home/workspace/actiTime2018/config.properties");
		FileReader r = new FileReader(f);
		properties.load(r);
	}

	public static String getData(String Data) throws IOException {
		loadData();
		String strValue = properties.getProperty(Data);
		return strValue;

	}
	///////////////////////////// driver//////////////////////////////////////
	
	public static void loadDriver(String strDriver)
	{
		if(strDriver.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver.exe");
			driver = new ChromeDriver();
		}
	}


}
