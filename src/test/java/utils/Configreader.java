package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

	public static Properties prop;
	private final static String propertyFilePath = "/Users/machome/git/numpy_ninja_ds_algo/src/test/resources/config/config.properties";
	private static String browserType = null;

	public static void readConfig() throws Throwable{
		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			prop = new Properties();

			try {
				prop.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config.properties not found at" + propertyFilePath);
		}
	}
	// Browser Type
	public static void setbrowser(String browser) {
		browserType = browser;
	}
	public static String getbrowser() throws Throwable {
		String browserType = prop.getProperty("browser");
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
	
	// Base URL
		public static String applicationUrl() {
			String url = prop.getProperty("baseurl");
			if (url != null)
				return url;
			else
				throw new RuntimeException("url not specified in the Config.properties file");
		}

		// HomePage URL
		public static String homePage() {
			String homePageurl = prop.getProperty("homepageurl");
			if (homePageurl != null)
				return homePageurl;
			else
				throw new RuntimeException("HomePageurl not specified in the Config.properties file");
		}
		
		//ResisterPage URL
		
		public static String ResisterPage(){
			String resisterurl=prop.getProperty("resisterurl");
			if (resisterurl != null)
				return resisterurl;
			else 
				throw new RuntimeException("ResisterPage not specified in the Config.properties file");
		}
		
		//Excel reader
		
		public static String excelPath(){
			String excelpath=prop.getProperty("excelpath");
			if (excelpath != null)
				return excelpath;
			else 
				throw new RuntimeException("ResisterPage not specified in the Config.properties file");
		}
		public static String getexcelfilepath() {
			String excelfilelpath = prop.getProperty("excelFilePath");
			if (excelfilelpath != null)
				return excelfilelpath;
			else
				throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
		}
		
		//SigninPage URL
		
		public static String SigninPage(){
			String signinurl=prop.getProperty("signinurl");
			if (signinurl != null)
				return signinurl;
			else 
				throw new RuntimeException("ResisterPage not specified in the Config.properties file");	
	}
		//Array URL
		public static String arrayPageURL() {
			String arrayPageurl = prop.getProperty("Arraypage");
			if (arrayPageurl != null)
				return arrayPageurl;
			else
				throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
		}
		
		// Array - Tryeditor
		public static String tryEditorURL() {
			String tryeditorurl = prop.getProperty("TryEditorPage");
			if (tryeditorurl != null)
				return tryeditorurl;
			else
				throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
		}

		public static String geturl(String pagename) {
			String url = prop.getProperty(pagename);
			if (url != null)
				return url;
			else
				throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
		}
		// Linked list
		public static String getLinkedListUrl() {
			String linkedlisturl = prop.getProperty("linkedlisturl");
			if (linkedlisturl != null)
				return linkedlisturl;
			else
				throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
		}

	
}
	

