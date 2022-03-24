package com.travelagileway.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.travelagileway.test.BaseClass;

public class LoginPage extends BaseClass {
	

By uname = (By.id("username"));
By pwd = (By.id("password"));
By login = (By.xpath("//*[@id='login-box']/p[4]/input"));

	public void LoginPage(WebDriver driver)
	{		
	}

	public void setUserName(){
		driver.findElement(uname).sendKeys("agileway");
		Logger.warn("Login is " + "agileway");
	}
	
	public void setPassword(){
		driver.findElement(pwd).sendKeys("testwise");
		Logger.error("password is " + "testwise");
		//TimeUnit.SECONDS.sleep(5);
	}
	
	public void setLoginBtn(){
		driver.findElement(login).click();	
		Logger.fatal("click login");
		//TimeUnit.SECONDS.sleep(5);	
	}
	
	public void login() {
		setUserName();
		setPassword();
		setLoginBtn();
	}
}
