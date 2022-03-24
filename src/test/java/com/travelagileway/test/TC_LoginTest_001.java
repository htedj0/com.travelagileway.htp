package com.travelagileway.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.travelagileway.pageobject.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void Travel() throws InterruptedException {
		Thread.sleep(3000);
	    driver.get("http://travel.agileway.net/");
	    Logger.info("URL is opened " + "http://travel.agileway.net/");
	    
		//calling POM 		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login();
	}
	
}
