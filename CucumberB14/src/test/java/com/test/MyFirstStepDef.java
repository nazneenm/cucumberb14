

package com.test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class MyFirstStepDef {
	
	
  WebDriver driver;
  
  
  
  @Given("^user need to be on facebook login page$")
	 public void method1(){
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver_64\\geckodriver.exe");
		driver = new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	}
	@When("^user enters first name$")
	public void method2(){
		driver.findElement(By.name("firstname")).sendKeys("Simeon");
	}
	
	@Then("^user checks if first name is present$")
	public void method3(){ 
	   String userNameActual =   driver.findElement(By.name("firstname")).getAttribute("value");
	   Assert.assertEquals("Simeon",userNameActual);
	
	}
}