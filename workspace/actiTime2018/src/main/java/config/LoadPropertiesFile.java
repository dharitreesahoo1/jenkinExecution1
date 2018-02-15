package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {
	static Properties properties;
	
	public static void loadData() throws IOException
	{
		properties = new Properties();
		//File f =  new File(System.getProperty("usr.dir") +"config.properties");
		File f =  new File("C:\\Users\\home\\workspace\\actiTime2018\\config.properties");
		
		FileReader r =  new FileReader(f);
		properties.load(r);
	}
	
	public String getData(String Data) throws IOException
	{
		loadData();
		String strValue = properties.getProperty(Data);
		return strValue;
	
	}

}
