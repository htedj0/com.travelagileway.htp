package com.travelagileway.test;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Logger Logger;
	
	@BeforeClass
	public void setup()	{
		//File file = new File("C:\\seleniumjars\\chromedriver.exe");
		String Projectpath = System.getProperty("user.dir");
		System.out.println();
		
		//System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());		
	    driver = new ChromeDriver();
	    
	    //setup log4j configuration property
	    Logger=Logger.getLogger(Log.class.getName());
	    PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void cleanup() {
		driver.close();
	}
}
