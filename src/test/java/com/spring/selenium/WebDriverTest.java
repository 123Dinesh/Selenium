package com.spring.selenium;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverTest {

 WebDriver driver;
 
 	@BeforeClass
	public void testSetUp() {
 	 System.setProperty("webdriver.chrome.driver","C:\\dinesh\\chromedriver.exe");
 	 driver = new ChromeDriver();
	}
 
 
  @Test
  public void loginWithCorrectCredential() {

   driver.get("http://localhost:8080/SpringRestService/login.html");
  
   WebElement usernameElement= driver.findElement(By.name("userid"));
   WebElement passwordElement= driver.findElement(By.name("pswrd"));
   WebElement button = driver.findElement(By.name("login"));
  
   usernameElement.sendKeys("dinesh");
   passwordElement.sendKeys("sharma");

   button.click();  // submit by form element

 /* // Anticipate web browser response, with an explicit wait
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginResponse")));

   // Run a test
   String message= messageElement.getText();
   String successMsg = "Login Successfully";
   Assert.assertEquals (message, successMsg);*/
   
   // Conclude a test
   //driver.quit();

  }
  
  
  
  @Test
  public void loginWithWrongCredential() {
	  
   driver.get("http://localhost:8080/SpringRestService/login.html");
   WebElement usernameElement= driver.findElement(By.name("userid"));
   WebElement passwordElement= driver.findElement(By.name("pswrd"));
   WebElement button = driver.findElement(By.name("login"));
  
   usernameElement.sendKeys("dinesh");
   passwordElement.sendKeys("sh22arma");

   button.click();  // submit by form element
  }
  
  @Test
  public void resetForm() {
	  driver.get("http://localhost:8080/SpringRestService/login.html");
	   WebElement usernameElement= driver.findElement(By.name("userid"));
	   WebElement passwordElement= driver.findElement(By.name("pswrd"));
	   WebElement button = driver.findElement(By.name("reset"));
	  
	   usernameElement.sendKeys("dinesh");
	   passwordElement.sendKeys("sh22arma");	  
  
   button.click();  // submit by form element
  }
  
  	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}