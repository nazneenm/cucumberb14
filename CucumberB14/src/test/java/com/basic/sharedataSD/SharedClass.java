package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	
	@Before
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver_64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
